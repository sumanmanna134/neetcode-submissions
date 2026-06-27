class Solution {
    public int maxProduct(int[] nums) {
        int bestMaxEnding = nums[0];
        int bestMinEnding = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = bestMaxEnding * v1;
            int v3 = bestMinEnding * v1;

             bestMaxEnding = Math.max(v1, Math.max(v2, v3));
             bestMinEnding = Math.min(v1, Math.min(v2, v3));

            result = Math.max(result, Math.max(bestMaxEnding, bestMinEnding));
        }

        return result;
    }
}
