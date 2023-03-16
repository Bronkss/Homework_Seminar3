package org.example.homework1;

import org.example.homework1.model.Products;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Task1 {
    public static void main(String[] args) {
        Products products1 = new Products("мандарин высший", 100.0, 2);
        Products products2 = new Products("апельсин обычный", 80.0, 1);
        Products products3 = new Products("арбуз высший", 500.50, 3);
        Products products4 = new Products("ананас обычный", 1000.0, 1);
        Products products5 = new Products("банан средний", 124.45, 3);
        Products products6 = new Products("киви высший", 284.32, 2);
        Products products7 = new Products("сыр высший самый лучший", 10_000.0, 1);

        List<Products> productsList = new ArrayList<>();
        productsList.add(products1);
        productsList.add(products2);
        productsList.add(products3);
        productsList.add(products4);
        productsList.add(products5);
        productsList.add(products6);
        productsList.add(products7);
        double maxPrice = 0;

        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().contains("высший") && (productsList.get(i).getSort() == 2
                    || productsList.get(i).getSort() == 1) ) {
                if (productsList.get(i).getPrice() > maxPrice) maxPrice = productsList.get(i).getPrice();
            }
        }

        System.out.println("Наивысшая цена товара = "+ maxPrice);
    }
}



