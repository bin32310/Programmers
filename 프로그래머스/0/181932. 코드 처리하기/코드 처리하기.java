class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for(int x=0; x < code.length(); x++){
            
            if(mode == 0){ // mode가 0이면
                //System.out.println("현재모드0");
                if(code.substring(x,x+1).equals("1")){ // 1이면 모드 변경 (0=>1)
                    mode = 1;
                   // System.out.println("0=>1 모드변경");
                }else{ // 1이 아니므로 idx가 짝수일 때만 ret에 값 추가
                    //System.out.println("짝수만 추가  : " + x);
                    ret += (x%2 == 0)? code.substring(x,x+1) : "";
                }
                
            }else{ // mode가 1이면
                //System.out.println("현재모드1");
                if(code.substring(x,x+1).equals("1")){ // 1이면 모드 변경 (1=>0)
                    mode = 0;
                    //System.out.println("1=>0 모드변경");
                }else{ // 1이 아니므로 idx가 홀수일 때만 ret에 값 추가
                    //System.out.println("홀수만 추가  : " + x);
                    ret += (x%2 == 1)? code.substring(x,x+1) : "";
                }
                
            }
            
            //System.out.println("code["+x+"] = " + code.substring(x,x+1) );

        } // for문 끝
        
        //System.out.println(ret);
        if(ret.length() == 0){
            ret = "EMPTY";
        }
        
        return ret;
    }
}