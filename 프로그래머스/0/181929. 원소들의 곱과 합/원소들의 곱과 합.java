class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        for(int a : num_list){
            mul *= a;
            sum += a;
        }
        sum *= sum;
        return mul < sum? 1 : 0;
    }
}