import java.util.Scanner;

public class CuGrede {

	public static void main(String[] args) {

		 System.out.print("ใส่คะแนน : ");
	        Scanner in = new Scanner(System.in);
	        int score = in.nextInt();
	        if(score < 50) System.out.println("คุณได้เกรด : F");
	        if(score < 50) System.out.println("** กรุณาลงเรียนใหม่ **");
	        if(score >= 50 && score < 55) System.out.println("คุณได้เกรด : D");
	        if(score >= 55 && score < 60) System.out.println("คุณได้เกรด : D+");
	        if(score >= 60 && score < 65) System.out.println("คุณได้เกรด : C");
	        if(score >= 65 && score < 70) System.out.println("คุณได้เกรด : C+");
	        if(score >= 70 && score < 75) System.out.println("คุณได้เกรด : B");
	        if(score >= 75 && score < 80) System.out.println("คุณได้เกรด : B+");
	        if(score > 100) System.out.println("*** คุณใส่คะแนนผิด กรุณาใส่ใหม่อีกครั้ง ***");
	        else if(score >= 80) System.out.println("คุณได้เกรด : A");
	       
	    }
	}