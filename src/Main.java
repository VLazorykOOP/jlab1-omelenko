
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Lab 1 Java");
        task3();
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static double c1(double a, double b) {
        return (((a*b)-((a+b)*(a-b)))/((b*b*b*b)+(a*a*a)))+(5*b);
    }

    public static double c2(int a, int b) {
        return ((double) ((a * b) - ((a + b) * (a - b))) /((b*b*b*b)+(a*a*a)))+(5*b);
    }

    public static int c3(double a, double b) {
        return (int) ((((a*b)-((a+b)*(a-b)))/((b*b*b*b)+(a*a*a)))+(5*b));
    }

    public static void task1() {
        print("\n\nTask 1\n\n");
        print("Умова: ab-(a+b)(a-b) / (b^4+a^3) + 5b\n");
        print("Результати:\n");
        print("Параметри double, результат double: " + c1(1, 2));
        print("Параметри int, результат double: " + c2(1, 2));
        print("Параметри double, результат int: " + c3(1, 2));
    }

    public static void task2() {
        print("\n\nTask 2\n\n");
        print("Введіть половину розміру масиву: ");
        int n = sc.nextInt();
        if(n > 200) {
            print("Розмір масиву не може бути більше 200");
            return;
        }

        double[] A = new double[2*n];

        for (int i = 0; i < 2*n; i++) {
            A[i] = Math.random();
        }

        for (int i = 0; i < 2*n; i++) {
            print("A[" + i + "] = " + A[i]);
        }
        print("\n\n");

        double average = 0;
        for (int i = 0; i < n; i++) {
            average += A[i];
        }
        average = average / n;

        double sum = 0;

        for (int i = n+1; i < 2*n; i++) {
            if(A[i] < average)
            {
                sum += A[i];
            }
        }

        print("Сума елементів, які більші за середнє арифметичне перших " + n + " елементів: " + sum);
    }

    public static void task3() {
        print("\n\nTask 3\n\n");
        print("Введіть розмірність матриці (nxn): ");
        int n = sc.nextInt();
        if(n > 20) {
            print("Розмірність матриці не може бути більше 20");
            return;
        }

        double[][] A = new double[n][n];
        double[] B = new double[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = Math.random();
            }
        }

        for (int i = 0; i < n; i++) {
            double average = 0;
            for (int j = 0; j < n; j++) {
                average += A[i][j];
            }
            B[i] = average / n;
        }

        print("\n\nВектор B побудований з середніх арифметичних рядків матриці А: \n\n B = [");
        for (int i = 0; i < n; i++) {
            if (i < n-1)
            {
                print(B[i]+", ");
            }
            else
            {
                print(B[i]+"\n]");
            }
        }

    }
}
