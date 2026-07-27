class Solution {
    public int trap(int[] height) {
        int maxLeftHeight=0,maxRightHeight=0;
        int maxTrapWater=0;
        int n = height.length;
        int left=0,right= n-1;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>maxLeftHeight){
                    maxLeftHeight=height[left];
                }else{
                    maxTrapWater += maxLeftHeight - height[left];
                }
                left++;
            }else{
                if(height[right]>maxRightHeight){
                    maxRightHeight = height[right];
                }else{
                    maxTrapWater +=maxRightHeight - height[right];
                }
                right--;
            }
        }
        return maxTrapWater;
    }
}
