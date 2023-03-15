package Task2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {

    private String name;
    private String countryName;
    private Double price;
    private Double weight;
    private Integer sort;



}