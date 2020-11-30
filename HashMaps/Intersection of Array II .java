//https://leetcode.com/problems/intersection-of-two-arrays-ii/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ;i<nums1.length;i++){
            int x = nums1[i];
            if(map.containsKey(x)){
                int of = map.get(x);
                map.put(x,of+1);
            }else{
                map.put(x,1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])!=0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] ans = new int[list.size()];
        for(int i =0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
