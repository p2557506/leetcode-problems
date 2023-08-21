class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Merge arrays nums1 and nums2
        int counter = 0;
        for(int i = m; i < nums1.length; i++){
            
            nums1[i] = nums2[0 + counter];
            counter++;
        }

        //Now, sort array
     
        Arrays.sort(nums1);
    }
}