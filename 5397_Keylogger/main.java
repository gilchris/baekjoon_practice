import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        try {
            int T = Integer.parseInt(br.readLine());
            for (int t = 0; t < T; t++) {
                String L = br.readLine();
                List<Character> out = new LinkedList<>();
                int cursorPosition = 0;
                int lastIndex = 0;
                for (int i = 0, l = L.length(); i < l; i++) {
                    char c = L.charAt(i);
                    switch (c) {
                        case '<':
                            if (0 < cursorPosition) {
                                cursorPosition--;
                            }
                        break;
                        case '>':
                            if (cursorPosition < lastIndex) {
                                cursorPosition++;
                            }
                        break;
                        case '-':
                            if (cursorPosition > 0) {
                                out.remove(--cursorPosition);
                                lastIndex--;
                            }
                        break;
                        default:
                        if (lastIndex <= cursorPosition) {
                            out.add(c);
                        } else {
                            out.add(cursorPosition, c);
                        }
                        cursorPosition++;
                        lastIndex++;
                    }
                }
                for (Character character : out) {
                    ps.write(character);
                }
                ps.println();
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