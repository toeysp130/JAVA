package watcharakorn;
import static java.lang.System.*;
import java.util.*;
public class assignment2_1 {
	public static void main(String[] args) {
		double w,h;
		String result;
		Scanner in = new Scanner(System.in);
		out.print("Enter Wight : ");
		w = in.nextDouble();
		out.print("Enter height : ");
		h = in.nextDouble();
		result = calbmi.cal(w,h);
		out.println("result : " + result);
	}
}

