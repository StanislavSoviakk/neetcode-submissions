class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val lastPosition = mutableMapOf<Char, Int>()

        var left = 0
        var longest = 0

        for (right in s.indices) {
            val char = s[right]

            if (lastPosition.containsKey(char)) {
                left = max(left, lastPosition[char]!! + 1)
            }

            longest = max(longest, right - left + 1)

            lastPosition[char] = right
        }

        return longest
    }
}
