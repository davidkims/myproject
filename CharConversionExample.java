public class CharConversionExample {
    public static void main(String[] args) {
        // 문자 변환
        char charValue = 'A';
        System.out.println("문자: " + charValue);

        // 아스키 코드로 변환
        System.out.println("아스키 코드: " + (int) charValue);

        // 유니코드로 출력
        char unicodeChar = 'A'; // 'A'의 유니코드
        System.out.println("유니코드로 출력: " + unicodeChar);
    }
}