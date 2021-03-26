
class CQueue {
    Stack<Integer> stack;
    Stack<Integer> stackr;

    public CQueue() {
        stack = new Stack<>();
        stackr = new Stack<>();
    }

    public void appendTail(int value) {
        stack.push(new Integer(value));
    }

    public int deleteHead() {
        /* 删除的是否如果stack2不为空就 反转stack1放进去 */
        if (stackr.empty()) {
            if (stack.empty())
                return -1;
            while (!stack.empty()) {
                stackr.push(stack.pop());
            }
        }

        return stackr.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
