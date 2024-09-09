class MinStack {
    private List<Integer> list;
    private int topIndex;
    private List<Integer> mins;
    private int minIndex;
    public MinStack() {
        list = new ArrayList<>();
        topIndex = 0;
        mins = new ArrayList<>();
        minIndex = 0;
    }
    
    public void push(int val) {
        if(list.isEmpty()){
            list.add(val);
            mins.add(val);
        }
        else{
            list.add(val);
            topIndex++;
            if(val <= mins.get(minIndex)){
                mins.add(val);
                minIndex++;
            }
        }
    }
    
    public void pop() {
        if(list.isEmpty()){
            return;
        }
        else if(list.get(topIndex).equals(mins.get(minIndex))){
            list.remove(topIndex--);
            mins.remove(minIndex--);
        }
        else {
            list.remove(topIndex--);
        }

        if(list.isEmpty()){
            topIndex = 0;
            minIndex = 0;
        }
    }
    
    public int top() {
        return list.get(topIndex);
    }
    
    public int getMin() {
        return mins.get(minIndex);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */