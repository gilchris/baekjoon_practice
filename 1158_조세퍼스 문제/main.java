import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), k = sc.nextInt();
            List<Integer> q = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                q.add(i);
            }
            List<Integer> out = new ArrayList<>(n);
            int pos = 0;
            k--;
            for (int qSize = n; qSize > 0; qSize--) {
                pos = (pos + k) % qSize;
                out.add(q.remove(pos));
            }
            System.out.println("<"+out.stream().map(num -> String.valueOf(num)).collect(Collectors.joining(", "))+">");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}