import java.util.Scanner;

public class NewYorkPizzaOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("뉴욕 피자 주문 프로그램에 오신 것을 환영합니다!");

        // 피자 종류 선택
        System.out.println("1. 페퍼로니 피자");
        System.out.println("2. 치즈 피자");
        System.out.print("피자 종류를 선택하세요 (1 또는 2): ");
        int pizzaType = scanner.nextInt();

        // 피자 크기 선택
        System.out.println("1. 소 (Small)");
        System.out.println("2. 중 (Medium)");
        System.out.println("3. 대 (Large)");
        System.out.print("피자 크기를 선택하세요 (1, 2, 또는 3): ");
        int pizzaSize = scanner.nextInt();

        // 주문 내역 출력
        System.out.println("\n주문 내역:");
        System.out.println("---------------");

        String pizzaTypeStr = (pizzaType == 1) ? "페퍼로니 피자" : "치즈 피자";
        String pizzaSizeStr = getPizzaSizeString(pizzaSize);

        System.out.println("피자 종류: " + pizzaTypeStr);
        System.out.println("피자 크기: " + pizzaSizeStr);

        // 피자 상태 확인 및 반품 여부 결정
        System.out.println("\n피자 상태를 확인합니다.");

        if (checkPizzaQuality()) {
            System.out.println("피자 상태가 양호합니다. 주문이 완료되었습니다. 맛있게 드세요!");

            // 배달 시뮬레이션
            System.out.print("배달을 시작하시겠습니까? (y/n): ");
            char deliveryChoice = scanner.next().charAt(0);

            if (deliveryChoice == 'y' || deliveryChoice == 'Y') {
                System.out.println("피자를 배달 중입니다. 30분 후에 도착할 예정입니다. 감사합니다!");
            } else {
                System.out.println("직접 피자를 찾아가셔도 됩니다. 감사합니다!");
            }
        } else {
            System.out.println("주문하신 피자가 상해 반품 처리됩니다. 죄송합니다.");
        }
    }

    // 피자 크기에 대한 문자열 반환
    public static String getPizzaSizeString(int size) {
        return switch (size) {
            case 1 -> "소 (Small)";
            case 2 -> "중 (Medium)";
            case 3 -> "대 (Large)";
            default -> "알 수 없음";
        };
    }

    // 피자 상태 확인
    public static boolean checkPizzaQuality() {
        // 피자 상태를 확인하는 로직을 추가하세요. 예를 들어, 냄새, 모양 등을 검사할 수 있습니다.
        // 여기에서는 간단하게 true 반환하도록 설정했습니다.
        return true;
    }
}