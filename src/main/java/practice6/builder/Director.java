package practice6.builder;

public class Director {

    public void createBlackCat(Builder builder) {
        builder.setColor(CatColor.BLACK);
        builder.setName("Tom");
        builder.setAge(1);
        builder.setWeight(4);
    }

    public void createWhiteCat(Builder builder) {
        builder.setColor(CatColor.WHITE);
        builder.setName("Sonya");
        builder.setAge(3);
        builder.setWeight(5);
    }

    public void createOrangeCat(Builder builder) {
        builder.setColor(CatColor.ORANGE);
        builder.setName("Max");
        builder.setAge(10);
        builder.setWeight(8);
    }
}
