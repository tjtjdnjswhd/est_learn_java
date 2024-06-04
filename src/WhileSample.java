public class WhileSample {
  public static void main(String[] args) {
    int[]  numbers = {4, -6, 2, 55, -13, 7, -78, 1, 3};
    int index = 0;
    int negativeSum = 0;
    int positiveSum = 0;
    while (index < numbers.length) {
        int number = numbers[index];
        if (number > 0) {
            positiveSum += number;
        } else {
            negativeSum += number;
        }
        index++;
    }
    System.out.println("양수의 합: " + positiveSum);
    System.out.println("음수의 합: " + negativeSum);
  }
}
