public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int low =0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                return mid; //return the index of the found element
            }
            else if(arr[mid] < target){
                low = mid+1;//search in right half
            }
            else{
                high = mid-1;//search in left half
            }
        } 

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,60,70};
        int target = 60;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }




}