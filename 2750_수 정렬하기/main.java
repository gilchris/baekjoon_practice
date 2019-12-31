import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<Integer> inputs = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                inputs.add(sc.nextInt());
            }
            Collections.sort(inputs);
            for (int num : inputs) {
                System.out.println(num);
            }
        } catch (Exception e) {
        }
    }
}