class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        concept of comutative frequency
        complexity == O(n^2) but better approach is also there using hashmaps
        int count = 0;
        int[] freq = new int[nums.length + 1];
        int sum = 0;int len = 0;
        for(int i = 1 ;i <= nums.length;i++){
             sum += nums[i -1];
            freq[i] = sum;
        }
        for(int i = 0 ; i < freq.length ; i++){
            for(int j = i+1 ; j < freq.length ; j++){
                if(freq[j] - freq[i] == k){
                    count++;
                }
            }
        }
        return count;  
        
    }
}
