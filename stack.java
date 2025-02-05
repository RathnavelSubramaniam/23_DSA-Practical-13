import java.io.*;
import java.util.*;
class stack 
{
    int size;
    int item[];
    int top;
    public stack() 
    {
        size = 100;
        item = new int[size];
        top = -1;
    }
    public void push(int ele) 
    {
        if (top == (size - 1)) 
        {
            System.out.println("Stack Overflow");
        } else 
        {
            top++;
            item[top] = ele;
        }
    }
    public int pop() 
    {
        if (top == -1) 
        {
            System.out.println("No Elements");
            return (-1);
        } else 
        {
            int x = item[top];
            top--;
            return (x);
        }
    }
    public int peek() 
    {
        if (top == -1) 
        {
            System.out.println("No Elements");
            return (-1);
        } else
            return (item[top]);
    }
    public void display() 
    {
        System.out.println();
        if (top == -1) 
        {
            System.out.println("No Elements");
        } else 
        {
            System.out.println("Stack is");
            for (int i = 0; i <= top; i++)
                System.out.println(item[i]);
        }
    }
}
class evalpostfix 
{
    stack st = new stack();
    String postfix;
    public evalpostfix(String str) 
    {
        postfix = str;
    }
    public boolean isOperand(char ch) 
    {
	// TYPE YOUR CODE CODE
       
    }
    public int eval() 
    {
 	// TYPE YOUR CODE CODE
        
    }
class Postfixeval 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter postfix string");
        String str=sc.nextLine();
        evalpostfix epf = new evalpostfix(str);
        System.out.println("Result:" + epf.eval());
    }
}
