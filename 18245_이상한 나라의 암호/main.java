import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        try {
            int lineCount = 2;
            while (true) {
                String line = br.readLine();
                if ("Was it a cat I saw?".equals(line)) {
                    break;
                }

                for (int i = 0; i < line.length(); i += lineCount) {
                    System.out.print(line.charAt(i));
                }
                System.out.println();

                lineCount++;
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