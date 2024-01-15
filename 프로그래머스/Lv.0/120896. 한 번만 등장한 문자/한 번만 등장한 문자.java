import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String answer1 = "";
        
        for(int i=0; i < s.length(); i++){
            if(s.indexOf(s.substring(i,i+1)) == s.lastIndexOf(s.substring(i,i+1))){
                answer +=  s.substring(i,i+1);  
            }
        }
        
        // 정렬
        String chars[] = new String [answer.length()]; 
        for(int j=0; j < answer.length(); j++){
            chars[j]  = answer.substring(j,j+1);
        }
        Arrays.sort(chars);
       
        // 정렬값 다시 넣기
        for(int z=0; z < answer.length(); z++){
            answer1 += chars[z];
        }
        
        
        return answer1;
    }
}