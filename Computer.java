import java.io.IOException;
import java.util.Scanner;
public class Computer {
    private double Celcium;
    private double Faringate;

    Computer() throws IOException {
        System.out.print("Введите градусы в Цельсиях: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            Celcium = scanner.nextDouble();
            Faringate = (Celcium * 9f / 5f) + 32;
            System.out.println("Градусы в Фарингейт: " + Faringate);
        } else System.out.println("Вы ввели неправильное значение");
    }
}
