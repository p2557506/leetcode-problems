class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int total = 0;
        for(int i = nums.length - 1; i > 0; i--){
            //Loop back
            total += Math.min(nums[i],(nums[i - 1]));
            i--;
        }
        return total;
    }
}