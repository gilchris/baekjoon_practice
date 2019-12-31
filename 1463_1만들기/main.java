import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {
    private static int min = 1000000;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        try {
            int n = Integer.parseInt(br.readLine());
            
            Main.cal(n, 0);
            System.out.println(min);
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

    private static void cal(int n, int cnt) {
        if (1 == n && min > cnt) {
            min = cnt;
            return;
        }
        cnt++;
        if (min <= cnt) {
            return;
        }
        if (0 == n % 3) {
            cal((int)(n / 3), cnt);
        }
        if (0 == n % 2) {
            cal((int)(n / 2), cnt);
        }
        n--;
        if (n > 0) {
            cal(n, cnt);
        }
    }
}