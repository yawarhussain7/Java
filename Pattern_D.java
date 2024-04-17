class Pattern_D{
	
	public static void main(String args[])
	{
		int space = 7;

		//Uper-side
		for(int i = 1; i <=7 ; i++)
		{
			for(int k = space ; k >=1; k--)
			{
				System.out.print("+");
			}

			for(int j = 1; j <= i; j++)
				{
					System.out.print("* ");
				}

				for(int k = space ; k >=1; k--)
				{
					System.out.print("+");
				}
				
				System.out.println();
				space--;
		}

		//lower-side
		int pace = 1;

		for(int i = 7; i >=1 ; i--)
		{
			for(int k = 1; k <= pace; k++)
			{
				System.out.print("+");
			}
			for(int j = 1; j <=i; j++)
			{
				System.out.print(" *");
			}
			for(int k = 1; k <= pace; k++)
			{
				System.out.print("+");
			}
			pace++;
			System.out.println();

		}
	}

}