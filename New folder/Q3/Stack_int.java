import java.util.*;

public class Stack_int
{
// Pushing element on the top of the stack
static void stack_push(Stack<Integer> stack)
{
for(int i = 0; i < 5; i++)
{
int x =(Integer) stack.push(i);
System.out.println(x);
}
System.out.println("Elements Added Successfully....");
System.out.println("---------------");
}

// Popping element from the top of the stack
static void stack_pop(Stack<Integer> stack)
{

System.out.println("Pop Operation:");

for(int i = 0; i < 5; i++)
{
int y = (Integer) stack.pop();
System.out.println(y);
}
System.out.println("---------------");
}

public static void main (String[] args)
{
Stack<Integer> stack = new Stack<Integer>();

stack_push(stack);
stack_pop(stack);
}
}

