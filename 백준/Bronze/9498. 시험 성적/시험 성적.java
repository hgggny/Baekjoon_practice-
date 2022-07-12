import java.util.*;
public class Main {
	public static void main(String[] args) {
		int num = 0;
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);

		num = scanner.nextInt();
		
		if(num >= 90) {
			grade = 'A';
		} else if (num >= 80) {
			grade = 'B';
		} else if (num >= 70) {
			grade = 'C';
		} else if (num >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}
}