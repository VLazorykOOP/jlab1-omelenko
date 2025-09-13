public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Lab 1 Java");
        task1();
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static double c1(double a, double b) {
        return (((a*b)-((a+b)*(a-b)))/((b*b*b*b)+(a*a*a)))+(5*b);
    }

    public static double c2(int a, int b) {
        return (((a*b)-((a+b)*(a-b)))/((b*b*b*b)+(a*a*a)))+(5*b);
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


}
