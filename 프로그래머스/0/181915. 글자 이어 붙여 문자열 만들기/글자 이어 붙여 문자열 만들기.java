class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int a : index_list){
            answer = answer + my_string.substring(a,a+1);
        }
        return answer;
    }
}