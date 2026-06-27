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

/*
At every index ask only one question

      "Should I carry yesterday's sum,
       or should I start a new journey today?"

carry = bestEnding + nums[i]
new   = nums[i]

bestEnding = max(carry, new)
ans = max(ans, bestEnding)


                  nums[i]

                      │
                      ▼
      Is previous sum helping me?

          /                    \
        YES                    NO
         │                      │
         ▼                      ▼
Continue previous        Start new subarray

bestEnding += nums[i]      bestEnding = nums[i]
**/
