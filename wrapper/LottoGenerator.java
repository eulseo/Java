package lang.wrapper;

import java.util.Random;

public class LottoGenerator {

    private int[] lottoBox = new int[6];
    private int count = 0;
    private Random random = new Random();

    public void getNum() {

        while (count < 6) {
            int num = random.nextInt(45) + 1;
            if (isUnique(num)) {
                count++;
            }
        }

        printNum();
    }


    public boolean isUnique(int num) {
        for (int i = 0; i < count; i++) {
            if (num == lottoBox[i]) {
                return false;
            }
        }

        lottoBox[count] = num;
        return true;
    }

    public void printNum() {
        System.out.print("로또 번호 : ");
        for (int num : lottoBox) {
            System.out.print(num + " ");
        }
    }
}
