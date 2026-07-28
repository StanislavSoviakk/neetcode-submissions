class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val hm = HashMap<Int, Int>()
        for (i in numbers.indices){
            val difference = target - numbers[i]
            if (hm.containsKey(difference)) return intArrayOf(hm[difference]!!+1, i+1)
            hm[numbers[i]] = i
        }
        return intArrayOf(0,0)
    }
}
