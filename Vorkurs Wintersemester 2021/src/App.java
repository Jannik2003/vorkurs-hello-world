public class App {

    public static long calcFibonacci(int val) {
        if(val <= 2)
            return 1;
        return calcFibonacci(val - 1) + calcFibonacci(val - 2);
    }
    public static void main(String[] args) throws Exception {
        int argument = Integer.parseInt(args[0]);
        long value = calcFibonacci(argument);
        System.out.printf("Fibonacci von %d: %n", argument, value);
    }
}
