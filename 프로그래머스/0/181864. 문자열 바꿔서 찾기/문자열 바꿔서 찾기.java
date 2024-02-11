import java.util.Arrays;

class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for(char ch : myString.toCharArray()){
           answer += (ch=='A')?"B" : "A";
        }
        return (answer.indexOf(pat)>=0)? 1 : 0;
    }
}