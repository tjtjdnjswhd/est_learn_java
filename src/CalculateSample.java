public class CalculateSample {
  public static void main(String[] args) {
    // "hello" + 12 -> "hello12"
    // "hello12" + 34 -> "hello1234"
    System.out.println("hello" + 12 + 34);

    // 12 + 34 -> 46
    // 46 + "hello" -> "46hello"
    System.out.println(12 + 34 + "hello");

    StringBuilder sb = new StringBuilder();
    sb.append(12);
    sb.append(34);
    sb.append("hello");

    // 1234hello
    System.out.println(sb);
  }
}
