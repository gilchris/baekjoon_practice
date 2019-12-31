import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            sc.nextLine();
            for (int t = 0; t < T; t++) {
                String L = sc.nextLine();
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
                    System.out.print(character);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}