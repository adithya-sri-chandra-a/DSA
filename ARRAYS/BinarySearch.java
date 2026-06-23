import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 10, 6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to be found : ");
        int key = sc.nextInt();
        int index = binarySearch(arr,key);
        System.out.println("key found at index "+index);
        sc.close();
    }
}