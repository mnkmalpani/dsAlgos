package ds.algo.mayank.prepare;

import java.util.Arrays;

public class MergeSortCountInversions {

    private int mergSort(int[] arr, int l, int r){
        int count=0;
        if(l<r){
            int mid = (l+r)/2;

            count += mergSort(arr,l,mid-1);
            count += mergSort(arr,mid,r);
            count += mergCount(arr,new int[arr.length],l,mid,r);
        }
        return count;
    }

    private int mergCount(int[] arr, int[] temp, int l, int mid, int r) {
        int i=l,j=mid+1,k=l;
        int inCount=0;

            while(i<=mid && j<=r){
                if(arr[i]<arr[j]){
                    temp[k++]=arr[i++];
                }
                else{
                    temp[k++] = arr[j++];
                    inCount += (mid + 1) - ( l + i );
                }
            }

            while (i<=mid){
                temp[k++]=arr[i++];
            }

            while (j<=r){
                temp[k++] = arr[j++];
             }

            for(i=l;i<=r;i++)
                arr[i]=temp[i];

        return inCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6};

        MergeSortCountInversions ob = new MergeSortCountInversions();
        System.out.println(ob.mergSort(arr,0,arr.length-1));
    }
}
