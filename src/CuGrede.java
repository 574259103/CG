import java.util.Scanner;

public class CuGrede {

	public static void main(String[] args) {

		 System.out.print("����ṹ : ");
	        Scanner in = new Scanner(System.in);
	        int score = in.nextInt();
	        if(score < 50) System.out.println("�س���ô : F");
	        if(score < 50) System.out.println("** ��س�ŧ���¹���� **");
	        if(score >= 50 && score < 55) System.out.println("�س���ô : D");
	        if(score >= 55 && score < 60) System.out.println("�س���ô : D+");
	        if(score >= 60 && score < 65) System.out.println("�س���ô : C");
	        if(score >= 65 && score < 70) System.out.println("�س���ô : C+");
	        if(score >= 70 && score < 75) System.out.println("�س���ô : B");
	        if(score >= 75 && score < 80) System.out.println("�س���ô : B+");
	        if(score > 100) System.out.println("*** �س����ṹ�Դ ��س���������ա���� ***");
	        else if(score >= 80) System.out.println("�س���ô : A");
	       
	    }
	}