class Solution {
    fun maxArea(heights: IntArray): Int {
            var maxA = 0
            var firstE = 0
            var lastE = heights.size-1
            while (firstE < lastE){
                val firstEl = heights[firstE]
                val lastEl = heights[lastE]
                val currentA = min(firstEl, lastEl) * (lastE - firstE)
                if (currentA > maxA) maxA = currentA
                if (firstEl < lastEl){
                    firstE++
                } else {
                    lastE--
                }
            }
            return maxA
    }
}
