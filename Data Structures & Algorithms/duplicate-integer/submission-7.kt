class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for (num in nums){
            if (seen.add(num).not()) return true
        }
        return false
    }
}
