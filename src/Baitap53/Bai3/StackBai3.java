package Baitap53.Bai3;

import StackAndQueue.IStackQueue;

public class StackBai3 implements IStackQueue{

        private int[] array;
        private int SIZE;
        private int topIndex;
        public StackBai3(int size){
            SIZE = size;
            array = new int[SIZE];
            topIndex = -1;
        }

        public int getSIZE() {
            return SIZE;
        }

        @Override
        public boolean push(int value) {
            if (!isFull()) {
                topIndex++;
                array[topIndex] = value;
                return true;
            }
            return false;
        }

        @Override
        public int pop() {
            if (!isEmpty()) {
                int value = array[topIndex];
                topIndex--;
                return value;
            }
            return -1;
        }
        public int getValue() {
            if (topIndex == -1) {
                System.out.println("Stack đang rỗng!");
            }
            return array[topIndex];
        }

        @Override
        public boolean isFull() {
            return topIndex == SIZE - 1;
        }

        @Override
        public boolean isEmpty() {
            return topIndex < 0;
        }

        @Override
        public void print() {
            for (int i = 0; i <= topIndex; i++) {
                if (i == topIndex)
                    System.out.print(array[i]);
                else
                    System.out.print(array[i] + ", ");
            }
        }
}
