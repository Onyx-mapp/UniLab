public class Main {
    public class StackOfChars {
        private int maxSize;
        private char[] charArr;
        private int top;
        public StackOfChars (int size) {
            this.maxSize = size;
            this.charArr = new char[maxSize];
            this.top = -1;
        }
        public boolean isEmpty() {
            if (top == -1) return true;
            else return false;
        }
        public boolean isFull() {
            if (top == maxSize - 1) return true;
            else return false;
        }
        public char peak() {
            return charArr[top];
        }
        public void push (char c) {
            charArr[top + 1] = c;
            top++;
        }
        public void pop() {
            if (isEmpty()) return;
            else {
                top--;
                return;
            }
        }
        public int getSize() {
            return top + 1;
        }
    }
    public class StackOfIntergers {
        private int maxSize;
        private int[] intArr;
        private int top;
        public StackOfIntergers (int size) {
            this.maxSize = size;
            this.intArr = new int[maxSize];
            this.top = -1;
        }
        public boolean isEmpty() {
            if (top == -1) return true;
            else return false;
        }
        public boolean isFull() {
            if (top == maxSize - 1) return true;
            else return false;
        }
        public int peak() {
            return intArr[top];
        }
        public void push (char c) {
            intArr[top + 1] = c;
            top++;
        }
        public void pop() {
            if (isEmpty()) return;
            else {
                top--;
                return;
            }
        }
        public int getSize() {
            return top + 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}