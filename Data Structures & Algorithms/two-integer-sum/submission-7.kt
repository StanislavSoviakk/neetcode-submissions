class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = HashMap<Int, Int>()
        
        for (i in nums.indices){
            if(seen.contains(target - nums[i])) {
                return intArrayOf(seen[target-nums[i]]!!, i)
            }
            seen[nums[i]] = i
        }
        return intArrayOf(0,0)
        
    }
}
