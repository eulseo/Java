package scanner;

import java.util.Scanner;

public class ScannerEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료 ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("상품명을 입력하세요 : ");
                String name = scanner.nextLine();

                System.out.print("상품의 가겨을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = scanner.nextInt();

                sum = sum + price * quantity;
                System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 : " + quantity + " 합계 : " + price * quantity);
            } else if (option == 2) {
                System.out.println("총 비용 : " + sum);
                sum = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
