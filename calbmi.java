package watcharakorn;
import static java.lang.System.*;
public class calbmi {
	public static String cal(double w,double h)
	{
		String result = "";
		double hm = 0,bmi= 0;
		hm = h*100;
		bmi = w/(h/100*(h/100));
		out.println(bmi);
		if(bmi < 17)result = "ผอม";
		else if (bmi >= 17 && bmi <= 24.9)result = "เริ่มจะอวบ";
		else if (bmi >= 25 && bmi <= 30)result = "อวบระยะสุดท้ายหรืออ้วนแล้วล่ะ";
		else if (bmi > 30)result = "อ้วนแบบอันตรายแล้ว";
		return(result);
	}
	

}
