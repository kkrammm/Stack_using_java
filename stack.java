import java.util.Scanner;


public class stack
{
    private static String[] Stack = new String[5];
    private static int capacity=5;
    private static int top= -1;

    static void Push(String x)
    {
        if(!isFull())
        {
            Stack[top+1]= x;
            top++;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    static String Pop()
    {
        if(!isEmpty())
        {
            return Stack[top--];            
        }
        System.out.println("Stack is Empty");
        System.exit(1);
        return null; 
    }

    static String Top()
    {
        if(!isEmpty())
        {
            return Stack[top];
        }
        System.out.println("Stack is empty");
        System.exit(1);
        return null;
    }

    static void print()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.println(Stack[i]+"\t");
        }
        System.out.println("\n");
    }

    static Boolean isFull()
    {
        return top==capacity-1;
    }
    static Boolean isEmpty()
    {
        return top==-1;
    }
    
    public static void main(String[] args)
    {
        String x = "";
        System.out.println("---Menu---");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Top");
        System.out.println("4. Print");
        System.out.println("5. Exit");
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter the choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    System.out.println("\nEnter the element to push: ");
                    x = sc.nextLine();
                    Push(x);
                    break;
                case 2: 
                    String y = Pop();
                    System.out.println("Poped out value: "+y);
                    break;
                case 3: 
                    String z = Top();
                    System.out.println("Top value of the  StacK: "+z);
                    break;
                case 4:
                    print();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Enter the valid choice...!");    
            }
        }

    }
}