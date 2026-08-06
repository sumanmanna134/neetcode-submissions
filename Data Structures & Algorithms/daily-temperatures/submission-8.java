class Solution {
    //stack
    //36>arr[2]//30
    // pop 3-2
    //arr[2]= 1
    //1,
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int j = stack.pop(); //0
                res[j] = i-j;

            }

            stack.push(i);
        }

        return res;
    }
}
