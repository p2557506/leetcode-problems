class Solution {
    public String[] findRelativeRanks(int[] score) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        //Loop through score

        for(int i = 0; i < score.length; i++){
            //Store each socre in hash map and its position
            int num = score[i];
            hashMap.put(num,i);

        }

        //Each score and its position is stored
        //Eg ((5,0),(4,1),(3,2),(2,2))

        //Scores sorted in size smalles to largest
        Arrays.sort(score);
        
        String[] res = new String[score.length];

        //Loop backwards through since largest at end
        for(int i = score.length - 1; i >= 0; i--){
            int num = score[i];//Gets number
            int indexPos = hashMap.get(num);//Gets value of number key => its position
            if(i == score.length - 1){
                //It is largest so put in new array but in correct position which was stored in hash map
                res[indexPos] = "Gold Medal";

            } else if(i == score.length - 2){
                //It is largest so put in new array but in correct position which was stored in hash map
                res[indexPos] = "Silver Medal";
            }
          else if(i == score.length - 3){
                //It is largest so put in new array but in correct position which was stored in hash map
                res[indexPos] = "Bronze Medal";
        } else{
            res[indexPos] = Integer.toString(score.length - i) ;//Put score in position //i is 4  now and next will be 5
        }

    }

    return res;
}
}