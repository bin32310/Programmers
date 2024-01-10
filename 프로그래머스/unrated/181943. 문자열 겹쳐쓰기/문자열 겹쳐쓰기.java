class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
//        answer = my_string.replace(my_string.substring(s,overwrite_string.length()+s),overwrite_string);
//        System.out.println(answer);
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(overwrite_string.length()+s);
        return answer;
    }
}