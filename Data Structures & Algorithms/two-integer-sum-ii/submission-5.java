class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int left=0, right=n-1;
        while (left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }else if(target>sum){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
