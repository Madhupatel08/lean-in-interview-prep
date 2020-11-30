class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int j=0;j<nums1.length;j++){
            int x = nums1[j];
                for(int i = 0 ; i<nums2.length;i++){
                    if(x== nums2[i]){
                        map.put(x,1);
                    }
                }
        }
        int[] ans = new int[map.size()];
        int i = 0;
        for(int x:map.keySet()){
            ans[i] = x;
            i++;
        }
        return ans;
    }
}
