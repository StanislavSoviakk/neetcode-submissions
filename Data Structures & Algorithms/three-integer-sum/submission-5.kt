class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val sorted = nums.sorted()
        for (i in 0..sorted.size-2){
            var j = i+1
            var k = nums.size-1
            while (j<k){
                val currentVal = sorted[i] + sorted[j] + sorted[k]
                if (currentVal == 0){
                    val target = listOf(sorted[i],sorted[j],sorted[k])
                    if(!result.contains(target)){
                        result.add(target)
                    }
                    j++
                } else {
                    if (currentVal > 0) k--
                    if (currentVal < 0) j++
                }
                
            }
        }
        return result
    }
}
