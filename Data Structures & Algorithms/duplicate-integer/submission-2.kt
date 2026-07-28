class Solution {
    fun hasDuplicate(nums: IntArray): Boolean = (nums.toHashSet().size < nums.size)
    
}
