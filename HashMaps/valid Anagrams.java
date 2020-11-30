// Problem: https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        
        HashMap<Character,String>map = new HashMap<>();
        HashMap<String,Boolean>map1 = new HashMap<>();
        for(int i = 0 ; i < words.length;i++){
            char x = pattern.charAt(i);
            String y = words[i];
            if(map.containsKey(x)){
                String cc = map.get(x);
                if(cc.equals(y) == false){
                    return false;
                }    
            }else{
                if(map1.containsKey(y)==true){
                    return false;
                }else{
                    map.put(x,y);
                    map1.put(y,true); 
                } 
            }
        }
        return true;
    }
}
