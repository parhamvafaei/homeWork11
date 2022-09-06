package permutation;


import java.util.HashMap;
import java.util.Scanner;

public class Runner  {
    Permutation permutation = new Permutation();
    Scanner scanner =new Scanner(System.in);

    void start() {
        String input;
        System.out.println("give your String !");
        input = scanner.next();
        if (permutation.getMemory().containsValue(input)) {
            System.out.println("fail" +
                    "\n" +
                    "already given  !"+"\n  try again!");
            start();
        }
        HashMap<Integer, String> cases = permutation.permutation(input);
        Permutation.print(cases);

        System.out.println("pass!\nwanna go !\n 1-yes\n 2-no"+
                "choice 1 or 2!");
        input = scanner.next().toLowerCase();
        if (input.equals(String.valueOf(1))) {
            start();
        } else System.exit(2);
    }
    public static void main(String[] args) {
        Runner runner=new Runner();
        runner.start();
    }
    }

