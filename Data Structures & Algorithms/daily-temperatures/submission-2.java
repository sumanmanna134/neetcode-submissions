class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int next=0;
        int[] maxTemp = new int[temp.length];
        int n = temp.length-1;
        for(int i=0;i<n;i++){
            next=i+1;
            while (next<n && temp[i]>=temp[next]){
                next++;
            }
            
            if(temp[next]>temp[i]){
                maxTemp[i] = next - i;
            }
            


        }
        return maxTemp;
    }
}
