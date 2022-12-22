package InteviewQuestion;

public class Replit215 {
    public static void main(String[] args) {
        Replit215 test = new Replit215();
        System.out.println(test.isBalanced("(()"));
        System.out.println(test.isBalanced("("));
        System.out.println(test.isBalanced(")"));
        System.out.println(test.isBalanced("(()))"));
        System.out.println(test.isBalanced("(())"));
        System.out.println(test.isBalanced("()"));
        System.out.println(test.isBalanced(")()("));
    }
    public boolean isBalanced(String s){
        char[] arr = s.toCharArray();
        int Lbrace = 0;
        int Rbrace = 0;
        if(s.length()%2==0){
            if(s.contains("(") && s.contains(")")){

                for(int i=0; i<=arr.length -1; i++){
                    if(arr[i]=='(') {
                        Lbrace+=1;
                    } else if(arr[i]==')') {
                        Rbrace+=1;
                    }
                }
                if(Lbrace==Rbrace){
                    return true;
                }
            }
        }
        return false;
    }
}
/*
A bracket is considered to be of the following characters: (, ).

Two brackets are considered to be a matched pair if the an opening bracket "(" occurs to the left of a closing bracket ")" of the exact same type.

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, "(()" is not balanced because the contents is not balanced.

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return true. Otherwise, return false.


**Function Description**

Complete the function isBalanced in the editor below.

isBalanced has the following parameter(s):

string s: a string of brackets
Returns

string: either true or false

**Examples**

input "(()"  ->  false

input "("  ->  false

input ")"  ->  false

input "(()))"  ->  false

input "(())"  ->  true

input "()"  ->  true

input ")()("  ->  true
 */

