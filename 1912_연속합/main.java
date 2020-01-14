import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        try {
            int n = Integer.valueOf(br.readLine());
            String[] inputStrings = br.readLine().split(" ");
            int[] inputValues = new int[n];
            for (int i = 0; i < n; i++) {
                inputValues[i] = Integer.parseInt(inputStrings[i]);
            }

            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += inputValues[j];
                    if (maxSum < sum) {
                        maxSum = sum;
                    }
                }
            }
            System.out.println(maxSum);
            
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