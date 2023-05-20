package Sort;

public class Selection {
    public static void main(String args[]){
        int []arr={9,2,10,3};
        Selection(arr);
    }
    public static void Selection(int arr[]){
//        1.For each iteration find the min value
//        2.Swap that min with the number that the iteration begins with
        int min;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(i,min,arr);

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
