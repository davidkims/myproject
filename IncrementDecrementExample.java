public class IncrementDecrementExample {
    public static void main(String[] args) {
        // 증가 연산자 사용
        int count = 5;
        System.out.println("초기값: " + count);

        // 후위 증가 연산자
        count++;
        System.out.println("후위 증가 후: " + count);

        // 전위 증가 연산자
        ++count;
        System.out.println("전위 증가 후: " + count);

        // 감소 연산자 사용
        // 후위 감소 연산자
        count--;
        System.out.println("후위 감소 후: " + count);

        // 전위 감소 연산자
        --count;
        System.out.println("전위 감소 후: " + count);
    }
}