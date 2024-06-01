package binary.search;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {-100,0,0,1,4,4,5,5,95,200};
        int index = binarySearch(1, arr, arr.length);
        printArr(arr);
        System.out.println(index);
        index = binarySearch(6, arr, arr.length);
        System.out.println(index);
    }

    private static int binarySearch(int key, int[] arr, int length) {
        int start = 0;
        int end = length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                start = mid + 1;
            } else if(arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
