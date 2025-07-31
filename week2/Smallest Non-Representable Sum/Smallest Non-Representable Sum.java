import java.util.*;

public class NotASubsetSum {

    
    public static long findSmallest(int[] arr) {
        long res = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > res) break;
            res += arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " sorted positive integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        Arrays.sort(arr);

        
        long result = findSmallest(arr);
        System.out.println("Smallest number that cannot be formed as subset sum: " + result);
    }
}
