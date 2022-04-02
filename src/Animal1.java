public class Animal1 {
    String species;
    String name;
    int age;

    public Animal1() { // default constructor
        species = "None";
        name = "NoName";
        age = -1;
    }

    public Animal1(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
