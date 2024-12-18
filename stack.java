// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    static int arr[]= new int[5];
    static int top=0;
    public static void push(int data)
    {
        arr[top]=data;
        top++;
    }
    
    public static void show()
    {
        for(int i:arr)
        {
            System.out.println(i+" ");
        }
    }
    
    public static int pop()
    {
        top--;
        int data = arr[top];
        arr[top]=0;
        return data;
    }
    
    public static int size()
    {
        return top;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //   int n = 5;
    //   for(int i=0;i<n;i++)
    //   {
    //       push(sc.nextInt());  //push
    //   }
    //   System.out.println(pop());   //pop
    //   show();         
    //   size();                   //print
    
    Stack<Integer> st = new Stack<Integer>();
    
    st.push(1);
    st.push(2);
    st.push(3);
    st.pop();
    st.empty();
    System.out.println(st.peek());
    System.out.println(st.search(2));
    System.out.println(st.empty());
       
       
    }
}
