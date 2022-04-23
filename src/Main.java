//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "12345";
        int var4 = random.nextInt(10);

        String passwordString;
        do {
            System.out.println("Введите пароль: ");
            passwordString = scanner.nextLine();
            mass();
        } while(!passwordString.equals(password));

        System.out.println("Пароль неверный, попробуйте снова");
    }

    private static void mass() {
        int h = 3;

        for(int i = 0; i <= h; ++i) {
            ++i;
        }

        if (h == 3) {
            System.out.println("Продолжайте ввод");
        } else {
            System.out.println("Вы заблокированы!");
        }

    }
}
