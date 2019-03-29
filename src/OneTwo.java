/*
 * Program to Print pattern as
1
121
12321
1234321
123454321
 */





public class OneTwo {

	public static void main(String ar[])
	{
		int i,j,k,p=1;
		for(i=1;i<=5;i++)
		{
			p=1;
			for(j=1;j<=i;j++)
			{
				System.out.print(p);
				p++;
			}
			for(k=1;k<i;k++)
			{
				p=p-2;
				System.out.print(p);
				p++;
			}
				System.out.println();
		}
	}
}
