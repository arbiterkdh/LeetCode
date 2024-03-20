import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            stack1.push(s.charAt(i));
            if(s.charAt(i)=='#' && stack1.size()==1){
                stack1.pop();
            }else if(s.charAt(i)=='#'){
                stack1.pop();
                stack1.pop();
            }
        }

        for(int i = 0; i<t.length(); i++){
            stack2.push(t.charAt(i));
            if(t.charAt(i)=='#' && stack2.size()==1){
                stack2.pop();
            }else if(t.charAt(i)=='#'){
                stack2.pop();
                stack2.pop();
            }
        }

        return stack1.equals(stack2);

    }
}