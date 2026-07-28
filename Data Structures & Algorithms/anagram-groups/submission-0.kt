class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = HashMap<String, MutableList<String>>()
        for (i in strs){
            val srtd = i.toCharArray().sorted().toString()
            if (!result.containsKey(srtd)){
                result[srtd] = mutableListOf()
            }
            result[srtd]!!.add(i)
        }
        return result.values.toList()
    }
}
