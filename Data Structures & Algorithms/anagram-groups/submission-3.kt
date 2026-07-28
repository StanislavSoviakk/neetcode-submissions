class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = HashMap<List<Int>, MutableList<String>>()

    for (word in strs) {
        val key = IntArray(26)

        for (c in word) {
            key[c - 'a']++
        }

        result.getOrPut(key.toList()) { mutableListOf() }.add(word)
    }

    return result.values.toList()
}
}
