package makegrade;

import java.util.ArrayList;

public class makeGrade {
   public static void main(String[] args) {
      String answer = "";
      int scores[][] = {{20, 30, 22, 44, 90}, {40, 70}, {44, 44, 30, 22}, {44, 44, 20, 50, 50}};
      ArrayList<Integer> arrList = new ArrayList();
      // 0,1,2,3 학생 -> 자기가 자기점수매긴숫자가 최고나 최저이면 성적 평균에서 빼고 매긴다.
      int max = 0;
      int min = 0;
      int myScore = 0;
      for(int i = 0;i < scores.length; i++){
         for(int j = 0;j<scores[i].length; j++) {
            arrList.add(scores[i][j]);
            if(i==j){
               myScore = scores[i][j]; // 내점수 세팅
            }
            if(j == 0){  //최초에 최대값 최저값 세팅
               max = scores[i][j];
               min = scores[i][j];
            }else{
               if(max < scores[i][j]){
                  max = scores[i][j];
               }
               if(min > scores[i][j]){
                  min = scores[i][j];
               }
            }
         }
         int sameCnt = 0;
         int divNum = scores[i].length;
         if(min == myScore || max == myScore){
            for(int k=0;k<arrList.size();k++) {
               if (arrList.get(k) == myScore) {
                  sameCnt++;
               }
               if(sameCnt > 1){  //중복되는 숫자있으면 탈출

                  break;
               }
            }
            if(sameCnt < 2){ // 중복되는 숫자가 없으면 빼야함
               divNum--;
            }
         }
         int sum=0;
         int avg=0;
         String grade="";
         for(int k=0;k<arrList.size();k++){
            sum += arrList.get(i);
         }
         if(divNum != scores[i].length) {
            sum = sum - myScore;
         }
         avg = sum / divNum;
         if(avg >= 90){
            grade = "A";
         }else if(avg >= 80 && avg < 90){
            grade = "B";
         }else if(avg >= 70 && avg < 80){
            grade = "C";
         }else if(avg >= 60 && avg < 70){
            grade = "D";
         }else if(avg < 60){
            grade = "E";
         }
         answer = answer + grade;

      }
      System.out.println("점수는 : " + answer);
   }
}
