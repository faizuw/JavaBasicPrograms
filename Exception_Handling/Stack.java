package Exception_Handling;

class StackOverflowExp extends Exception {
    public String toString() {
        return "Stack is full";
    }
}

class StackUnderflowExp extends Exception {
    public String toString() {
        return "Stack is Empty";
    }
}

class StackOperations {
    private int size = 5;
    public int top = -1;
    public int stk[] = new int[size];

    public int pop() throws StackUnderflowExp {
        int x;
        if (top == -1)
            throw new StackUnderflowExp();
        x = stk[top];
        top--;
        return x;

    }

    public void push(int x) throws StackOverflowExp {
        if (top == size - 1)
            throw new StackOverflowExp();
        top++;
        stk[top] = x;
    }
}


public class Stack {

    public static void main(String[] args) {
        StackOperations s = new StackOperations();
        try {
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            s.push(60);




        } catch (StackOverflowExp e) {
            System.out.println(e);
        }
        for(int i=0;i<s.stk.length;i++){
        System.out.println(s.stk[i]);

        }
        System.out.println("\n");
        try {
            s.pop();
            s.pop();
        } catch (StackUnderflowExp e) {
            System.out.println(e);
        }
                     for(int i=0;i<=s.top;i++){
                     System.out.println(s.stk[i]);
    }                }
}
