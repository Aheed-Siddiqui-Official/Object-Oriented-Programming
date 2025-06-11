// abstract class Animal {
//     abstract void walk() ;

//     Animal() {
//         System.out.println("You are creating a new animal");
//     }

//     public void eat() {
//         System.out.println("Animal Eats");
//     }
// }


// class Horse extends Animal {
//     Horse() {
//         System.out.println("Created a Horse");
//     }
//     public void walk() {
//         System.out.println("Walks on four legs");
//     }
// }

// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("Walks on two legs");
//     }
// }

// public class ABSTRACTION {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         // horse.walk();
//         // horse.eat();
//     }
// }











//INTERFACES


// interface Animal {
//     int eyes = 2;
//     public void walk();//public static by default
// }

// interface Herbivore {

// }

// class Horse implements Animal , Herbivore{
//     public void walk() {//but here public is necessary to write otherwise its seen by default
//         System.out.println("Walks on 4 legs");
//     }
// }

// public class ABSTRACTION {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//     }
    
// }


//STATIC KEYWORD


// class Student {
//     String name;
//     static String school;

//     public static void changeSchool() {
//         school = "new school";
//     }
// }
// public class ABSTRACTION {
//     public static void main(String[] args) {
//         Student.school = "MAS";
//         Student student1 = new Student();
//         student1.name = "MAS";
//         System.out.println(student1.school);
//     }
// }



// public class ABSTRACTION {
//     public static void main(String[] args) {
//         System.out.println("MAS");
//     }
// }