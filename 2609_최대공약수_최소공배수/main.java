import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        try {
            String[] inputValues = br.readLine().split(" ");
            int a = Integer.parseInt(inputValues[0]);
            int b = Integer.parseInt(inputValues[1]);

            int base = 0, rest = 0, nextRest = 0;
            if (a > b) {
                base = a;
                rest = b;
            } else {
                base = b;
                rest = a;
            }
            while ((nextRest = base % rest) > 0) {
                base = rest;
                rest = nextRest;
            }
            System.out.println(rest);

            System.out.println(rest * (a / rest) * (b / rest));
            
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