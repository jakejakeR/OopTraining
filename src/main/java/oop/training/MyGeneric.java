package oop.training;

public class MyGeneric<T> {
    private T item;

    public MyGeneric(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem() {
        System.out.println(item);
    }
}
