public class Test {
  public static void main(String[] args) {
    char c0 = '가';
    // 유니코드 지원
    char c1 = '\uac00';
    int unicode = c1;
    System.out.println(c0);
    System.out.println(c1);
    System.out.println(unicode);

    float val = 3.14f;
    float val1 = val * 2;

    System.out.println(val);
    System.out.println(val1);
  }
}
