package MySampleProjects;
import java.util.Scanner;
 
public class FindingSeatArrangement {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int noOfSeats = scanner.nextInt();
		String s[] = new String[noOfSeats];
		int a[] = new int[noOfSeats];
		int b[] = new int[noOfSeats]; 
		for (int i = 0; i < noOfSeats; i++) {
			a[i] = scanner.nextInt(); 
			if ((a[i] % 6 == 0) || ((a[i] - 1) % 6 == 0)) {
				s[i] = "WS";
				if (a[i] % 6 == 0) {
					if ((a[i] / 6) % 2 == 0) {
						b[i] = a[i] - 11;
					} else if (((a[i]) / 6) % 2 == 1) {
						b[i] = a[i] + 1;
					}
				} else if (((a[i] - 1) % 6 == 0)) {
					if (((a[i] - 1) / 6) % 2 == 0) {
						System.out.println("HERE");
						b[i] = a[i] + 11;
					}

					else if (((a[i] - 1) / 6) % 2 == 1) {
						b[i] = a[i] - 1;
					}
				}
			} else if ((a[i] - 2) % 3 == 0) {
				s[i] = "MS";
				if ((a[i] - 2) / 3 % 4 == 0)
					b[i] = a[i] + 9;
				else if ((a[i] - 2) / 3 % 4 == 1)
					b[i] = a[i] + 3;
				else if ((a[i] - 2) / 3 % 4 == 2)
					b[i] = a[i] - 3;
				else if ((a[i] - 2) / 3 % 4 == 3)
					b[i] = a[i] - 9;
			} else {
				s[i] = "AS";
				if (a[i] % 3 == 0) {
					if (a[i] / 3 % 4 == 1)
						b[i] = a[i] + 7;
					else if (a[i] / 3 % 4 == 3)
						b[i] = a[i] - 5;
				} else {
					if (((a[i] - 1) / 3) % 4 == 1) {
						b[i] = a[i] + 5;
					} else if ((a[i] - 1) / 3 % 4 == 3)
						b[i] = a[i] - 7;
				}

			}

			System.out.println(b[i] + " " + s[i]);
		}
		scanner.close();

	}

}
