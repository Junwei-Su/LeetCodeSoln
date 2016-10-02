// Given an array of integers, every element appears twice except for one. Find that single one.

public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        else{
            int index = 0;
            while(true){
                boolean found = true;
                for(int index1=0; index1<index; index1++){
                    if(nums[index1]-nums[index]==0){
                        found=false;
                        break;
                    }
                }
                for(int index2=index+1; index2<nums.length; index2++){
                    if(nums[index2]-nums[index]==0){
                        found=false;
                        break;
                    }
                }
                if(found){
                    return nums[index];
                }
                index++;
            }
        }
    }
    
}