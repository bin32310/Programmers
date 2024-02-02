class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int len=0; len < rny_string.length(); len++){
            answer += rny_string.substring(len,len+1).equals("m")? "rn": rny_string.substring(len,len+1);
        }
        return answer;
    }
}