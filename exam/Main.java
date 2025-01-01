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

// Runnable to print even numbers
// class EvenRunnable implements Runnable {
//     public void run() {
//         for (int i = 2; i <= 5; i += 2) {
//             System.out.println("Even: " + i);
//         }
//     }
// }

// Runnable to print odd numbers
// class OddRunnable implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i += 2) {
//             System.out.println("Odd: " + i);
//         }
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {
//         // Create runnable objects
//         Runnable evenRunnable = new EvenRunnable();
//         Runnable oddRunnable = new OddRunnable();

//         // Create threads with runnable objects
//         Thread evenThread = new Thread(evenRunnable);
//         Thread oddThread = new Thread(oddRunnable);

//         // Start the threads
//         evenThread.start();
//         oddThread.start();
//     }
// }


///


class Person {
    // Private fields
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setters
        person.setName("John");
        person.setAge(25);

        // Access values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Try setting an invalid age
        person.setAge(-5); // Shows validation message
    }
}



// Class representing a Bank Account
// class BankAccount {
//     // Private fields (data hiding)
//     private String accountHolderName;
//     private double balance;

//     // Public constructor to initialize the account
//     public BankAccount(String accountHolderName, double initialBalance) {
//         this.accountHolderName = accountHolderName;
//         if (initialBalance >= 0) {
//             this.balance = initialBalance;
//         } else {
//             System.out.println("Initial balance cannot be negative. Setting balance to 0.");
//             this.balance = 0;
//         }
//     }

//     // Public getter for account holder name
//     public String getAccountHolderName() {
//         return accountHolderName;
//     }

//     // Public setter for account holder name
//     public void setAccountHolderName(String accountHolderName) {
//         this.accountHolderName = accountHolderName;
//     }

//     // Public getter for balance
//     public double getBalance() {
//         return balance;
//     }

//     // Method to deposit money
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//         } else {
//             System.out.println("Deposit amount must be positive.");
//         }
//     }

//     // Method to withdraw money
//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else if (amount > balance) {
//             System.out.println("Insufficient balance.");
//         } else {
//             System.out.println("Withdrawal amount must be positive.");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create a new BankAccount object
//         BankAccount account = new BankAccount("John Doe", 500.0);

//         // Access and modify account details using public methods
//         System.out.println("Account Holder: " + account.getAccountHolderName());
//         System.out.println("Current Balance: " + account.getBalance());

//         // Deposit money
//         account.deposit(200.0);
//         System.out.println("Updated Balance: " + account.getBalance());

//         // Withdraw money
//         account.withdraw(150.0);
//         System.out.println("Updated Balance: " + account.getBalance());

//         // Try withdrawing an amount greater than the balance
//         account.withdraw(600.0);

//         // Change account holder name
//         account.setAccountHolderName("Jane Doe");
//         System.out.println("Updated Account Holder: " + account.getAccountHolderName());
//     }
// }

















