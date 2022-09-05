package permutation;


import java.util.HashMap;
import java.util.Scanner;

public class Runner  {


    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        Scanner scanner =new Scanner(System.in);
        String input;
        System.out.println("give your String !");
        input = scanner.next();
        HashMap<Integer, String> cases = permutation.permutation(input);
        Permutation.print(cases);
        System.out.println("wanna go !\n 1-yes\n 2-no");
        input = scanner.next().toLowerCase();
        if (input == String.valueOf(1)) {
            main();
        } else System.exit(2);
    }
    }

