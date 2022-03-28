import java.util.Scanner;

public class BurnInputStream implements BurnStream {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int getNextBurn(DescentEvent status) {
        String[] tokens = scanner.nextLine().split(" ");
        if (tokens.length > 0) {
            while (true) {
                try {
                    int burn = Integer.parseInt(tokens[0]);
                    if(burn >= 0 && burn <= 200) {
                        return burn;
                    }
                    System.out.println("Must Enter a Number (0-200)");
                } catch (NumberFormatException e) {
                    System.err.println("Must Enter a Number (0-200)");
                }
                tokens = scanner.nextLine().split(" ");
            }
        }
        return 0;
    }
}
