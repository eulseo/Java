package method;

public class MethodEx1 {

    public static void main(String[] args) {
        average(1, 2, 3);
        average(15,25,35);
    }

    private static void average(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값 : " + average);
    }
}
