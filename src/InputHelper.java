import java.util.Scanner;

public class InputHelper {

    public static int getInt(Scanner scan, String prompt) {
        int num = 0;
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                done = true;
            } else {
                System.out.println("Invalid num - " + prompt.toLowerCase());
            }
            scan.nextLine();
        } while (!done);
        return num;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double num = 0;
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                num = scan.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid num - " + prompt.toLowerCase());
            }
            scan.nextLine();
        } while (!done);
        return num;
    }


    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int num = 0;
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid num - please enter in a positive nonzero integer value.");
                }
            } else {
                System.out.println("Invalid num - please enter in a positive nonzero integer value.");
            }
            scan.nextLine();
        } while (!done);
        return num;
    }

    public static int getRangedInt(Scanner scan, String prompt, int lowerBound, int upperBound) {
        int num = 0;
        boolean done = false;

        System.out.println(prompt + " [" + lowerBound + "-" + upperBound + "].");
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num <= upperBound && num >= lowerBound) {
                    done = true;
                } else {
                    System.out.println("Invalid num - " + prompt.toLowerCase() + " [" + lowerBound + "-" + upperBound + "].");
                }
            } else {
                System.out.println("Invalid num - " + prompt.toLowerCase() + " [" + lowerBound + "-" + upperBound + "].");
            }
            scan.nextLine();
        } while (!done);
        return num;
    }

    public static double getRangedDouble(Scanner scan, String prompt, double lowerBound, double upperBound) {
        double num = 0;
        boolean done = false;

        System.out.println(prompt + "[" + lowerBound + "-" + upperBound + "].");
        do {
            if (scan.hasNextDouble()) {
                num = scan.nextDouble();
                if (num <= upperBound && num >= lowerBound) {
                    done = true;
                } else {
                    System.out.println("Invalid num - " + prompt.toLowerCase() + lowerBound + "-" + upperBound + ".");
                }
            } else {
                System.out.println("Invalid num - " + prompt.toLowerCase() + lowerBound + "-" + upperBound + ".");
            }
            scan.nextLine();
        } while (!done);
        return num;
    }

    public static String getRegEx(Scanner scan, String prompt, String regExPattern) {

        String input;
        boolean done = false;

        System.out.println(prompt);

        do {
            input = scan.nextLine();
            if (input.matches(regExPattern)) {
                done = true;
            } else {
                System.out.println("Invalid input - " + prompt.toLowerCase() + ".");
            }
        } while (!done);
        return input;

    }

    public static int getNonZeroLenString(String prompt, Scanner scan) {
        String input;
        boolean done = false;

        System.out.println(prompt);

        do {
            input = scan.nextLine();
            if (input.length() <= 0) {
                System.out.println("Invalid input. " + prompt + ".");
            } else {
                done = true;

            }
        } while (!done);

        return input.length();
    }

    public static boolean getYNConfirm(String prompt, Scanner scan) {

        System.out.println(prompt);

        String input = scan.nextLine();
        boolean done = false;
        boolean confirm = false;

        do {
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
                if (input.equalsIgnoreCase("y")) {
                    confirm = true;
                    done = true;
                } else {
                    confirm = false;
                    done = true;
                }

            }
        } while (!done);
        return confirm;
    }

    public static void prettyHeader(String msg) {

    }


}