// class Car {
//     String brand;

//     Car(String brand) {
//         this.brand = brand;
//     }

//     void display() {
//         System.out.println("Car Brand: " + brand);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         new Car("Toyota").display();
//     }
// }

// Inheritance 
// 1. Single Inheritance

// superClass
// class Animal {
//     int add(int a, int b) {
//         return a+b;
//     }
// }

// // subclass inherit from superclass;
// class Dog extends Animal {
//     int sub(int a, int b) {
//         return a - b;
//     }
// }

// public class Main {
//     public static void main(String[] args){
//         Dog dog = new Dog();
//         System.out.println(dog.add(3,4));
//         System.out.println(dog.sub(7,2));
//     }
// }

// 2.mutlilevel Inheritance

// class Animal{
//     void eats() {
//         System.out.println("Animal eats food");
//     }
// }

// class Mammal extends Animal{
//     void walk() {
//         System.out.println("mammal walk");
//     }
// }

// class Dog extends Mammal{
//     void bark(){
//         System.out.println("dog bark");
//     }
// }

// public class Main {
//     public static void main(String[] args){
//         Dog anim = new Dog();
//         anim.eats();
//         anim.walk();
//         anim.bark();
//     }
// }

// 3.Hierarchical Inheritance

// class Animal {
//     void eat(){
//         System.out.println("want some food");
//     }
// }

// class Dog extends Animal{
//     void dog(){
//         System.out.println("dog brak");
//     }
// }

// class Cat extends Animal{
//     void cat(){
//         System.out.println("cat meow");
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         // Creating an object of the Dog subclass
//         Dog dog  = new Dog();
//         dog.eat();
//         dog.dog();

//         // Creating an object of the Cat subclass
//         Cat cat = new Cat();
//         cat.eat();
//         cat.cat();
//     }
// }

// Multiple Inheritance

// First interface
// interface A{
//     void methodA();
// }

// interface B{
//     void methodB();
// }

// class C implements A, B  {
//     public void methodA() {
//         System.out.println("its method A");
//     }

//     public void methodB() {
//         System.out.println("its method B");
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         C obj = new C();
//         obj.methodA();
//         obj.methodB();
//     }
// }

// exception handling

// public class Main {
//     public static void main(String[] args) {
//         try {
//             int result = 36/0;
//         } catch(ArithmeticException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         try {
//             int result = 10 / 0; // Code that may throw an exception
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero!"); // Handling exception
//         } finally {
//             System.out.println("This block always executes."); // Optional cleanup
//         }
//     }
// }

// throw / throws

// public void Main (int age) {
//     if (age < 18) {
//         throw new IllegalArgumentException("Age must be 18 or above.");
//     }
// }

// public class Main {
//     // Method that explicitly throws an ArithmeticException
//     public static void example() {
//         throw new ArithmeticException("divide by 0"); // Throwing an exception with a custom message
//     }
    
//     public static void main(String[] args) {
//         // Calling the example method, which will throw an exception
//         example();
//     }
// }




// public class Main {
//     // Method that declares an exception (ArithmeticException) may be thrown
//     public static void example() throws ArithmeticException {
//         int result = 36 / 0;  // This will throw an ArithmeticException (divide by 0)
//     }

//     public static void main(String[] args) {
//         try {
//             example();  // Calling the method that may throw an exception
//         } catch (ArithmeticException e) {  // Catching the ArithmeticException
//             System.out.println(e);  // Printing the exception message (divide by 0)
//         }
//     }
// }

// multitherading

// class EvenThread extends Thread {
//     public void run() {
//         for (int i = 2; i <= 10; i += 2) {
//             System.out.println("Even: " + i);
//         }
//     }
// }

// class OddThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 9; i += 2) {
//             System.out.println("Odd: " + i);
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         EvenThread even = new EvenThread();
//         OddThread odd = new OddThread();
        
//         even.run(); // Start even thread
//         odd.start();  // Start odd thread
//     }
// }

















