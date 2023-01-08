package DoitCodingTestJava.DataStructure03.SectionSum03_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
    문제003.구간 합 구하기
 */
public class Q003_Bak11659 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

                System.out.print("데이터의 개수, 질의 개수를 입력해주세요 = ");
        String firstLine = sc.nextLine();
        System.out.println();

        int dataNum = Integer.parseInt(firstLine.split(" ")[0]);
        int qNum    = Integer.parseInt(firstLine.split(" ")[1]);

//        String secondLine = "";
//        while(true) {
//            System.out.print("배열로 처리할 숫자를 입력해주세요 = ");
//            secondLine = sc.nextLine();
//            if (secondLine.split(" ").length != dataNum) {
//                System.out.println(" 최초 입력받은 데이터의 개수와 입력한 배열 데이터의 크기가 다릅니다. ");
//                continue;
//            }else{
//                break;
//            }
//        }
        System.out.println();

        //데이터 배열
        long[] dataArr = new long[dataNum+1];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //합배열 생성
        long[] S = new long[dataNum+1];
        for(int i = 1 ; i < dataNum+1 ; i++){

            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());

            System.out.println("S 값 : " + S[i]);
        }
        long[] sumArr = new long[qNum];
        for(int idx = 0 ; idx < qNum ; idx ++) {
            String mSum = sc.nextLine();
            String[] mSumArr = mSum.split(" ");

            int startIdx = Integer.parseInt(mSumArr[0]);
            int lastIdx = Integer.parseInt(mSumArr[1]);
            System.out.println(S[lastIdx]);
            System.out.println(S[startIdx-1]);


            sumArr[idx] = S[lastIdx] - S[startIdx-1];
        }
        System.out.println();
        for(int i = 0 ; i < sumArr.length; i ++){
            System.out.println(sumArr[i]);
        }
            //질의 갯수 반복

        /* 첫번째 풀이
        String[] sumArr = new String[qNum];
        System.out.print("합을 구할 시작과 끝 인덱스를 입력해주세요 = ");

//        long beforeTime = System.currentTimeMillis();

        for(int idx = 0 ; idx < qNum ; idx ++) {
            String mSum = sc.nextLine();
            String[] mSumArr = mSum.split(" ");

            int startIdx = Integer.parseInt(mSumArr[0]);
            int lastIdx = Integer.parseInt(mSumArr[1]);

            int sum = 0;
            for (int i = startIdx; i <= lastIdx; i++) {
                System.out.println(Integer.parseInt(dataArr[i-1]));
                sum += Integer.parseInt(dataArr[i-1]);
            }
            sumArr[idx] = Integer.toString(sum);
        }
        for(int j = 0 ; j < sumArr.length ; j++){
            System.out.println(sumArr[j]);
        }
        */
//        long afterTime = System.currentTimeMillis();
//        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
