import static java.lang.System.*;
import java.text.DecimalFormat;
public class assignment1_1 {
	public static void main(String[] args) {
		int mathc = 3,func = 3,compc = 3,proc = 3,eng1 = 3,danc = 1,sysc = 3,totalc=0;
		float mathg = 2.5f,fung = 4,compg = 4,prog = 3,eng1g = 2.5f,cang = 4,sysg = 3.5f;
		double avg = 0,avr = 0,range = 0;
		DecimalFormat pos = new DecimalFormat();
		DecimalFormat posa = new DecimalFormat();
		posa.applyPattern("0.0");
		pos.applyPattern("0.000");
		out.println("___________________________________________________________________________________");
		out.println("\t\t\t\tปีการศึกษา 2562 ภาคเรียนที่ 1 ");
		out.println("___________________________________________________________________________________");
		out.print("\t\tชื่อวิชา\t");
		out.print("\t\t  หน่วยกิต");
		out.print("\t\tตอนเรียน");
		out.println("\t\tเกรด");
		out.println("___________________________________________________________________________________");
		out.println("040203100   GENERAL MATHEMATICS\t\t    " + mathc + "\t\t  9\t\t" + change(mathg));
		out.println("060243101   FUNDAMENTAL OF INFORMATION T    " + func + "\t\t  3\t\t" + change(fung));
		out.println("060243102   COMPUTER PROGRAMMING\t    " + compc + "\t\t  3\t\t" + change(compg));
		out.println("060243103   PROBLEM SOLVING IN INFORMATI    " + proc + "\t\t  1\t\t" + change(prog));
		out.println("080103001   ENGLISH I\t\t\t    " + eng1 +"\t\t  3\t\t" + change(eng1g));
		out.println("080303504   DANCING\t\t\t    " + danc + "\t\t  9\t\t" + change(cang));
		out.println("080303606   SYSTEMATIC AND CREATIVE THIN    " + sysc + "\t\t 15\t\t" + change(sysg));
		out.println("___________________________________________________________________________________");
		totalc += mathc + func + compc + proc + eng1 + danc + sysc;
		avg += (mathc*mathg)+(func*fung)+(compc*compg)+(proc*prog)+(eng1*eng1g)+(danc*cang)+(sysc*sysg);
		avr += avg/totalc;
		range += avr*totalc;
		out.println("\t\t" + "   คะแนนเฉลี่ย\t" + " หน่วยกิตที่ลง\t" + " หน่วยกิตที่ได้\t" + " แต้มระดับคะแนน\t") ;
		out.println("   ประจำภาค" + "\t    " + pos.format(avr) + "\t    " + totalc + "\t\t    " + totalc + "\t\t    " + posa.format(range));
		out.println("     สะสม" + "\t    " + pos.format(avr) + "\t    " + totalc + "\t\t    " + totalc + "\t\t    " + posa.format(range));
		out.println("   สถานภาพ" + "\t     " + "ปกติ");
		out.println("___________________________________________________________________________________");
	}
	public static String change(float g) {
		String grade;
		if(g == 4)grade = "A";
		else if(g == 3.5)grade = "B+";
		else if(g == 3)grade = "B";
		else if(g == 2.5)grade = "C+";
		else if(g == 2)grade = "C";
		else if(g == 1.5)grade = "D+";
		else if(g == 1)grade = "D";
		else if(g == 0)grade = "F";
		else grade = "Error will be to W";
		return(grade);
	}
}
