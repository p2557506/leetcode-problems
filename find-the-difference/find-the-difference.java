class Solution {
    public char findTheDifference(String s, String t) {
        //Bit manipulation
        /**
        int a = 0;
        int b = 0;

        for(char c : s){
            a += c;
        }

        for(char c : t){
            b += c;
        }

        return b - a;

         */

         char xor = 0;
         
         for(char c:s.toCharArray()) xor ^= c;
         for(char c:t.toCharArray()) xor ^= c;

         return xor;

    }
}