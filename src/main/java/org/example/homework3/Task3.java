package org.example.homework3;

import org.example.homework3.model.Books;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Task3 {
    public static void main(String[] args) {
        Books books1 = new Books("Герой нашего времени", "Лермонтов",200, 1838, 423);
        Books books2 = new Books("Благие знамения", "Терри Пратчетт",485, 2012, 509);

        List<Books> booksList = new ArrayList<>();
        booksList.add(books1);
        booksList.add(books2);

        for (int i = 0; i < booksList.size(); i++) {
            if (isPrime(booksList.get(i).getNumberPages()) && booksList.get(i).getSurnameAuthor().contains("а")
                    && booksList.get(i).getYearCreate() >= 2010){
                System.out.println(booksList.get(i).getNameBook());
            }
        }
    }

    public static boolean isPrime(Integer n){
        for (Integer i = 2; i < n; i++) {
                if (n % i == 0) return false;
                }
        return true;
    }
}
