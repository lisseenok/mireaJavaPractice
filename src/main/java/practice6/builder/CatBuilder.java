package practice6.builder;

public class CatBuilder implements Builder {

    private String name;
    private int age;
    private CatColor color;

    private int weight;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setColor(CatColor color) {
        this.color = color;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat getResult() {
        return new Cat(name, age, color, weight);
    }
}
