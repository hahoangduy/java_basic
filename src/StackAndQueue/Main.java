package StackAndQueue;

public class Main {

    public static void main(String[] args) {
        MyArrayStack myStack = new MyArrayStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.print();

        while (!myStack.isEmpty()) {
            int value = myStack.pop();
            if (value == 5) {
                System.out.println("true");
            }
        }
        myStack.pop();
        myStack.print();
        myStack.pop();
        myStack.print();
        myStack.pop();
        myStack.print();
        System.out.println("-------------------");

        MyArrayQueue myQueue = new MyArrayQueue(3);
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.print();

        System.out.println(myQueue.pop());
        myQueue.print();
        System.out.println(myQueue.pop());
        myQueue.print();
        System.out.println(myQueue.pop());
        myQueue.print();
        System.out.println(myQueue.pop());
        myQueue.print();
    }

}
