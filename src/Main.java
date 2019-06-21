import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = read.nextInt();
        System.out.println("Enter a base of 10 or less:");
        int base = read.nextInt();
        if (base > 10) {
            System.out.println("Error! Base is too high!");
            return;
        }
        String numS = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numS.length(); i++) {
            if (Integer.parseInt(numS.charAt(i) + "") >= base) {
                System.out.println("Error! Number is not in proper format!");
                return;
            }
            if (numS.charAt(i) != '0') {
                sum += (Math.pow(base, (numS.length() - 1) - i)) * Integer.parseInt(numS.charAt(i) + "");
            }
        }
        System.out.println(sum);
    }
}
