import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt(); // 테스트 케이스의 수를 입력받습니다.
        int[][] arr = new int[testcase][2]; // 각각의 테스트 케이스를 입력받는다.

        for (int i = 0; i < testcase; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = input.nextInt();

            }
        } // 여기까지는 기본 알고리즘.





    }
}