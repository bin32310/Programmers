class Solution {
    public int solution(int a, int b) {
        String num1 = a+"";
        String num2 = b+"";
        String num3 = num1 + num2;
        String num4 = num2 + num1;
        
        if(Integer.parseInt(num3) >= Integer.parseInt(num4)){
           return Integer.parseInt(num3);
        }
        else{
            return Integer.parseInt(num4);
        }
        
    }
}