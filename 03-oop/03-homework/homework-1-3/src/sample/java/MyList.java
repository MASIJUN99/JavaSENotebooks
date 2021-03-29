package sample.java;

import java.io.ObjectStreamException;

public class MyList {
    private Object[] elements;
    private int pointer;
    private int size;

    // init
    public MyList() {
        this.size = 4;
        this.pointer = -1;
        elements = new Object[size];
    }

    // 末尾增加元素
    public void add(Object val) {
        pointer += 1;
        if (pointer == size) {
            size = size * 2;
            Object[] newElements = new Object[size];
            for(int i = 0; i < pointer; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[pointer] = val;
    }

    // 删除索引为idx的元素
    public void remove(int index) {
        if (pointer < 0) {
            throw new NullPointerException("MyList没有元素");
        }
        index = Math.min(index, pointer);
        for (int i = index; i < pointer; i++) {
            elements[i] = elements[i + 1];
        }
        elements[pointer] = null;
        pointer -= 1;
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
        return pointer + 1;
    }

    // 当前占用空间
    public int size() {
        return size;
    }



}
