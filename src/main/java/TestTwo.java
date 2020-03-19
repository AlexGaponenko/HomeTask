import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String Name = in.nextLine();
        System.out.println("Вы ввели имя: " + Name);
        in.close();
        if (Name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
}