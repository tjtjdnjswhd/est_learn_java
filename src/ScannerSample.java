import java.util.Random;
import java.util.Scanner;

public class ScannerSample {
  public static void main(String[] args) {
    //    Scanner scanner = new Scanner(System.in);
    //
    //    System.out.println("계절을 맞춰보세요");
    //    System.out.println("봄: 1, 여름: 2, 가을: 3, 겨울: 4");
    //
    //    int season = scanner.nextInt();
    //
    //    switch (season) {
    //      case 1:
    //        System.out.println("봄");
    //        break;
    //      case 2:
    //        System.out.println("여름");
    //        break;
    //      case 3:
    //        System.out.println("가을");
    //        break;
    //      case 4:
    //        System.out.println("겨울");
    //        break;
    //      default:
    //        System.out.println("잘못된 입력입니다.");
    //        break;
    //    }

    //    Scanner sc = new Scanner(System.in);
    //    Random random = new Random();
    //    int targetNumber = random.nextInt(100) + 1;
    //
    //    System.out.println("1부터 100까지의 숫자를 맞춰보세요");
    //
    //    while (true) {
    //      int number = sc.nextInt();
    //      if (number == targetNumber) {
    //        System.out.println("정답입니다!");
    //        break;
    //      } else if (number > targetNumber) {
    //        System.out.println("더 작은 수입니다.");
    //      } else {
    //        System.out.println("더 큰 수입니다.");
    //      }
    //    }
    //
    //    sc.close();

    Scanner sc = new Scanner(System.in);

    System.out.println("영화 제목을 입력해주세요");
    String title = sc.nextLine();

    System.out.println("관람하실 인원수를 입력해주세요");
    int audience = sc.nextInt();
    sc.nextLine();

    System.out.println("예매자 이름을 입력해주세요");
    String name = sc.nextLine();

    System.out.println("전화번호를 입력해주세요");
    String phoneNumber = sc.nextLine();

    System.out.println("===== 영화 티켓 예매 정보 =====");
    System.out.println("영화 제목: " + title);
    System.out.println("관람 인원: " + audience + "명");
    System.out.println("예매자 이름: " + name);
    System.out.println("예매자 전화번호: " + phoneNumber);
    System.out.println("총 결제 금액: " + audience * 10000 + "원");

    sc.close();
  }
}
