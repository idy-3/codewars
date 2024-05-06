package kata;


import java.util.ArrayList;
import java.util.List;

class MinStack {

    private final List<Integer> minStack;
    private Integer minVal = Integer.MAX_VALUE;

    public MinStack() {
        this.minStack = new ArrayList<>();
    }

    public void push(int val) {
        this.minVal = Integer.min(this.minVal, val);
        this.minStack.add(val);
    }

    public void pop() {
        this.minStack.remove(this.minStack.size() - 1);
        this.minVal = this.minStack.stream().mapToInt(v -> v).min().orElse(Integer.MAX_VALUE);
    }

    public int top() {
        return this.minStack.get(this.minStack.size() - 1);
    }

    public int getMin() {
        return this.minVal;
    }
}
