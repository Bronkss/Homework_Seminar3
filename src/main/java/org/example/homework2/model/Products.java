package org.example.homework2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
@Data
@AllArgsConstructor
public class Products {
    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private Integer sorted;
}
