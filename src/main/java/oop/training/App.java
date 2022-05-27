package oop.training;

public class App
{
    public static void main( String[] args )
    {
        MyGeneric<String> myGeneric1 = new MyGeneric<>("Hello");
        MyGeneric<Integer> myGeneric2 = new MyGeneric<>(123);

        System.out.println(myGeneric1.getClass().getSimpleName());
        System.out.println(myGeneric2.getClass().getSimpleName());
        System.out.println(myGeneric1.getItem().getClass().getSimpleName());
        System.out.println(myGeneric2.getItem().getClass().getSimpleName());

        myGeneric1.printItem();
        myGeneric2.printItem();

    }
}
