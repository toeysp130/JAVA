
public class calpapa {
	public static double cal(int n)
	{
		double kun = 0;
		if(n > 0 && n < 51)kun = 3.25;
		else if (n > 50 && n < 101)kun = 4.5;
		else if (n > 100)kun = 5.25;
		return(n*kun);
	}
}
