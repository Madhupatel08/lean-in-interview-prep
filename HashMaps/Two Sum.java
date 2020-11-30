//link : https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int restSum=target-nums[i];
            if(map.containsKey(restSum) && map.get(restSum)!=i){
                return new int[] {i,map.get(restSum)};
              }
            // map.put(nums[i],i);
            }
          throw new IllegalArgumentException("No two sum solution");
        }
       
    }
