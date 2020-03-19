import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        System.out.printf("Вы ввели: %d \n", num);
        if (num > 7) {
            System.out.println("Привет");
            in.close();
        }
    }
}
