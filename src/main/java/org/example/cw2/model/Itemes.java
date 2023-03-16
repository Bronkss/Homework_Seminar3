package org.example.cw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Itemes {
    private String surname;
    private Integer numberGroup;
    private Integer stipend;
    private List<Integer> score;


}
