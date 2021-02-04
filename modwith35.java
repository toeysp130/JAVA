import java.util.*;
public class modwith35 {

    public static void main(String[] args) {
    int start = 0;
    int end = 0;
    Scanner key = new Scanner(System.in);
    System.out.print("Enter start number : ");
    start = key.nextInt();
    System.out.print("Enter end number : ");
    end = key.nextInt();
    int count = 1;
    for(int i = start; i < end ;i++ ){
       
        if((i % 3 == 0)&&(i % 5 == 0)){
           
            if(count == 5){
                System.out.println(i);
                count = 1;
            }
            else {
                System.out.print(i + "  ");
                count++;
            }
        }
    }


    }
}