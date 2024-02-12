class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int a : num_list){
            while(a>1){
                    a = (a%2==0)?a/2:(a-1)/2;
                answer++;
            }
        }
        return answer;
    }
}