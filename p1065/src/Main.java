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
        } // 여기까지는 기본 알고리즘
// 규칙 1. 회의시간이 끝나는 회의를 기준으로 정렬하기.
        // 규칙 2. 겹치지 않는 선에서 가장 회의시간이 짧은 회의를 정렬 및 선택한다 .

        for (int i = 0; i < testcase; i++) { // 정렬 알고리즘.
            int save1;
            int save2;
            for (int j = i + 1; j < testcase; j++) {
                if(arr[i][1] > arr[j][1]) {
                    save1 = arr[i][1];  // save에 이전항을 저장해놓는다.
                    arr[i][1] = arr[j][1];
                    arr[j][1] = save1;
                    save2 = arr[i][0];  // save에 이전항을 저장해놓는다.
                    arr[i][0] = arr[j][0];
                    arr[j][0] = save2;
                }
            }
        }


    }
}