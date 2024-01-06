import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResourceManagementExample {
    public static void main(String[] args) {
        // 파일 경로
        String filePath = "example.txt";

        // 파일 쓰기
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, this is an example.");
        } catch (IOException e) {
            System.err.println("파일 쓰기 오류: " + e.getMessage());
        }

        // 파일 읽기
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // 파일에서 한 줄씩 읽어오기
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("파일 읽기 오류: " + e.getMessage());
        }
    }
}