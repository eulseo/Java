package lang.enumeration;

import java.util.Scanner;

import static lang.enumeration.AuthGrade.*;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN] : ");
        String grade = scanner.nextLine();

        System.out.println("==메뉴 목록==");

        if (valueOf(grade).getLevel() >= 1) {
            System.out.println("-메인 화면");
        }
        if (valueOf(grade).getLevel() >= 2) {
            System.out.println("-이메일 관리 화면");
        }
        if (valueOf(grade).getLevel() >= 3) {
            System.out.println("-관리자 화면");
        }

    }

}
