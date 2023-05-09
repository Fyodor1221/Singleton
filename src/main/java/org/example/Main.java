package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int upDivide = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int)(random.nextDouble() * upDivide));
        }
        System.out.print("Вот случайный список:");
        for (int i :list) {
            System.out.print(" " + i);
        }
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int downDivide = scanner.nextInt();
        Filter filter = new Filter(downDivide);
        List<Integer> sortedList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список:");
        for (int i : sortedList) {
            System.out.print(" " + i);
        }
        System.out.println();
        logger.log("Завершаем программу");
    }
}