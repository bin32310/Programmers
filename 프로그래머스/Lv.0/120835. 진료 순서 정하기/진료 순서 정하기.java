import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];;
        Integer[] emergency2= new Integer[emergency.length];
        int i = 0;
        int arrSize = emergency.length;
        
        // ememrgency 에 값 넣기
        for(int a : emergency){
            emergency2[i] = (Integer)a;
            //System.out.println("1 : "+ emergency[i]);
            //System.out.println("2 :" + emergency2[i]);
            i++;
        }
        
        // emergency2를 내림차순 정렬
        Arrays.sort(emergency2, Collections.reverseOrder());
        
        // 순서대로 같은 값을 찾아서 같으면 answer에 순위 입력
        for(int x = 0; x < emergency2.length; x++){ // 내림차순 배열만큼 반복
           for(int y = 0; y < emergency.length; y++){ // 주어진 배열만큼 반복
                if(emergency2[x] == emergency[y]){
                    answer[y] = x+1;
                }
           } //for2
        } //for1
        
        // for(int z =0; z < answer.length ;z++){
        //      System.out.println( "answer["+ z +"] : " + answer[z]);  
        // }
         
        return answer;
    }
}