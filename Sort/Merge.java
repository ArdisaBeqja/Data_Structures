package Sort;

import com.sun.source.tree.MemberReferenceTree;

public class Merge {
    public static void main(String args[]){
       int []arr={1,4,2,9,10};
       Merge(arr);
       display(arr);
    }
    public static void Merge(int arr[]){
        Merge(arr,0,arr.length-1);
    }
    private static void Merge(int arr[],int l,int r){
     if(l<r){
         int m=(l+r)/2;
         Merge(arr,l,m);
         Merge(arr,m+1,r);
         Msort(arr,l,m,r);
     }

    }
    private static void Msort(int arr[],int l,int m,int r){
        int i=l;
        int j=m+1;
        int length= arr.length;
        int []temp=new int[length];
        int k=l;
        while(i<=m&&j<=r){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;i++;
            }
            else{
                temp[k]=arr[j];
                k++;j++;
            }
        }

        while(i<=m){
            temp[k]=arr[i];
            k++;i++;
        }
        while (j<=r){
            temp[k]=arr[j];
            k++;j++;
        }
        for(int x=l;x<=r;x++){
            arr[x]=temp[x];
        }

    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
