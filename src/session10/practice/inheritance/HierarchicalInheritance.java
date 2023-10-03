package session10.practice.inheritance;

public class HierarchicalInheritance {
}

class Mother {
    void clean() {
        System.out.println("The mother cleans all the time");
    }
}
class Sister extends Mother {
    @Override
    void clean() {
        System.out.println("The sister cleans rarely");
    }
}
class Brother extends Mother {
    @Override
    void clean() {
        System.out.println("The brother never cleans");
    }
}

