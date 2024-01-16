class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x",-1);
        int answer1[] = new int[answer.length];
        
        for(int n = 0; n < answer.length; n++ ){
           answer1[n] =  answer[n].length();
        }
        
        return answer1;
    }
}