package org.example.cw1;

import org.example.cw1.model.Itemes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Itemes itemes = new Itemes("qwe","zxc",3.0);
        Itemes itemes1 = new Itemes("qwe1","asd",3.0);
        Itemes itemes2 = new Itemes("qwe2","rte",3.0);
        Itemes itemes3 = new Itemes("qwe","ztt",3.0);

        List<Itemes> itemesList = new ArrayList<>();
        itemesList.add(itemes);
        itemesList.add(itemes1);
        itemesList.add(itemes2);
        itemesList.add(itemes3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наименование товара: ");
        String searchName = scanner.nextLine();
        int sumVolumes = 0;
        List<String> country = new ArrayList<>();

        for (int i = 0; i < itemesList.size(); i++) {
            if(itemesList.get(i).getName().equals(searchName)){
                sumVolumes += itemesList.get(i).getVolume();
                country.add(itemesList.get(i).getCountry());
            }
        }

        System.out.println("sum = "+ sumVolumes);
        System.out.println(" country : "+ country);
    }
}
