class Solution {
    public int missingNumber(int[] nums) {
        //Use of XOR 
        //xor all numbers in range

        int allxor = 0;

        for(int i = 0; i <= nums.length; i++){
            //Xor all numbers in
            allxor = allxor ^ i;
        }

        for(int num:nums){
            allxor = allxor ^ num;
        }

        return allxor;

        
    }
}