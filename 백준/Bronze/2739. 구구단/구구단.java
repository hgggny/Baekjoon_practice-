import java.util.*;
public class Main {
	public static void main(String[] args) {
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d", num, i, num*i);
				System.out.println();
		}
	}
}