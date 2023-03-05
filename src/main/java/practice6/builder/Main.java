package practice6.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CatBuilder builder = new CatBuilder();
        director.createWhiteCat(builder);

        Cat cat = builder.getResult();
        System.out.println("created: ");
        System.out.println(cat);
    }
}
