import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        for(int a : num_list){
                if(a<0){
                    return count;
                }else{
                    count++;  
                }
                
            }
        return -1;
    }
}