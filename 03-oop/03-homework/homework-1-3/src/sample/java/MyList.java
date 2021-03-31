package sample.java;

public class MyList {
    private Object[] elements;
    private int pointer;
    private int capacity;
    private int size;
    private int end;

    // init
    public MyList() {
        this.capacity = 4;
        this.size = 0;
        this.pointer = -1;
        this.elements = new Object[capacity];
    }

    // 末尾增加元素
    public void add(Object val) {
        pointer += 1;
        if (pointer == capacity) {
            capacity = capacity * 2;
            Object[] newElements = new Object[capacity];
            // Arrays.copyTo
            for(int i = 0; i < pointer; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[pointer] = val;
        size += 1;
    }

    // 删除索引为idx的元素
    public void remove(int index) {
        if (pointer < 0) {
            throw new NullPointerException("MyList没有元素");
        }
        index = Math.min(index, pointer);
        // 后移
        for (int i = index; i < pointer; i++) {
            elements[i] = elements[i + 1];
        }
        elements[pointer] = null;
        pointer -= 1;
        size -= 1;
    }

    // 获取索引为idx的元素
    public Object get(int index) {
        if (pointer < 0) {
            throw new NullPointerException("MyList没有元素");
        }
        index = Math.min(index, pointer);
        return elements[index];
    }

    // 当前元素个数
    public int length() {
        return size;
    }

    // 当前占用空间
    public int size() {
        return capacity;
    }



}
