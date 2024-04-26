public class Soul {}

public class Main {
    public static void main(String[] args) throws Exception {
        Soul adrian = new Soul("coolboy", 25, 14999);
        Soul teacher = new Soul("wiseoldman", 60, 15000);
    }
}

class Soul {
    String name;
    int age;
    int intellect;

    public Soul(String name, int age, int intellect) {
        this.name = name;
        this.age = age;
        this.intellect = intellect;
    }
}
