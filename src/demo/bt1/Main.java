package demo.bt1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bắt đầu chạy.....");
        NumberGenerator numberGenerator1 = new NumberGenerator("đối tượng 1");
        NumberGenerator numberGenerator2 = new NumberGenerator("đối tượng 2");
        numberGenerator1.start();
        numberGenerator2.start();
    }
}
