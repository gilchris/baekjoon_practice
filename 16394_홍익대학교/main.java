import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(sc.nextInt() - 1946);
        } catch (Exception e) {
        }
    }
}