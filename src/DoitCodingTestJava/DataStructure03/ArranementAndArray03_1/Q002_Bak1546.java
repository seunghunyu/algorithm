package DoitCodingTestJava.DataStructure03.ArranementAndArray03_1;

import java.util.Scanner;

/*
    문제002.평균 구하기
 */
public class Q002_Bak1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 = ");
        int number = sc.nextInt();
        System.out.println();

        int scoreArr[] = new int[number];
        int maxValue = 0;

        for(int i = 0 ; i < number; i++){
            int score = sc.nextInt();
            scoreArr[i] = score;

            if(score > maxValue){
                maxValue = score;
            }
           // System.out.println("Max = " + maxValue);
        }
        int sum = 0;
        for(int i = 0 ; i < number ; i++){
//             sum+=(scoreArr[i]/maxValue*100);
            sum+=(scoreArr[i]*100/maxValue);
            System.out.println("scoreArr = " + scoreArr[i]);
            System.out.println("Max = " + maxValue);
            System.out.println("점수값 = " + scoreArr[i]*100/maxValue);

        }
        System.out.println("sum = " + sum);
        System.out.println("평균 값 = " + sum/number);
    }
}
