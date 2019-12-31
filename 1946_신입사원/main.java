import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int N = sc.nextInt();
                int[] leftRanks = new int[N+1];
                for (int n = 0; n < N; n++) {
                    leftRanks[sc.nextInt()] = sc.nextInt();
                }

                int counter = 0;
                int minRight = N;
                for (int i = 1; i <= N; i++) {
                    int right = leftRanks[i];
                    if (minRight > right) {
                        counter++;
                        if (minRight > right) {
                            minRight = right;
                        }
                    }
                }

                System.out.println(counter);
            }
        } catch (Exception e) {
        }
    }
}