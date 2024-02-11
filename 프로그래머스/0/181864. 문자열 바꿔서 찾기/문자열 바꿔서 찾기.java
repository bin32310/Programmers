import java.util.Arrays;

class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for(char ch : myString.toCharArray()){
            if(ch=='A'){
                answer += "B";    
            }else{
                answer += "A";
            }
        }
        if(answer.indexOf(pat)>=0){
            return 1;
        }else{
            return 0;
        }
    }
}