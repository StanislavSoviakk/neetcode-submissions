class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
                val hs = nums.toHashSet()
        return (hs.size < nums.size)
    }
}
