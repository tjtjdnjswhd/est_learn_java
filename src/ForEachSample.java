public class ForEachSample {
  public static void main(String[] args) {
    int[] scores = {1, 66, 3, 22, 151, 56};
    int sum = 0;
    for (int score : scores) {
      sum += score;
    }

    System.out.println("총합: " + sum);
    System.out.println("평균: " + sum / (double) scores.length);

    String[] names = {"apple", "banana", "cherry", "durian"};
    for (String name0 : names) {
      for (String name1 : names) {
        if (!name0.equals(name1)) {
          System.out.println(name0 + " " + name1);
        }
      }
    }

  }
}
