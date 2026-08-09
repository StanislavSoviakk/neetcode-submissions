class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val count = mutableMapOf<Char, Int>()
        var maxFreq = 0
        var left = 0
        var result = 0
        for (right in s.indices){
            count[s[right]] = (count[s[right]]?:0) + 1

            maxFreq = maxOf(maxFreq, count[s[right]]!!)
            while (right - left + 1 - maxFreq > k){
                count[s[left]] = count[s[left]]!! - 1
                left++
            }

            result = maxOf(result, right - left + 1)
        }
        return result
    }
}
