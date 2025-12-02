package gr.aeub.cf.cf9.ch6;

/**
 * ulopoiei mia logiki last-in-first-out(LIFO)
 */
public class StackApp {
    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {


    }
    public static void push(int num) {
        if (isFull()) {
            System.err.println();
            return;
        }
        top ++;
        stack[top] = num;
        //stack[++top] = num;
    }
    public static int pop() {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }
        int num = stack[top];
        top--;
        return num;
        //return stack[top--];
    }

    public static boolean isEmpty() {
        return top == -1;
    }
    public static boolean isFull() {
        return top == stack.length - 1;
    }
}
