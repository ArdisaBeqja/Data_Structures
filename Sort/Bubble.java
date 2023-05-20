package Sort;

public class Bubble {
    public static void main(String args[]){
        int arr[]={1,9,2,4,2};
        bubble(arr);
    }
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
        display(arr);
    }

    public static void swap(int x, int y, int arr[]) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
