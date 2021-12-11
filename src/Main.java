import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            String filePath = bufferedReader.readLine();
            Scanner scanner = new Scanner(new FileInputStream(filePath));

            List<Integer> integers = new ArrayList<>();
            while(scanner.hasNext()) {
                int number = scanner.nextInt();
                integers.add(number);
            }

            integers.stream().filter(x -> x  % 2 == 0).sorted().forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test path to txt file with numbers - C:\Users\anton\Desktop\test.txt

    }
}
