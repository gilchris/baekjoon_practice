import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        try {
            int n = Integer.parseInt(br.readLine());

            if (0 == n) {
                System.out.println(0);
            } else if (1 == n) {
                System.out.println(1);
            } else {
                int prev = 0, now = 1;
                for (int i = 2; i <= n; i++) {
                    int tmp = now;
                    now += prev;
                    prev = tmp;
                }
                System.out.println(now);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e1) {
            }
            ps.close();
        }
    }
}