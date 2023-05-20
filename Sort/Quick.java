package Sort;

public class Quick {
    public static void main(String args[]){
     int []arr={1,9,3,5,0};
     Quick(arr);
     display(arr);
    }
    public static void Quick(int arr[]){
        Quick(arr,0,arr.length-1);
    }
    private static void Quick(int arr[],int f,int l){
         if(f<l){
           int p=Partition(arr,f,l);
           Quick(arr, f, p-1);
           Quick(arr,p+1,l);
         }
    }
    private static int Partition(int arr[], int f, int l) {
        int pivot = arr[l];
        int pIndex = f;

        for (int i = f; i <= l - 1; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }

        swap(arr, l, pIndex);
        return pIndex;
    }

    private static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
