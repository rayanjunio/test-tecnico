package fibonacci.exercicio2;


public class Fibonacci {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(Fibonacci(n));
    }

    public static String Fibonacci(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return "O número pertence a sequência de fibonacci.";
        } else {
            int valorAnterior1 = 1;
            int fibonacci = 1;

            for (int i = 2; i <= n; i++) {
                int aux = fibonacci;
                fibonacci = fibonacci + valorAnterior1;
                valorAnterior1 = aux;
                if (fibonacci == n) {
                    return "O número pertence a sequência de fibonacci.";
                }
            }
            return "O número não pertence a sequência de fibonacci.";
         }
    }
}
