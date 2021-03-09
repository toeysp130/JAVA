import javax.swing.*;
public class binary_search {
    public static void main(String[]args){
        int array[];
        String str;
        boolean done = true;
        array = new int[20];
        setData(array);
        bubble_sort.bubbleSort(array);
        do{
            str = JOptionPane.showInputDialog("Enter value to search : ");
            int key = Integer.parseInt(str);
            int result = binarySearch(array,key);
            if(key != -1){
                if(result != -1){
                    JOptionPane.showMessageDialog(null, "Value found in element " + result , "Binary Search", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Value not found in element ", "Binary Search", JOptionPane.INFORMATION_MESSAGE);

                }
            }
            else{
                done = false;
            }
        }while(done);
    }
    public  static int binarySearch(int a[],int key){
        int low = 0,high = a.length-1,middle;
        while(low <= high){
            middle = (low+high)/2;
            if(a[middle] == key){
                return middle;
            }
            else if(key < a[middle]){
                high = middle -1;
            }
            else{
                low = middle + 1;
            }
        }
        return(-1);
    }

    public static void setData(int a[]){
        for(int c = 0 ; c < a.length ; c++){
            a[c] = rnd(1,100);
        }
    }

    public static int rnd(int st,int ed){
        int offset = ed - st +1;
        return (st + (int)(Math.random()*offset));
    }
    /*
    public static void binarySearch(int a[]){
        for(int pass = 1 ; pass < a.length ; pass++){
            for(int n = 0 ; n < a.length - pass ; n++){
                if(a[n] > a[n+1]){
                    int temp = a[n];
                    a[n] = a[n+1];
                    a[n+1] = temp;
                }
            }
        }
    }*/
}
