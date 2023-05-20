package Sort;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 9, 10, 2};
        insertSort(arr);
    }

    public static void insertSort(int arr[]) {
        //         1.Move form the left to the right
        //         2.Examine each item and compare it to items on the left
        //         3.Insert in the correct place
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1, arr);
                } else {
                    break;
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
