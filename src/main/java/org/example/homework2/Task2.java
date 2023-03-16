package org.example.homework2;

import org.example.homework2.model.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Task2 {
    public static void main(String[] args) {
        Products products1 = new Products("Orange","Russia", 120.0, 200, 2);
        Products products2 = new Products("Pineapple","America", 200.0, 100, 2);
        Products products3 = new Products("Grape","China", 256.0, 50, 1);
        Products products4 = new Products("Lemon","Japan", 985.0, 50, 1);
        Products products5 = new Products("Lemon","Japan", 985.0, 50, 4);

        List<Products> listProducts = new ArrayList<>();
        listProducts.add(products1);
        listProducts.add(products2);
        listProducts.add(products3);
        listProducts.add(products4);
        listProducts.add(products5);
        int minPrice = Integer.MAX_VALUE;
        List<String> nameProducts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите интересующий вас сорт товара: ");
        int userNumber = scanner.nextInt();

        for (int i = 0; i < listProducts.size(); i++) {
            if(userNumber == listProducts.get(i).getSorted()){
                if (listProducts.get(i).getPrice() <= minPrice){
                    minPrice = listProducts.get(i).getPrice();
                }
            }
        }

        for (int i = 0; i < listProducts.size(); i++) {
            if(userNumber == listProducts.get(i).getSorted()){
                if (listProducts.get(i).getPrice() <= minPrice){
                    nameProducts.add(listProducts.get(i).getName());
                }
            }
        }
        scanner.close();
        System.out.println("Товары с наименьшей ценой : "+ nameProducts);
    }
}
