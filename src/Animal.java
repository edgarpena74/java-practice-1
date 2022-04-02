// 
// 
// Tutorial
// 
// 

public class Animal {
  String species;
  String name;
  int age;

  public Animal() { // default constructor
    species = "None";
    name = "NoName";
    // Before
    // age = "-1";
    // After
    age = -1;
  }

  public Animal(String species, String name, int age) {
    this.species = species;
    this.name = name;
    this.age = age;
  }

  //
  public static void main(String[] args) {
    Animal newAnimal = new Animal();
  }
}

//
//
// NOTE: hashmaps arent usually a fixed size
// You could have an if statement to check the size
//
// Arrays are better for this example
//
//