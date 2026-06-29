// Given an integer array return true if any value appears 
// at least twice in the array and return false if every
// element is distinct 

public class Practice1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("TRUE");
                    return;
                }
            }
        }
        System.out.println("FALSE");
        return;
    }
}
