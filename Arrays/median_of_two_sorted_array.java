class Solution {
   //basic approach //see the other approach on leetcode 
   //https://leetcode.com/problems/median-of-two-sorted-arrays/
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;int j=0;
        int arr[]=new int[nums1.length + nums2.length];int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]< nums2[j]){
                arr[k]=nums1[i];
                i++;k++;
            }else{
                arr[k]=nums2[j];
                j++;k++;
            }
        }
        while(i<nums1.length){
            arr[k]=nums1[i];
            i++;k++;
        }
        while(j<nums2.length){
            arr[k]=nums2[j];
            j++;k++;
        }
        for(int m=0;m<arr.length;m++){
            if(arr.length%2==1){
                return arr[arr.length/2];
            }else if(arr.length%2==0){
                int size=arr.length;
                int x=arr[size/2];
                //int x=2;
                //int y=3;
                int c=size/2;
                int y=arr[c-1];
                return (x+y)/2.0;
            }
        }
        return 0.0;
    }
}
