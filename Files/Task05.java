import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int mid = (arr.length) / 2;
        for (int j = arr[mid] - 1; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.print(arr[mid] + " ");
        for (int k = arr.length; k > arr[mid]; k--) {
            System.out.print(k + " ");
        }
        scanner.close();
    }
}
