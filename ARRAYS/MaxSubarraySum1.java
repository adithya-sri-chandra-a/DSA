public class MaxSubarraySum1 {
    public static void maxSubarraySum(int arr[]){
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){ 
            for(int j=i; j<arr.length; j++){
                int currSum = 0;
                for(int k=i; k<=j ; k++){
                    currSum = currSum + arr[k];
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max SubArray Sum = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSubarraySum(arr);
    }
}
