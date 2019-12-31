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
            int a = Integer.parseInt(br.readLine());

            boolean[] primeNumberTest = new boolean[(a+1)];
            List<Integer> primeNumbers = new ArrayList<>();
            for (int i = 0; i <= a; i++) {
                primeNumberTest[i] = true;
            }
            for (int i = 2; i <= a; i++) {
                if (primeNumberTest[i]) {
                    primeNumbers.add(i);
                    for (int j = i * 2; j <= a; j += i) {
                        primeNumberTest[j] = false;
                    }
                }
            }

            for (int primeNumber : primeNumbers) {
                while (0 == a % primeNumber) {
                    a = a / primeNumber;
                    System.out.println(primeNumber);
                    if (1 == a) {
                        break;
                    }
                }
                if (1 == a) {
                    break;
                }
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