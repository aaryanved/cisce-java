class Stack
{
    int arr[];
    int top;
    int size = 10;
    Stack()
    {
        arr = new int[size];
        top = -1;
    }
    void push(int num)
    {
        if (top == size - 1)
            System.out.println("Stack OVERFLOW");
        else
            arr[++top] = num;
    }
    int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack UNDERFLOW");
            return 0;
        }
        else
        {
            int n = arr[top];
            top--;
            return n;
        }
    }
    void display()
    {
        System.out.println("Stack is: ");
        for (int i = top; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}