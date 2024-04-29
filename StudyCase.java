public class StudyCase {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide at least three arguments.");
            return;
        }

        int result = 1;
        for (String arg : args) {
            result *= Integer.parseInt(arg);
        }

        System.out.println("Result: " + result);

        if (result % 2 == 0) {
            System.out.println("Number type: Even");
        } else {
            System.out.println("Number type: Odd");
        }
    }
}
