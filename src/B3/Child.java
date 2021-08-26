package B3;

class Parent {
    private int x = 3;

    Parent() {
        System.out.println("Parent() constructor set x = " + x);
    }
}

public class Child extends Parent {
    private int y = 5;
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Parent() constructor set y = " + child.y);
    }
}


