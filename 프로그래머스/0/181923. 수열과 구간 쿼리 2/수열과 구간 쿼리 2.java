class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int z = 0;
        int check=0;
        int answerMin = 10000001;
        
        // for문 - 배열의 길이 만큼 
        for(int i=0; i < queries.length; i++){
            check = 0; // 0으로 리셋
            answerMin = 10000001; // 10000001로 리셋
            // 범위에 해당하는 arr값 중(for) k보다 큰 값을(if) answer에 넣기
                for(int x=0; x < queries[i][1]-queries[i][0]+1; x++){ // arr의 범위
                   if(arr[x+queries[i][0]] > queries[i][2]){ // k보다 큰 값이면
                        answerMin = Math.min(answerMin,arr[x+queries[i][0]]);
                        check=1;
                   }; // if
                } // for x  
            
               // 해당하는 값이 없을 경우
                if(check==0){
                    answer[z] = -1;
                }else{
                    answer[z] = answerMin;
                }
                z++;
            } // for i
        return answer;
    }
}