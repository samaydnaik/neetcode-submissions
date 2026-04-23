class Solution {
    public boolean isValid(String str) {
        char[] charArr = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char s: charArr){
            if(s == '(' || s == '{' || s == '[')
            stack.push(s);
           else if(stack.isEmpty())
            return false;           
           else if(s == ')' && stack.peek() == '(')
           stack.pop();
           else if(s == '}' && stack.peek() == '{')
           stack.pop();
           else if(s == ']' && stack.peek() == '[')
           stack.pop();
           else
           return false;
        }

        return stack.empty();
    }
}
