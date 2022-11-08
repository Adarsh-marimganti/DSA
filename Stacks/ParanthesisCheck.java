import java.util.*;
class Stack {
char[] data;
int capacity;
int top;
Stack(int c) {
data = new char[c];
top=-1;
}
void push(char ele) {
top++;
data[top]=ele;
}
void pop() {
if(!isEmpty())
top--;
}
char peek() {
return(data[top]);
}
boolean isEmpty() {
if(top<0)
return true;
return false;
}
}
public class ParanthesisCheck{
    public static boolean isBalanced(String data) {
int len=data.length();
if(len==0 || data==null) {
return true;
}
Stack s = new Stack(len);
for(int i=0;i<len;i++)
{
if((data.charAt(i)>='a'&&data.charAt(i)<='z')||(data.charAt(i)>='A'&&data.charAt(i)<='Z')||data.charAt(i)=='!') {
continue;
}
else if(data.charAt(i)=='(' || data.charAt(i)=='[' || data.charAt(i)=='{') {
s.push(data.charAt(i));
}
else if(data.charAt(i)==')' && !s.isEmpty() && s.peek()=='(') {
s.pop();
}
else if(data.charAt(i)==']' && !s.isEmpty() && s.peek()=='[') {
s.pop();
}
else if(data.charAt(i)=='}' && !s.isEmpty() && s.peek()=='{') {
s.pop();
}
else {
return false;
}
}
return s.isEmpty();
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s =sc.next();
        if(isBalanced(s)) System.out.println("Balanced");
        else System.out.println("Not Balanced");
    }
}




