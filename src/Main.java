
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Lab 1 Java");
        print("Виберіть завдання: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            default:
                break;
        }
    }

    public static void print(String str) {System.out.print(str);}

    public static float c1(float a, float b) {
        return (((a*b)-((a+b)*(a-b)))/((b*b*b*b)+(a*a*a)))+(5*b);
    }

    public static float c2(int a, int b) {
        return ((float) ((a * b) - ((a + b) * (a - b))) /((b*b*b*b)+(a*a*a)))+(5*b);
    }

    public static int c3(float a, float b) {
        return (int) ((((a*b)-((a+b)*(a-b)))/((b*b*b*b)+(a*a*a)))+(5*b));
    }

    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        for (int element : arr) {
            uniqueElements.add(element);
        }
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int element : uniqueElements) {
            result[index++] = element;
        }
        return result;
    }

    public static void task1() {
        print("\n\nTask 1\n\n");
        print("Умова: ab-(a+b)(a-b) / (b^4+a^3) + 5b\n");
        print("Результати:\n");
        print("Параметри float, результат float: " + c1(1, 2) + "\n");
        print("Параметри int, результат float: " + c2(1, 2) + "\n");
        print("Параметри float, результат int: " + c3(1, 2) + "\n");
    }

    public static void task2() {
        print("\n\nTask 2\n\n");
        print("Введіть розмір масиву: ");
        int n = sc.nextInt();
        if(n > 300) {
            print("Розмір масиву не може бути більше 300");
            return;
        }

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = (int) Math.rint(Math.random()*10);
        }

        print("A = ");
        for (int i = 0; i < n; i++) {
            if(i < n-1) {
                print(A[i] + ", ");
            }
            else {
                print(A[i] + "");
            }
        }
        print("\n\n");

        A = removeDuplicates(A);

        for (int i = 0; i < A.length; i += 5) {
            for (int j = 0; j < 5 && (i + j) < A.length; j++) {
                print(A[i + j] + " ");
            }
            print("\n");
        }
    }

    public static void task3() {
        print("\n\nTask 3\n\n");

        print("Введіть розмірність матриці (n <= 20): ");
        int n = sc.nextInt();

        int[][] M = new int[n][n];

        int[] rowSums = new int[n];
        int[] colSums = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = (int) Math.rint(Math.random()*10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                print(M[i][j] + " ");
            }
            print("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSums[i] += M[i][j];
                colSums[i] += M[j][i];
            }
        }

        boolean noSameSums = true;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(rowSums[i] == colSums[j]) {
                    print("рядок " + (i+1) + " та стовбець " + (j+1) + ": " + rowSums[i] + " = " + colSums[j] + "\n");
                    noSameSums = false;
                }
            }
        }

        if(noSameSums) {
            print("Не знайдено рядків і стовбців суми яких однакові");
        }
    }

    public static void task4() {
        print("\n\nTask 4\n\n");

        print("Введіть текст(розділений пробілами та розділовими знаками): ");
        sc.nextLine();
        String text = sc.nextLine();

        String[] words = text.split("\\W+");
        String[] words1 = Arrays.stream(words)
                                .filter(s -> s.length() % 2 == 1)
                                .toArray(String[]::new);

        for(int i = 0; i < words1.length; i++) {
            String part1 = words1[i].substring(0, (words1[i].length() / 2));
            String part2 = words1[i].substring(((words1[i].length() / 2)) + 1);
            words1[i] = part1 + part2;
        }

        for (String s : words1) {
            print(s + " ");
        }
    }
}
