package hash;

/**
 * 전화번호목록
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른번호의 접두어인 경우가 있는지확인하려합니다.
 * 전화번호가 다음과 같을 경우 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 * phonebook의 길이는 1이상 1000000이하입니다.
 * 각 전화번호의 길이는 1이상 20이하
 * 같은전화번호가 중복해서 들어있지않습니다.
 */
public class phoneBookList {
    public static void main(String[] args){
        String[] phone_book = {"12","123","1235","567","88"};
        boolean flag = true;
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0 ; j < phone_book.length; j++){
                if(phone_book[i]==phone_book[j]){ //같은건 스킵
                    continue;
                }else {
                    if(phone_book[i].length() <= phone_book[j].length()) {
                        if (phone_book[i].substring(0, phone_book[i].length()).equals(phone_book[j].substring(0, phone_book[i].length()))) {
                            System.out.println("i , j : " + phone_book[i] + "," +phone_book[j]);
                            flag = false;
                            break;
                        }
                    }else{
                        if (phone_book[j].substring(0, phone_book[j].length()).equals(phone_book[i].substring(0, phone_book[j].length()))) {
                            System.out.println("j , i : " + phone_book[j] + "," +phone_book[i]);
                            flag = false;
                            break;
                        }
                    }

                }
            }
            if(flag == false) break;
        }

        System.out.println(flag);

    }
}
