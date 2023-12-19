package ro.itschool.project.utils.design_patterns;

import java.util.ArrayList;
import java.util.List;

public class SingletonPractice {
}


class Catalog{

    private static Catalog instance;

    private List<String> books;

    private Catalog() {
        books = new ArrayList<>();
    }

    public synchronized static Catalog getInstance() {
        if (instance == null) {
            instance = new Catalog();
        }

        return instance;
    }
}