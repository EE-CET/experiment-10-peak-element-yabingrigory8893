import java.util.Scanner;

public class PeakElement {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                }
            }
            
            int peakIndex = -1;
            if (n == 1) {
                peakIndex = 0;
            } else {
                for (int i = 0; i < n; i++) {
                    if (i == 0) {
                        if (arr[0] >= arr[1]) {
                            peakIndex = 0;
                            break;
                        }
                    } else if (i == n - 1) {
                        if (arr[n - 1] >= arr[n - 2]) {
                            peakIndex = n - 1;
                            break;
                        }
                    } else {
                        if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                            peakIndex = i;
                            break;
                        }
                    }
                }
            }
            
            System.out.println(peakIndex);
        }
    }
}


