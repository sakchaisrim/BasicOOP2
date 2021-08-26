package B4;

class Parent2{
    private int x;

    Parent2(int y){
        x = 3 + y;
        System.out.println("Parent2() Constructor set x = " +x);
    }
}

public class Child2 extends Parent2{
    private int y;

    public Child2(){
        super(3);  // ส่งค่าพารามิเตอร์ y
    }

    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println("Child2: Default constructor set y = "+child2.y);
    }
}
