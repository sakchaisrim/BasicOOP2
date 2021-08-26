package B6;

public class TestParam {
    // Overloaded Constructor method
    TestParam(int x){
        x++;
        System.out.println("x= "+ x);
    }
    TestParam(double x, int y){
        x = x + y;
        System.out.println("x= "+ x);
    }
    TestParam(float x, int y){
        x = x -y;
        System.out.println("x= " +x);
    }

    public static void main(String[] args) {
        new TestParam(5);
        new TestParam(5.0d, 5);
        new TestParam(5.5f, 5);
    }

}
