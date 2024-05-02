public class Human {
    String name;
    int age;
    int height;
    int iq;
    int num_guns;
    int num of nuclear_bomb;

    public Human(String name, int age, int height, int iq, int guns, int nuclear_bomb) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.iq = iq
        this.guns = guns
        this.nuclear_bomb = nuclear_bomb;
    }

    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }

    public void growOlder() {
        age++;
        System.out.println(name + " is now " + age + " years old.");
    }

    public static void main(String[] args) {
        Human person = new Human("random kid on the street", 30, 180);
        person.talk("Never gonna give you up Never gonna let you down Never gonna run around and desert you Never gonna make you cry Never gonna say goodbye Never gonna tell a lie and hurt you");

        Offspring myKid = new Offspring("Billy Bob Joe", 2, "blue", 7);
        System.out.println("Initial Eye Color: " + myKid.getEyeColor());
        myKid.changeEyeColor("green");
        System.out.println("New Eye Color: " + myKid.getEyeColor());

        person.growOlder();
    }
}

class Offspring {
    String name;
    int age;
    String eyeColor;
    int teethCount;

    public Offspring(String name, int age, String eyeColor, int teethCount) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.teethCount = teethCount;
    }

    public Offspring(String name) {
        this.name = name;
        this.age = 0;
        this.eyeColor = "Unknown";
        this.teethCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void changeEyeColor(String newColor) {
        System.out.println(name + "'s eye color changed from " + eyeColor + " to " + newColor);
        eyeColor = newColor;
    }
}
// whoever is working on this we are now collabing together to make this musty dusty code better!   

