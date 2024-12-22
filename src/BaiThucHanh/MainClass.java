package BaiThucHanh;

public class MainClass {
    public static void main(String[] args) {
        final MainClass a = new MainClass();
        a.display(22.7F);
    }

    float PI = 3.14F;

    public void display(float pi) {
        PI = pi;
        System.out.println("The value of PI is: " + PI);
    }
}
