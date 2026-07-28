class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = HashMap<List<Int>, MutableList<String>>()

        for (i in strs){
            val key = MutableList(26) {0}
            for (c in i){
                key[c - 'a']++
            }
            if (!result.containsKey(key)){
                result[key] = mutableListOf()
            }
            result[key]!!.add(i)
        }
        return result.values.toList()
    }
}
