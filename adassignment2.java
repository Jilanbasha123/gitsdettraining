package practicejava;

import java.util.Scanner;

public class adassignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        String a="";
        for(int i=s.length()-1;i>=0;i--) {
        	a=a+s.charAt(i);
        }
        if(s.equals(a)) {
        	System.out.println("no");
        }
        else {
        	System.out.println("No");
        }
	}

}
