package DoitCodingTestJava.DataStructure03.ArranementAndArray03_1;

import java.util.Scanner;
/*
    문제001.숫자의 합 구하기
 */
public class Q001_Bak11720 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("숫자 갯수 = ");
        int gaesu = in.nextInt();
        System.out.println();

        System.out.print("숫자 = " );
        String number = in.next();
        System.out.println();

//        String numStr = Long.toString(number);
        long beforeTime = System.currentTimeMillis();
        int sum = 0 ;
        for(int i = 0 ; i < gaesu; i++){
            System.out.println(number.substring(i,i+1));
            sum += Integer.parseInt(number.substring(i,i+1));
        }
        System.out.println("총합  = " + Integer.toString(sum));
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
        /*
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray(); //공백없이 입력받은 숫자를캐릭터로 잘라서 char 형 배열에 넣기
        for(int i = 0 ; i < cNum.length ; i++){
            sum += cNum[i] - '0';
        }
        System.out.println("총합  = " + Integer.toString(sum));

         */
    }
}
