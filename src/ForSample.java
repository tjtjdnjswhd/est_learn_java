public class ForSample {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }

    System.out.println("1부터 100까지의 짝수의 합: " + sum);

    int[] fib = new int[100];
    fib[0] = 1;
    fib[1] = 1;
    System.out.println(fib[0]);
    System.out.println(fib[1]);

    for (int i = 2; i < fib.length; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
      System.out.println(fib[i]);
    }
  }
}
