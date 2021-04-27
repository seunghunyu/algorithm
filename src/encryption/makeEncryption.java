package encryption;

public class makeEncryption {
    public static void main(String[] args){
        String keyword = "mode";
        String sentence = "I love coding";
        int idx[] = {0,0,3,12};
        System.out.println(keyword.charAt(0));
        boolean flag = false;

        for(int i = 0; i < idx.length;i++){
            flag = false;
            for(int j = 0 ; j < sentence.substring(0,idx[i]).length() ; j++){
                if(sentence.charAt(j) == keyword.charAt(i)){
                    sentence = sentence.substring(0, j) + keyword.charAt(i) + sentence.substring(j, sentence.length());
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                continue;
            }
            sentence = sentence.substring(0, idx[i]) + keyword.charAt(i) + sentence.substring(idx[i], sentence.length());
        }

        System.out.println("완성된 문장 : "+ sentence);


    }
}
