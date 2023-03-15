package Task3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {

    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pgNum;



}
