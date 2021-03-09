public class example_foreach {
    public static void main(String[]args){
        int data[] = new int[10];
        /*
        for(int n = 0 ; n < data.length ; n++){
            System.out.println(data[n]);
        }
        */
        for (int i : data) {
            System.out.println(i);
        }
    }
}
