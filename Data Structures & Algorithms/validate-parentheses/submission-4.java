class Solution {
public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()<=1) return false;
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(isOpeningBraces(currentChar)){
                stack.push(currentChar);
            }else{
                if(!stack.isEmpty()){
                    char poppedBrace = stack.pop();
                    if(!isMatchBraces(poppedBrace, currentChar)){
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }

    private boolean isOpeningBraces(char ch){
        if(ch=='(' || ch=='{' || ch=='['){
            return true;
        }
        return false;
    }

     private static boolean isMatchBraces(char open, char closed){
        return open == '(' && closed == ')' || open == '{' && closed == '}' || open == '[' && closed == ']';
    }
}
