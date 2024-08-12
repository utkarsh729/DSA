import java.util.Stack;

public class Stack_6 {

    public static boolean validParenthesis(String str){
        char []ch=str.toCharArray();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='['){
                stk.push(ch[i]);
            }
            else if(ch[i]==')' && !(stk.empty())){
                if(stk.peek()=='('){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch[i]=='}' && !(stk.empty())){
                if(stk.peek()=='{'){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch[i]==']' && !(stk.empty())){
                if(stk.peek()=='['){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }

        if(stk.empty()){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        // String str="({}())";
        String str="]][[";

        System.out.println(validParenthesis(str));
    }
}
