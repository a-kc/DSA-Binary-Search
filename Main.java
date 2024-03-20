import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AN!KET CHAUHAN
 */
public class Main {

    // Given a sorted array A[n] search if k is present or not

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int k = scn.nextInt();

        int start = 0;
        int end = arr.length - 1;
        boolean ans = true;

        while (start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == k){
                ans = true;
                break;
            }
            if(arr[mid] > k){
                ans = false;
                end = mid - 1;
            }else{
                ans = false;
                start = mid + 1;
            }
        }

        System.out.println(ans);


    }

}
