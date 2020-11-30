// Problem: https://leetcode.com/problems/valid-anagram/


class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer>map = new HashMap<>(); 
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(map.containsKey(x)){
                int of  = map.get(x);
                map.put(x,of+1);
            }else{
                map.put(x,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char x = t.charAt(i); 
            if(map.containsKey(x)==false){
                return false;
            }else if(map.get(x)==1){
                map.remove(x);
            }else{
                int of  = map.get(x) - 1;
                map.put(x,of);
            }
        }
        if(map.size()==0){
            return true;
        }
        return false;
    }
}
