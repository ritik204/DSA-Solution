class Solution {
    public int findPeakElement(int[] nums) {
        int size = nums.length;
        int left = 0;
        int mid ;
        int right = size-1;
        while(left<=right){
            mid = left + (right - left) / 2;
            if(mid > 0 && nums[mid-1]>nums[mid]){
                right = mid -1 ;
            }else if(mid < size -1 && nums[mid]<nums[mid+1]){
              left = mid +1;
            }else{
                return mid;
            }
        }
        return 0;
    
    }
}