class Solution {
    public void sortColors(int[] nums) {
     int zero = 0, one = 0, two = 0;
     for(int num : nums){
        switch(num){
            case 0:
                zero++;
                break;
            case 1:
                one++;
                break;
            case 2:
                two++;
                break;
        }
     }
     int i = 0;

     while(zero != 0){
        nums[i] = 0;
        i++;
        zero--;
     }
     while(one != 0){
        nums[i] = 1;
        i++;
        one--;
     }
     while(two != 0){
        nums[i] = 2;
        i++;
        two--;
    }
        
    }
}