import java.util.Random;
import java.util.Scanner;

public class DZ {
    static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();

    }

    private static void startGame() {
        int x = 0;
        int random = rd.nextInt(10);
        System.out.println(random);
        int number;
        do {
            System.out.println("Введите значение: ");
            number = sc.nextInt();
            if (number > random) {
                System.out.println("Значение больше");
                ++x;
            } else if (number < random) {
                System.out.println("Значение меньше");
                ++x;
            } else {
                System.out.println("Угадал!!!");
                break;
            }
        } while (x < 3);


        x = 0;
        do {
            System.out.println("Хотите попробовать снова?  Да/Нет");
            String answer = sc.next().toLowerCase().trim(); // .trim - удаление по бокам пробеловf
            if (answer.equals("да")) {
                System.out.println("Играем снова");
                startGame();
            } else if (answer.equals("нет")) {
                System.out.println("Игра окончена");
                break;
            }else {
                ++x;
                System.out.println("Хочешь сыграть снова?");
            }
        } while (x < 3);

    }

}
