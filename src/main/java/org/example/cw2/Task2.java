package org.example.cw2;

import org.example.cw2.model.Itemes;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.	Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
 * Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */
public class Task2 {
    public static void main(String[] args) {
        Itemes itemes = new Itemes("Иванова", 2, 2000, List.of(3,4,5));
        Itemes itemes1 = new Itemes("Смирнов", 3, 1000, List.of(2,2,3));
        Itemes itemes2 = new Itemes("Гладкий", 4, 2000, List.of(5, 5, 5));
        Itemes itemes3 = new Itemes("Воля", 5, 2000, List.of(4,5,3));
        Itemes itemes4 = new Itemes("Сидорова", 6, 500, List.of(4,4,2));

        List<Itemes> itemesList = new ArrayList<>();
        itemesList.add(itemes);
        itemesList.add(itemes1);
        itemesList.add(itemes2);
        itemesList.add(itemes3);
        itemesList.add(itemes4);

        for (Itemes el: itemesList) {
            int sum = 0;
            for (int es: el.getScore()) {
                sum += es;
            }

            if (el.getSurname().endsWith("ова") && sum % 2 == 0) {
                System.out.println(el.getStipend());
            }
        }
    }
}
