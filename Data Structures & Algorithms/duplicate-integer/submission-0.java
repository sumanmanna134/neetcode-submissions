class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }

        return false;

    }
}