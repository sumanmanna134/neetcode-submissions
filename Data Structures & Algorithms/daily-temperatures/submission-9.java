class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int next=0;
        int[] maxTemp = new int[temp.length];
        int n = temp.length;
        for(int i=0;i<n;i++){
            next=i+1;
            while (next<n && temp[i]>=temp[next]){
                next++;
            }
            
            if (next < n) {
                maxTemp[i] = next - i;
            }
            


        }
        return maxTemp;
    }
}
