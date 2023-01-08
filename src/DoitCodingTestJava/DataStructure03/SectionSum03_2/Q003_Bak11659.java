package DoitCodingTestJava.DataStructure03.SectionSum03_2;

import java.util.Scanner;

/*
    문제003.구간 합 구하기
 */
public class Q003_Bak11659 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("데이터의 개수, 질의 개수를 입력해주세요 = ");
        String firstLine = sc.nextLine();
        System.out.println();

        int dataNum = Integer.parseInt(firstLine.split(" ")[0]);
        int qNum    = Integer.parseInt(firstLine.split(" ")[1]);

        String secondLine = "";
        while(true) {
            System.out.print("배열로 처리할 숫자를 입력해주세요 = ");
            secondLine = sc.nextLine();
            if (secondLine.split(" ").length != dataNum) {
                System.out.println(" 최초 입력받은 데이터의 개수와 입력한 배열 데이터의 크기가 다릅니다. ");
                continue;
            }else{
                break;
            }
        }
        System.out.println();

        System.out.println(firstLine);
        System.out.println(secondLine);

        //데이터 배열
        String[] dataArr = secondLine.split(" ");

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
//        long afterTime = System.currentTimeMillis();
//        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
