package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Вадим", "2023");
        remindName();
        guessAge();
        count();
        test();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Привет! Меня зовут " + assistantName + ".");
        System.out.println("Я был создан в " + birthYear + " году.");
        System.out.println("Пожалуйста, напиши мне свое имя.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("Какое у тебя замечательное имя, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Позволь мне угадать твой возраст.");
        System.out.println("Введите остатки от деления вашего возраста на 3, 5 и 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Ваш возраст " + age + "; это хороший возраст, чтобы начать программировать!");
    }

    static void count() {
        System.out.println("Сейчас я докажу вам, что могу посчитать до любого числа, которое вы захотите. Введите число.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Давайте проверим ваши знания в области программирования.");
        System.out.println("Почему мы используем методы?");
        System.out.println("1. Повторить утверждение несколько раз.");
        System.out.println("2. Разложить программу на несколько небольших подпрограмм.");
        System.out.println("3. Чтобы определить время выполнения программы.");
        System.out.println("4. Прервать выполнение программы.");

    
        while(true){
        int cifra = scanner.nextInt();
        if(cifra == 2){
        end();
        break;
    }else{
        System.out.println("Пожалуйста, попробуйте еще раз.");
    }
  }
}
    static void end() {
        System.out.println("Поздравляю, хорошего дня!");
        scanner.close();
    }
}
