import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        try {
            String[] inputStrings = br.readLine().split(" ");
            int A = Integer.parseInt(inputStrings[0]);
            int B = Integer.parseInt(inputStrings[1]);

            int counter = 1;
            int n = 1;
            int sum = 0;
            while (counter <= B) {
                for (int j = 0; j < n; j++) {
                    counter++;
                    if (counter > A) {
                        sum += n;
                    }
                    if (counter > B) {
                        break;
                    }
                }
                n++;
            }
            System.out.println(sum);
            
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