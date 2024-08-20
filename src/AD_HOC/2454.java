import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int op1 = input.nextInt();
        int op2 = input.nextInt();

        switch (op1) {
        case 0:
            System.out.println("C");
            break;
        case 1:
            switch (op2) {
            case 0:
                System.out.println("B");
                break;
            case 1:
                System.out.println("A");
            default:
                break;
            }

        default:
            break;
        }

    }
}
