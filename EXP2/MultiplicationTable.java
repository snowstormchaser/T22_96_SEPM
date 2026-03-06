public class MultiplicationTable {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            System.out.println("Multiplication Table for: " + num);
            System.out.println("---------------------------");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } catch (NumberFormatException e) {
            System.out.println("Argument must be an integer.");
        }
    }
}