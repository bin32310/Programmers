class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){ // 주어진 수가 짝수면 제곱+
            while(n > 0){
                answer += (n % 2 == 0)? n*n : 0 ;
                n--;
            }
        }
        else{ // 주어진 수가 홀수면 +
            while(n > 0){
                answer += (n % 2 == 1)? n : 0 ;
                n--;
            }            
        }
        System.out.println(answer);
        return answer;
    }
}