public class LargestInArray {

    static void largestInArray(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest in an array = "+largest);
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 1, 7};
        largestInArray(arr);
    }
}
