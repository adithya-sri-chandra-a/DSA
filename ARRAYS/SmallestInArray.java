public class SmallestInArray {
    static void smallestInArray(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest in an array = "+smallest);
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 1, 7};
        smallestInArray(arr);
    }
}
