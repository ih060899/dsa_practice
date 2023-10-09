package queues;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueMain {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        reverseQueue(queue);
//        System.out.println(queue);

//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(30);
//        queue.enqueue(30);
//        System.out.println(queue.dequeue());
//        System.out.println(queue);
//        System.out.println(queue.peek());

//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(10);
//        queue.add(30);
//        queue.add(25);
//        queue.add(31);
//        queue.add(20);
//        while (!queue.isEmpty())
//            System.out.println(queue.remove());

    }

    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
