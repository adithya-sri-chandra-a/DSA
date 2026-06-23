
import java.util.*;
public class LinearSearch{

    public static void linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key is at index " +i);
                return;
            }
        }
        System.out.println("KEY NOT FOUND");
    }

    public static void main(String args[]){
        int arr[] = {2, 5, 8, 1, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key to be found : ");
        int key = sc.nextInt();
        linearSearch(arr, key);
        sc.close();
    }
}