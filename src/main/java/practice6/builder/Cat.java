package practice6.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Cat {

    private String name;
    private int age;
    private CatColor color;

    private int weight;
}
