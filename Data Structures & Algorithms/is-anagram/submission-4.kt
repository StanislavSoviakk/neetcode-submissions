class Solution {
        fun isAnagram(s: String, t: String): Boolean {
            if(s.length != t.length) return false
            val lettersCount = IntArray(26)
            for(i in s.indices){
                lettersCount[s[i] - 'a']++
                lettersCount[t[i] - 'a']--
            }
            return lettersCount.all { it == 0 }
        }
}
