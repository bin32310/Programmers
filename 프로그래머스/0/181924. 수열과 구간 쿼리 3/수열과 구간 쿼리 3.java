class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int one = 0;
        
        // queries의 길이만큼 반복
        for(int i=0; i < queries.length ;i++){
            one = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = one;
        }
        return arr;
    }
}