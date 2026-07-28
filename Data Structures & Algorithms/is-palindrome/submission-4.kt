class Solution {
    fun isPalindrome(s: String): Boolean {
         var leftPoint = 0
        var rightPointer = s.length-1
        while (leftPoint < rightPointer){
            if (!s[leftPoint].isLetterOrDigit()){
                leftPoint++
                continue
            }
            if (!s[rightPointer].isLetterOrDigit()){
                rightPointer--
                continue
            }
            if (!s[leftPoint].equals(s[rightPointer], true)) return false
            leftPoint++
            rightPointer--
        }
        return true
    }
}
