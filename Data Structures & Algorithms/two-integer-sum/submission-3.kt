class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val difference = HashMap<Int, Int>()
        for ((i,n) in nums.withIndex()){
            val need = target - n
            if (difference.contains(need)) return intArrayOf(difference[need]!!, i)
            difference[n] = i
        }
        return intArrayOf(0,0)
    }
}
