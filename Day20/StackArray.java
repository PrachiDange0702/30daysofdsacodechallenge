//Stack
import java.util.*;
public class StackArray
{
	int top = -1;
	int maxsize = 5;
	int stack[] = new int[maxsize];

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		StackArray sa = new StackArray();
		int con = 1;
		int choice;
		int data;
		while(con == 1)
		{
			System.out.println("1.push\n 2.pop \n3.peek");
			System.out.println("Enter your choice");
			choice = s.nextInt();

			switch(choice)
			{
				case 1:
					sa.push();
					break;
				case 2:
					data=sa.pop();
					if(data==-1)
					{
							break;
					}
					System.out.println("Element popped:"+data);
					break;
				case 3:
					data=sa.peek();
					if(data==-1)
					{
							break;
					}
					System.out.println("Element at top:"+data);
	
					break;
				default:
					System.out.println("enter valid choice");
				
			}
			System.out.println("do you want to continue(1/0)");
			con = s.nextInt();
			}	
	}
	void push()  //no value in stack that why we using void
		{
			Scanner s = new Scanner(System.in);
			int data;
			System.out.println("Enter data");
			data = s.nextInt();

			if(top==maxsize-1)
			{
				System.out.println("Stack is full");
			}
			else
			{
				if(top == -1)
				{	
					top ++;
					stack[top] = data;
				}	
			}						
		}

		int pop()   // in pop operation already any value in the stack
	{
		int data;
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			data = stack[top];
			top --;
		}
		return data;
	}

	int peek()
	{
		int data;
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			data = stack[top];
		
		}
		return data;
	}
}




