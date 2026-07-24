class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        // [1,2,3,4] target = 3
        // [1,2] => [1,2] =
        int n = numbers.length;
        for(int i=0;i<n-1;i++){
            int complement = target - numbers[i];
            int idex = getCorrectHalfSpace(numbers,i+1,n-1, complement);
            if(idex!=-1){
                return new int[]{i+1, idex+1};
            }
        }
        return new int[]{-1,-1};
    }
    private static int getCorrectHalfSpace(int[] numbers,int left, int right, int target){
        while(left<=right){ // 4 -
            int mid = left + (right-left)/2;
            if(target==numbers[mid]){
                return mid;
            }
            else if(target < numbers[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return -1;
    }

}
