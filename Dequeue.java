package XII;

import java.util.*;
class Dequeue
{
    int arr[];
    int lim;
    int front;
    int rear;
    Dequeue(int l)
    {
        lim = l;
        arr = new int[lim];
        front = 0;
        rear = 0;
    }

    void addFront(int n)
    {
        if(front == 0)
            System.out.println("Overflow from Front");
        else
            arr[--front] = n;
    }

    void addRear(int n)
    {
        if(rear == lim)
            System.out.println("Overflow from Rear");
        else
            arr[rear++] = n;
    }

    int popFront()
    {
        if(front < rear)
        {
            int d = arr[front++];
            if(front == rear)
            {
                front = 0;
                rear = 0;
            }
            return d;
        }
        return -999;
    }

    int popRear()
    {
        if(front < rear)
        {
            int d = arr[--rear];
            if(front == rear)
            {
                front = 0;
                rear = 0;
            }
            return d;
        }
        return -999;
    }

    void show()
    {
        if(front > rear)
            System.out.println("De-Queue Empty");
        else
        {
            for(int i = front; i < rear; i++)
            {
                System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
    }

    static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("De-Queue Limit: ");
        int size = Integer.parseInt(in.nextLine());
        Dequeue dq = new Dequeue(size);
        while(true)
        {
            System.out.println("1. Add from front");
            System.out.println("2. Add from rear");
            System.out.println("3. Pop from front");
            System.out.println("4. Pop from rear");
            System.out.println("5. Display elements");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(in.nextLine());
            switch(choice)
            {
                case 1:
                    System.out.print("Element to be added: ");
                    int n = Integer.parseInt(in.nextLine());
                    dq.addFront(n);
                    break;
                case 2:
                    System.out.print("Element to be added: ");
                    n = Integer.parseInt(in.nextLine());
                    dq.addRear(n);
                    break;
                case 3:
                    n = dq.popFront();
                    if(n == -999)
                        System.out.println("Underflow from front");
                    else
                        System.out.println(n + " popped");
                    break;
                case 4:
                    n = dq.popRear();
                    if(n == -999)
                        System.out.println("Underflow from rear");
                    else
                        System.out.println(n + " popped");
                    break;
                case 5:
                    dq.show();
                    break;
                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}