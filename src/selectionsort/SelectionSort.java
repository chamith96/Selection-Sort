package selectionsort;

import java.util.*;
class Select{
    int min,temp;
    public void selectionSort(int[] ar){
        for(int i=0;i<ar.length-1;i++){
            min=i;           
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[min])
                    min=j;
            }
                temp=ar[min];
                ar[min]=ar[i];
                ar[i]=temp;
        }
    }
}
public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter emount of numbers you want:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Nub "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Arry Before Selection Sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("Arry After Selection Sort");
        Select ss=new Select();
        ss.selectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
