import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(String.format("%d", a*b));
        } catch (Exception e) {
        }
    }
}