package practice2;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HumanApplication humanApplication = new HumanApplication();
        System.out.println("Список людей: ");
        List<Human> humans = humanApplication.getHumans();
        System.out.println(humans);

        System.out.println("Увеличим вес каждого человека на 3:");
        humans = humanApplication.addToEachWeight(humans, 3);
        System.out.println(humans);

        System.out.println("Отсортируем по весу в обратном порядке:");
        humans = humanApplication.reverseSort(humans);
        System.out.println(humans);

        System.out.println("Отфильтруем по дате рождения меньшей, чем 01.01.2000");
        humans = humanApplication.filterByDate(humans, LocalDate.of(2000, 1, 1));
        System.out.println(humans);

        System.out.println("Посчитаем сумму всех весов");
        int sum = humanApplication.getSumOfAges(humans);
        System.out.println(sum);
    }
}
