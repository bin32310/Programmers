import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
		int len = a.length();
		int count = 0;
		while(--len >=0) {	
            
			String al = a.substring(count, count+1);;
            
			if(al.equals(al.toUpperCase())) {
				System.out.print(al.toLowerCase());
			}
			else {
				System.out.print(al.toUpperCase());
			}
			count++;
		}
    }
}