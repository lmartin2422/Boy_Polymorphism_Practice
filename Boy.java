public class Boy {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void buyItem(String item) {
        System.out.println(name + " is buying a " + item + " in the shop");
    }

    public void studying(String course) {
        System.out.println(name + " is studying " + course + " in school");
        System.out.println(name + getName());
    }
}


