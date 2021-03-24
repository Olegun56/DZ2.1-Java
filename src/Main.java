
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость билета ");
        int price = scanner.nextInt();
        int miles = price / 20;
        System.out.println("За покупку билета Вам будет начисленно баллов в кол-ве:" + miles);
    }
}
