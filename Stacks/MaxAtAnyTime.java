import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxAtAnyTime {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //stack must return max element at any time
        //Q- return max element
        //A- push to stack
        //R- pop from stack
        //Approach is by using two stacks
        int tc=Integer.parseInt(br.readLine());
        int c=1;
        while(tc-->0){
            bw.write("Case "+c+":"+"\n");
            int q=Integer.parseInt(br.readLine());
            Stack<Integer> s=new Stack<Integer>();
            Stack<Integer> t=new Stack<Integer>();
            
            while(q-->0){
                // int m=0;
                String sc=br.readLine();
                if(sc.charAt(0)=='A'){
                    String[] ip=sc.split(" ");
                    if(t.empty() || Integer.parseInt(ip[1])>t.peek()){
                        t.push(Integer.parseInt(ip[1]));
                    }
                    else{
                        t.push(t.peek());
                    }
                    s.push(Integer.parseInt(ip[1]));
                    
                }
                else if(sc.charAt(0)=='Q'){
                    if(!t.empty())
                        bw.write(t.peek()+"\n");
                    else
                        bw.write("Empty\n");
                }
                else{
                    if(!s.empty()){
                    s.pop();
                        t.pop();
                    }
                    
                }
            }
            c++;
        }
        bw.flush();
    }
}