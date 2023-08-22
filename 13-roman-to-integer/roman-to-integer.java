class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer> map = new HashMap<>();
        //Insert roman character key and value inside hashmap
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //Loop through string
        //Initialise result as first value at end of string
        int result = map.get(s.charAt(s.length() - 1));

        for(int i = s.length() -2; i >= 0; i--){
            //Compare both characters
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                result -= map.get(s.charAt(i));
            } else{
                result += map.get(s.charAt(i));
            }
        }

        return result;
}
}