package gr.aueb.cf.ch6;

/**
 * Υλοποιεί μία λογική Last-In-First-Out (LIFO).
 */
public class StackApp {

    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        push(1);
        push(2);
        push(3);
        printStack();
        num = pop();
        System.out.println("Popped: " + num);
        printStack();
    }

    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full");    // error handling
            return;
        }

        top++;
        stack[top] = num;
//        stack[++top] = num;
    }

    public static boolean isFull() {
        return top == stack.length - 1;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");    // error handling
            return -1;
        }
//        int num = stack[top];
//        top--;
//        return num;
        return stack[top--];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println();
    }

}
