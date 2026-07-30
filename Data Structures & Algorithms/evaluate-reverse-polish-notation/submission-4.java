class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
         for(String ch: tokens){
             if(ch.matches("-?\\d+")){
                 int num = Integer.parseInt(ch);
                 stack.push(num);
             }else{
                     int secondTop = stack.pop();
                     int firstTop = stack.pop();
                     int result = evaluateWithOperator(firstTop,secondTop, ch);
                     stack.push(result);

             }

         }
         return stack.peek();
    }

     private static int evaluateWithOperator(int e1, int e2, String operator){
        return switch (operator) {
            case "+" -> e1 + e2;
            case "-" -> e1 - e2;
            case "*" -> e1 * e2;
            default -> e1 / e2;
        };
    }
}
