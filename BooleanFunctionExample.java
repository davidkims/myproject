public class BooleanFunctionExample {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        if (checkCondition(isTrue)) {
            System.out.println("조건이 참입니다.");
        } else {
            System.out.println("조건이 거짓입니다.");
        }

        if (checkCondition(isFalse)) {
            System.out.println("이 부분은 실행되지 않습니다.");
        } else {
            System.out.println("조건이 거짓이므로 이 부분이 실행됩니다.");
        }
    }

    // 불리언 함수 정의
    public static boolean checkCondition(boolean value) {
        // 여기에 원하는 조건을 정의하면 됩니다.
        return value;
    }
}