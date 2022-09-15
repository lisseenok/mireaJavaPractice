package org.example.lesson3.task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }

    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer){
        computers.add(computer);
    }
    public void deleteComputer(Computer computer){
        computers.remove(computer);
    }
    public Computer findByName(String name){
        return computers.stream().filter(c -> c.getName() == name).findAny().orElse(null);
    }
}
