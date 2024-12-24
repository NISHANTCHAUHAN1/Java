package Basics;
import java.util.Scanner;

// import javax.print.DocFlavor.STRING;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// datatypes
// public class Main {
//     public static void main(String[] args) {
//          // privite datatypes

//          // byte
//          // short - 2
//          // int - 4
//          // long - 8
//          // float - 4
//          // double - 8
//          // char - 2
//          // boolean - 1

//          // Non - primitive types
//         //  strings
//     }
// }

// string inbuilt functions

// public class Main {
//     public static void main(String[] args) {
//         // length
//         // String name = "luffy";
//         // System.out.println(name.length());

//         // concatenate

//         // String name1 = "Luffy";
//         // String name2 = "Zoro";
//         // String nameadd = name1 + "and" + name2;
//         // System.out.println(nameadd);

//         // char At
//         //   String name1 = "Luffy";
//         //   System.out.println(name1.charAt(0));

//         // replace 
//         // String are immutable in java we can change orignal string

//         // String name = "Luffy";
//         // String name2 = name.replace('y', 'Z');
//         // System.out.println(name2);

//         // substring;

//         // String name = "Nishant Bhai";
//         // System.out.println(name.substring(0,7));

//     }

// }

// Array

// public class Main {
//     public static void main(String[] args) {
//         int[] marks = new int[4];
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;
//         // marks[3];

//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         // System.out.println(marks[3]);   // its take 0 default value  
//         // System.out.println(marks);   

//         // length
//         // System.out.println(marks.length);
//     }
// }

// public class Main {

//     public static void main(String[] args){
//         // casting
//         double price = 100.00;
//         double finalPrice = price + 10;

//         System.out.println(finalPrice);
//         // output 110 aayega kyuki ye dono double datatype hai toh casting is possible;

//         // int p = 100;
//         // int fp = p + 18.00;

//         // System.out.println(fp); 
//         // now error come because we put float value in (int) data type int byte is less then float that why error;

//         int p = 100;
//         int fp = p + (int)18.00;
//         // output 118 because  we use (int) so its remove float value just come int value remove value after (.) !

//         System.out.println(fp); 
//     }
// }

// opertor
// Arithmetic Operators

// public class Main {

//     public static void main(String[] args){
//       
//         // * : Multiplication
//          //  : Division
//         // % : Modulo
//         // + : Addition
//         // – : Subtraction

//         int a = 3;
//         int b = 3;

//         int sum = a+b;
//         // int sum = a/b;

//         System.out.println("The Sum is: " + sum);
//     }
// }

//  Assignment Operator
// ‘=’ Assignment operator is used to assign a value to any variable. 

// public class Main {

//     public static void main(String[] args){

//         int f = 7;
//         System.out.println("f += 3: " + (f += 3));
//         System.out.println("f -= 2: " + (f -= 2));
//         System.out.println("f *= 4: " + (f *= 4));
//         System.out.println("f /= 3: " + (f /= 3));
//         System.out.println("f %= 2: " + (f %= 2));
//     }
// }

// Relational Operators
// public class Main {

//     public static void main(String[] args) {
//         int a = 10;
//         int b = 3;
//         int c = 5;

//         System.out.println("a > b: " +  (a  > b));
//         System.out.println("a < b: " + (a < b));
//         System.out.println("a >= b: " + (a >= b));
//         System.out.println("a <= b: " + (a <= b));
//         System.out.println("a == c: " + (a == c));
//         System.out.println("a != c: " + (a != c));

//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         // take input
//         Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter the age");
//         // int age = sc.nextInt();
//         // System.out.println(age);

//         System.out.println("enter the age");
//         float age = sc.nextFloat();
//         System.out.println(age); 
//     }
// }

// condtitions
// public class Main {

//     public static void main(String[] args){
//         // boolean isSignup = false;

//         // if((isSignup)){
//         //     System.out.println("true");
//         // }
//         // else{
//         //     System.out.println(false);
//         // }

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the age");
//         int age = sc.nextInt();
//         // System.out.println(age);
//         if(age >= 18){
//             System.out.println("they can vote");
//         }
//         else{
//             System.out.println("they can not vote age is less the 18");
//         }
//     } 
// }

// condtitions & logical operator
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the marks");
//         int marks = sc.nextInt();
//         System.out.println("marks is : " + marks);

//         if (marks >= 40 && marks <= 50) {
//             System.out.println("G : C");
//         } else if (marks > 50 && marks <= 70) {
//             System.out.println("G: B");
//         }
//         else if(marks > 70 && marks <= 100) {
//             System.out.println("G : A");  
//         } 
//         else if(marks > 100) {
//             System.out.println("chutiye hai kya");
//         }
//         else {
//             System.out.println("G: Fail"); 
//         }

//     }
// }

// &&, Logical AND: returns true when both conditions are true.
// ||, Logical OR: returns true if at least one condition is true.
// !, Logical NOT: returns true when a condition is false and vice-versa

// loops

// public class Main {
//     public static void main(String[] args){
//         for(int i=1; i<=10; i++){
//             System.out.println(i);
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args){
//         // for(int i=0; i<=20; i++){
//         //     if(i %2 != 0){
//         //         System.out.println(i);
//         //     }
//         // }

//         // for(int i=1; i<=20; i++){
//         //     System.out.println(i * 2);
//         // }

//         // int sum = 0;
//         // for(int i=0;i<=10; i++){
//         //     sum += i;
//         //     System.out.println(sum);
//         // }
//     }
// }

// while loop

// public class Main {
//     public static void main(String[] args){
//         int i = 1;
//         while(i <= 10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// break and continue

// public class Main {
//     public static void main(String[] args) {
//         // int i=0;
//         // while(i <= 10) {
//         // if(i > 6){
//         // break;
//         // }
//         // System.out.println(i);
//         // i++;
//         // }

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number to skip:");
//         int num = sc.nextInt();

//         for (int i = 0; i <= 10; i++) {
//             if (i == num) {
//                 continue; // Skip this iteration if i equals num
//             }
//             System.out.println(i); // Print the number
//         }

//     }
// }


 // try catch

//  public class Main {
 
//     public static void main(String[] args){
//         int[] marks = {65, 66, 67};
//         // System.out.println(marks[3]);    

//         // its return error because marks[3] are out of array length 
//         // error occur so it not print next line to fix this issue we use try catch

//         // System.out.println("hey nish");

//         try {
//             System.out.println(marks[3]);    
//             // the length of array is 2 and i try to access marks[3] but i dont get error because of try catch
//         } catch (Exception e) {
//             System.out.println("hey nish");
//         }
//     }
//  }


       // methods / function
// public class Main {

//     public static void sayhello(){
//         System.out.println("hello bhai ");
//     }

//     public static int addNum(int a, int b) {
//         return a + b; // Return the sum of a and b
//     }
    
//     public static void main(String[] args){
//         sayhello();
//         System.out.println(addNum(7,5));
//     }
// }