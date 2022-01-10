package maxia;

public class FactorialIMPL implements Factorial {

	@Override
	public String getFactorial(int n) {
		int f= 1;
		if(n==1 || n==0)
			return "The Factorial of the Given Number is - "+f;
		else
			{for(int i=n;i>1;i--)
				f=f*i;
			}
			return "The Factorial of the Given Number is - "+f;
	}
}
