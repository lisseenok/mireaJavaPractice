package practice2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class HumanApplication {

    public List<Human> getHumans() {
        Human human1 = new Human(18, "Max", "Ivanov", LocalDate.of(2003, 3, 12), 75);
        Human human2 = new Human(34, "Ivan", "Volodin", LocalDate.of(1987, 5, 11), 80);
        Human human3 = new Human(12, "Maria", "Ivanova", LocalDate.of(1999, 12, 23), 50);
        Human human4 = new Human(25, "Andrey", "Voronin", LocalDate.of(2001, 1, 12), 43);
        Human human5 = new Human(60, "Sasha", "Kirov", LocalDate.of(1980, 8, 1), 100);
        return List.of(human1, human2, human3, human4, human5);
    }
    /**
     * Вариант 15
     * Увеличение веса каждого объекта на 3, сортировка по весу в обратном порядке, фильтрация по дате рождения меньшей, чем 01.01.2000, сумма всех весов.
     */

    /**
     * Увеличение веса каждого объекта на 3
     */
    public List<Human> addToEachWeight(List<Human> humans, int n) {
        humans.stream().forEach(h -> h.setWeight(h.getWeight() + n));
        return humans;
    }

    /**
     * Сортировка по весу в обратном порядке
     */
    public List<Human> reverseSort(List<Human> humans) {
        return humans.stream().sorted(Comparator.comparingInt(Human::getWeight).reversed()).toList();
    }

    /**
     * Фильтрация по дате рождения меньшей, чем 01.01.2000
     */
    public List<Human> filterByDate(List<Human> humans, LocalDate date) {
        return humans.stream().filter(h -> h.getBirthDate().isBefore(date)).toList();
    }

    /**
     * Сумма всех весов
     */
    public int getSumOfAges(List<Human> humans) {
        List<Integer> weights = humans.stream().map(Human::getWeight).toList();
        return weights.stream().mapToInt(a -> a).sum();
    }
}
