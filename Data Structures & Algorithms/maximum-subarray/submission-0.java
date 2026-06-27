class Solution {
    public int maxSubArray(int[] nums) {
        int bestEnding=nums[0]; // -1
        int ans =nums[0]; // 2
        for(int i=1;i<nums.length;i++){
            int withBestEnding = bestEnding+nums[i]; // -1
            int withoutBestEnding = nums[i]; // -3

            bestEnding = Math.max(withBestEnding, withoutBestEnding);// -1
            ans = Math.max(bestEnding, ans); // 2
        }

        return ans;

    }
}
