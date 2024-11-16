import java.util.*;

class Stack {
    Scanner s = new Scanner(System.in);
    int size = 5;
    int[] stackArray = new int[size]; // Correct array initialization
    int top = -1;

    void push() {
        if (top == size - 1)
            System.out.println("Stack Overflow");
        else {
            System.out.println("Enter the item to be pushed:");
            int item = s.nextInt();
            stackArray[++top] = item; // Corrected the variable name and assignment
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else {
            int item = stackArray[top--]; // Pop item and decrement top
            System.out.println("Popped item: " + item); // Optional: print popped item
        }
    }

    void print() {
        System.out.println("Stack elements are: ");
        for (int i = top; i >= 0; i--)
            System.out.println(stackArray[i]);
    }
}

public class Stackj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Stack st = new Stack(); // Corrected initialization
        int c;

        do {
            System.out.println("Choose an option");
            System.out.println("1->PUSH\t2->POP\t3->PRINT\t4->EXIT");
            c = s.nextInt();

            switch (c) {
                case 1:
                    System.out.println("You have chosen push operation");
                    st.push();
                    break;
                case 2:
                    System.out.println("You have chosen pop operation");
                    st.pop();
                    break;
                case 3:
                    System.out.println("You have chosen print operation");
                    st.print();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong choice!! Try again");
                    break;
            }
        } while (c != 4);

        s.close(); // Close scanner to avoid resource leak
    }
}
