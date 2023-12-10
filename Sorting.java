import java.util.Scanner;

class Sorting {
    static void bubbleSort(int arr[], int n, int type) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (type == 1) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                } else if (type == 2) {
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
            if (swapped == false)
                break;
        }
    }
    static void printArray(int[] arr, int size, int type) {
        int i;
        System.out.println("======");
        if (type == 1) {
            System.out.println("Ascending");
        } else if (type == 2) {
            System.out.println("Descending");
        }
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("Asceding (1) atau Descending (2): ");
            int input = inputan.nextInt();

            int[] arr = { 12, 11, 13, 5, 6 };
            int n = arr.length;
            bubbleSort(arr, n, input);
            printArray(arr, n, input);
        }
    }
}