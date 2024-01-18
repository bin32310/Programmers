
class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        
        if((a==b) && (b==c) && (c==a)){ // 세 숫자가 모두 같음
            answer = answer*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c);
        }else if( (a!=b) && (b!=c) && (c!=a) ){ // 세 숫자가 모두 다름
            
        }else{ // 세 숫자 중 어느 두 숫자는 같고 나머지 숫자가 다름
            answer = answer*(a*a + b*b + c*c);
        }
       
        return answer;
    }
}