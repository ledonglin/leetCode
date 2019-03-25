package algorithms;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 * https://leetcode.com/problems/implement-queue-using-stacks/description/
 * <p>
 * Created by linld on 2019/3/22.
 */
public class Problem232 {
    public static void main(String[] args) {

//        queue.push(1);
//        queue.push(2);
//        System.out.println(queue.peek());  // returns 1
//        System.out.println(queue.pop());   // returns 1
//        System.out.println(queue.empty()); // returns false

        Problem232.MyQueue queue = new Problem232().new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
    }

    class MyQueue {
        Stack<Integer> stack;

        /**
         * Initialize your data structure here.
         */
        MyQueue() {
            stack = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            Stack<Integer> stackTmp = new Stack<>();
            Stack<Integer> stackTmp2 = new Stack<>();

            stackTmp.push(x);
            while (!stack.isEmpty()) {
                stackTmp2.push(stack.pop());
            }
            while (!stackTmp2.isEmpty()) {
                stackTmp.push(stackTmp2.pop());
            }
            stack = stackTmp;
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            return stack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return stack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack.isEmpty();
        }
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */