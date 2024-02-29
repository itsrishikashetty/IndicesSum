import java.util.Scanner;

public class IndicesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        findAndPrintIndicesSum(array, target);

        scanner.close();
    }

    public static void findAndPrintIndicesSum(int[] array, int target) {
        boolean foundPair = false;

        System.out.println("Indices:");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(i + "," + j);
                    foundPair = true;
                }
            }
        }

        if (!foundPair) {
            System.out.println("-1");
        }
    }
}
