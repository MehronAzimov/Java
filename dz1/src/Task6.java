import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String convert = Integer.toHexString(num);
        System.out.println(convert);
	}

}
