package hash;

import java.util.ArrayList;
import java.util.List;

/*
완주하지 못한 선수
 2021-08-03 효율성 체크필요

 */

public class canNotCompleteRun {
    public static void main(String[] args){
        /*참여자 1~100000
          completion의 길이는 participant의 길이보다 1 작다
          참가자의 이름은 1~20 알파벳 소문자로 이루어져있다.
          참가자중에 동명 이인이 있을 수 있음
        * */
        //마라톤참여자 배열
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        //완주자배열
        String[] completion = {"stanko", "ana", "mislav"};

        int complCnt = 0;
        String failPerson = "";
        String dupPerson  = "";
        boolean finish = false;
        List complList = new ArrayList();

        for(int i = 0 ; i < participant.length ; i++) {

            for (int j = 0; j < completion.length; j++){
                if (participant[i] == completion[j]) {
                    if(complList.contains(participant[i]) == true){
                        System.out.println(participant[i]+"참여자 명단에는 두 명이 있지만, 완주자 명단에는 한명 밖에 없기 때문에 한명은 완주하지 못했습니다.");
                        finish = true;
                        break;
                    }
                    complList.add(participant[i]);
                    complCnt++;
                    break;
                }
                if (j==completion.length){
                    failPerson = participant[i];
                    System.out.println(failPerson+"은 참여자 명단에는 있지만,완주자 명단에 없기때문에 완주하지 못했습니다.");
                    finish = true;
                }
            }

            if(finish == true){
                break;
            }
        }

    }
}
