class pat{
	public static void run()
	{

		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			int k=1;
			if(i==1)
			{
				k=2;
				System.out.print("0");
			}
			for(;k<=i;k++)
			{
				System.out.print("#");
			}

			if(i!=1)
			{
				k=1;
				for(k=1;k<i;k++)
				{
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	} 
	public static void main(String[] args) {

		run();
		run();
		
	}
}