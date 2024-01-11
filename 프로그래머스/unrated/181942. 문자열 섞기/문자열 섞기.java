class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int count = 0;
        while( count < str1.length()){
            answer += str1.substring(count,count+1) + str2.substring(count,count+1);
            count++;
        }
        return answer;
    }
}