import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp % 2 == 0) {
                even.add(temp);
            } else {
                odd.add(temp);
            }
        }

        int answer = 1;
        int odds = odd.size();
        if (odd.size() == 0) {
            System.out.println(1);
            System.exit(0);
        } else {
            if (even.size() > odd.size()) {
                System.out.println(2 * odds + 1);
            } else if (even.size() < odd.size()) {
                answer = even.size() * 2;
                odds = odds - even.size();

                if (odds % 3 == 0) {
                    answer += (odds/3) * 2;

                } else if (odds % 3 == 1) {
                    answer += (odds-1)/3 * 2;
                    answer -= 1;
                } else {
                    answer += (odds-2)/3 * 2;
                    answer += 1;
                }
                System.out.println(answer);
            }
        }
    }
}