import java.util.Scanner;

public class Program
{
	public static void checkPrime(int param)
	{
		if (param <= 1)
		{
			System.out.println("IllegalArgument");
		}
		else
		{
			int ret = 1;
			boolean check = true;
			int iter = 2;
			while (iter * iter <= param)
			{
				if (param % iter == 0)
				{
					check = false;
					break;
				}
				iter++;
				ret++;
			}
			System.out.println(check + " "+ ret);
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		checkPrime(number);
	}
}

/* Allowed functions :
Input/Output : System.out, System.err, Scanner(System.in) */
