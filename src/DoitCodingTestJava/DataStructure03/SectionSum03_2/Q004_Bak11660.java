package DoitCodingTestJava.DataStructure03.SectionSum03_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
    문제004.구간 합 구하기2
    N X N 표에서 X1,Y1 에서 X2,Y2 까지의 합을 구하려고한다

 */
public class Q004_Bak11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("데이터의 개수, 질의 개수를 입력해주세요 = ");
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int arrSize = Integer.parseInt(stringTokenizer.nextToken());
        int qNum    =Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(arrSize);
        System.out.println(qNum);

        int[][] dataArr = new int[arrSize][arrSize];

        for(int i = 0; i < arrSize ; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0; j < arrSize ; j++){
                dataArr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        for(int i = 0; i < arrSize ; i++){
            String arrStr = "";
            for(int j = 0; j < arrSize ; j++){
                arrStr += dataArr[i][j] + " ";
            }
            System.out.println(arrStr);
        }


        for(int i = 0 ; i < qNum ; i++){
            System.out.print("구간 합 "+ Integer.toString(i+1) + "번째 질의 ->");
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int X1 = 0;
            int Y1 = 0;
            int X2 = 0;
            int Y2 = 0;
            for(int j = 0 ; j < 4 ; j++){
                switch (j){
                    case 0:
                        X1 = Integer.parseInt(stringTokenizer.nextToken());
                        break;
                    case 1:
                        Y1 = Integer.parseInt(stringTokenizer.nextToken());
                        break;
                    case 2:
                        X2 = Integer.parseInt(stringTokenizer.nextToken());
                        break;
                    case 3:
                        Y2 = Integer.parseInt(stringTokenizer.nextToken());
                        break;
                }
            }
//            System.out.println("좌표 = ("+Integer.toString(X1)+","+Integer.toString(Y1)+") / (" +Integer.toString(X2)+","+Integer.toString(Y2)+")";
            int sum = 0;
            for(int idx = X1-1 ; idx < X2 ; idx++){
                for(int idx2 = Y1-1 ; idx2 < Y2 ; idx2++) {
                    System.out.println("좌표 = ("+Integer.toString(idx)+","+Integer.toString(idx2)+")="+dataArr[idx][idx2]);
                    sum+= dataArr[idx][idx2];
                }
            }
            System.out.println("합은 :::" + Integer.toString(sum));
        }



        long beforeTime = System.currentTimeMillis();

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
