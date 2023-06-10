class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //No dupes
        HashSet<Integer> set = new HashSet();
        ArrayList<Integer> ans = new ArrayList();
        
        for(int i =0; i < nums1.length; i++){
            //Add all elent in nums1 into hashset
            set.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++){
            //If set contains element in 2nd array,Common found
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
                //Remove so no dupes can be added to ans list
                set.remove(nums2[i]);
            }
        }
        //Declare new array size of ans since it will now hold correct number
        int [] arr = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++){
            //Copies all elements in arraylist over to array
            arr[i] = ans.get(i);
        }

        return arr;
    }
}