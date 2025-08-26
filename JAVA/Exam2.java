import java.util.Scanner;

public class Exam2 {
	public static void main(String args[]) {
	int n1,n2;
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	System.out.println("NUm1");
	n1=scanner.nextInt();
	System.out.println("Num2");
	n2=scanner.nextInt();
	int div=n1/n2;
	System.out.println(div+": <--ans");
	}

}