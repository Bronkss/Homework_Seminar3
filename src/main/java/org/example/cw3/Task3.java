package org.example.cw3;

import org.example.cw3.model.Coub;

import java.util.ArrayList;
import java.util.List;

/**
 * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд)
 * и материал (деревянный, металлический, картонный и тд.). Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 *            - количество деревянных кубиков с ребром 3 см
 */
public class Task3 {
    public static void main(String[] args) {
        Coub coub1 = new Coub("красный", 3, "Деревянный");
        Coub coub2 = new Coub("желтый", 73, "Металический");
        Coub coub3 = new Coub("зеленый", 23, "Картонный");
        Coub coub4 = new Coub("желтый", 34, "Картонный");

        List<Coub> coubList = new ArrayList<>();
        coubList.add(coub1);
        coubList.add(coub2);
        coubList.add(coub3);
        coubList.add(coub4);
        int counterCoub = 0;
        int sumVolume = 0;
        int countWood = 0;

        for (Coub coub: coubList) {
            if (coub.getColor().equals("желтый")){
                counterCoub++;
                sumVolume += volumeCube(coub.getSize());
            }
            if (coub.getMaterial().equals("Деревянный") && coub.getSize() == 3){
                countWood++;
            }
        }

        System.out.println("coub yellow color : "+ counterCoub);
        System.out.println("sum volume = "+ sumVolume);
        System.out.println("value wood coub : "+countWood);

    }

    private static int volumeCube(Integer size) {
        return size * size * size;
    }
}
