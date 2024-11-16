import java.util.Scanner;

class Queue {
    int[] queue;
    int front, rear, size;

    Queue() {
        this.size = 5;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    void insert(int element) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow: Cannot insert element");
        } else {
            if (front == -1) {
                front = 0;
            }
            queue[++rear] = element;
            System.out.println("Inserted: " + element);
        }
    }

    void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow: No element to delete");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = sc.nextInt();
                    q.insert(element);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
