import java.io.File;
import java.util.Scanner;

public class Test { 
	public static void main(String[] args) throws Exception { 

		try (Scanner sc = new Scanner(new File("input.txt"))){
			int n = sc.nextInt();
			int [] m = new int [n];

			for (int i = 0; i < n; i++) {
				m[i] = sc.nextInt();
			}

			int sum_pos = 0;
			int count_pos = 0;
			int sum_neg = 0;
			int count_neg = 0;

			for (int i = 0; i < n; i++) {
				if (m[i] > 0) {
					sum_pos += m[i];
					count_pos++;
				}
				if (m[i] < 0) {
					sum_neg += m[i];
					count_neg++;
				}
			}

			if (sum_pos > Math.abs(sum_neg)) {
				System.out.println(count_pos);
				for (int i = 0; i < n; i++) if (m[i] > 0) System.out.print((i + 1) + " ");			
			}
			else {
				System.out.println(count_neg);
				for (int i = 0; i < n; i++) if (m[i] < 0) System.out.print((i + 1) + " ");
			}
		} 
	}
} 
