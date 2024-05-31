public class StringSample {
  public static void main(String[] args) {
    //    String firstName = "won jong";
    //    String lastName = "seo";
    //    String phone = "Galaxy";
    //    String status = "student";
    //
    //    String a = "ESTSOFT";
    //    System.out.println(a.contains("SOFT"));
    //
    //    String find = "Say my name";
    //    System.out.println(find.charAt(3));
    //
    //    문자열 교체
    //    replaceAll은 정규식을 사용할 수 있음
    //    String replace = "Say my name";
    //    System.out.println(replace.replaceAll("my", "your"));

    // subString
    // startIndex부터 endIndex 전까지 문자열을 반환
    String sub = "WEEEE ASKE ;DN";
    System.out.println(sub.substring(0, 5));
    System.out.println(
        sub.substring(0, 3) + sub.substring(8, 10) + sub.substring(13, 14) + sub.substring(12, 13));

    // split
    // 정규식을 사용해 문자열을 나눔
    String split = "a:b:c:d";
    String[] result = split.split(":");

    // format
    // 문자열을 지정된 형식으로 변환
    String name0 = "Tim";
    int age0 = 30;

    String name1 = "Anna";
    int age1 = 45;

    String.format("%s의 나이는 %d세입니다", name0, age0);
    String.format("%s의 나이는 %d세입니다", name1, age1);

    // StringBuffer, StringBuilder
    // 문자열을 추가/수정할 때 사용
    // String.concat()은 새로운 문자열을 생성하기 때문에 성능이 떨어짐
    // StringBuffer, StringBuilder는 새로운 문자열을 생성하지 않고 저장함
    // StringBuffer는 thread-safe

  }
}
