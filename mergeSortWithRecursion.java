package mergeSort;
import java.util.*;
public class mergeSortWithRecursion {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int N=obj.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter Array Elements");
        for(int i=0;i<N;i++){
            arr[i]=obj.nextInt();
        }
        // Merge Sort Recursive Algorithm
        int S=0;
        int E=N-1;

        mergeSort(arr,S,E);

        System.out.println("Sorted array is :");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void mergeSort(int[] arr,int S,int E){
        // Assumption - Given array function sorts the array with help of merge function and returns the sorted array
        //Base condition
        if(S==E)
            return;
        // Main Logic
        int M=(S+E)/2;
        mergeSort(arr,S,M);
        mergeSort(arr,M+1,E);
        merge(arr,S,M,E);
    }

    public static void merge(int[] arr,int S,int M,int E){
        // Temporary Array
        int[] temp = new int[E-S+1];
        // pointers
        int P1=S;
        int P2=M+1;
        int P3=0;
        // Algorithm
        while(P1<=M && P2<=E){

            if(arr[P1]<arr[P2]){
                temp[P3]=arr[P1];
                P1++;
                P3++;
            }
            else{
                temp[P3]=arr[P2];
                P2++;
                P3++;
            }
        }
        while(P1<=M){
            temp[P3]=arr[P1];
            P1++;
            P3++;
        }
        while(P2<=E){
            temp[P3]=arr[P2];
            P2++;
            P3++;
        }
        // Copying temporary array to main array
        int j=0;
        for(int i=S;i<=E;i++){
            arr[i]=temp[j++];
        }

    }
}
