//Grokking the coding interview - Smallest Subarray With a Greater Sum (easy)
//https://leetcode.com/problems/minimum-size-subarray-sum/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int sizeOfMinSubArr = Integer.MAX_VALUE;
        int windowStart = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            while(sum >= target){
                sizeOfMinSubArr = Math.min(sizeOfMinSubArr, i - windowStart + 1);
                sum-= nums[windowStart];
                windowStart++;
            }

        }
        return sizeOfMinSubArr == Integer.MAX_VALUE ? 0 : sizeOfMinSubArr;
    }
}

//Grokking the coding interview - Smallest Subarray With a Greater Sum (easy)