class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val difference = HashMap<Int, Int>()
        for (i in nums.indices){
            val need = target - nums[i]
            if (difference.contains(need)) return intArrayOf(difference[need]?:0 ,i)
            difference[nums[i]] = i
        }
        return intArrayOf(0,0)
    }
}
