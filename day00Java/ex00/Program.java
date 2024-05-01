public class Program
{
	public static int sumDigits(int number)
	{
		int sum = 0;
		while (number != 0)
		{
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int number = 479598;
		int sum = sumDigits(number);
		System.out.println(sum);
	}
}
