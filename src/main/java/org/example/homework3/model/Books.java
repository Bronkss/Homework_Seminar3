package org.example.homework3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
@Data
@AllArgsConstructor
public class Books {
    private String nameBook;
    private String surnameAuthor;
    private Integer price;
    private Integer yearCreate;
    private Integer numberPages;
}
