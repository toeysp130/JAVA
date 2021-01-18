import java.util.Scanner;
public class hw3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int int_input = scan.nextInt();
        String num = String.valueOf(int_input);
        
        if(num.length() == 4){
        num = String.join(" ", num.split(""));
        System.out.println(num);
        }
        else System.out.println("This number counting is over 4 ");
    }

}