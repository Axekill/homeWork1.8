import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        tack4();

    }


    private static void task1() {
        System.out.println("задача 1");
        int[] mas = new int[3];
        double[] dmas = {1.57, 7.654, 9.986};
        int[] svoi = new int[5];
    }

    private static void task2() {
        System.out.println("задача 2");
        int[] mas = new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
            System.out.print(mas[i] + ", ");
        }
        System.out.println();
        double[] dmas = {1.57, 7.654, 9.986};
        for (int i = 0; i < dmas.length; i++) {
            System.out.print(dmas[i] + ", ");
        }

        System.out.println();
        int[] svoi = new int[5];
        for (int i = 0; i < svoi.length; i++) {
            svoi[i] = i + 5;
            System.out.print(svoi[i] + ", ");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("задача 3");
        int[] mas = new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println();

        double[] dmas = {1.57, 7.654, 9.986};
        for (int i = dmas.length - 1; i >= 0; i--) {
            System.out.print(dmas[i] + ", ");
        }

        System.out.println();
        int[] svoi = new int[5];
        for (int i = 0; i < svoi.length; i++) {
            svoi[i] = i + 5;
        }
        for (int i = svoi.length - 1; i >= 0; i--) {
            System.out.print(svoi[i] + ", ");
        }
        System.out.println();
    }

    private static void tack4() {
        System.out.println("задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
            } else {
                arr[i] += 1;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }


}