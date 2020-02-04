public class Sum
{
	public static void main(String[] args)
	{
		int ara[] = {1,2,3,4,5,6};
		int n = ara.length;
		for(int i = 0; i < n; i++)
		{
			System.out.print(ara[i]+" ");
		}
		System.out.println("\n"+(n*(n+1)/2));
	}
}
