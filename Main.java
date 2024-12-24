
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
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 5;

        
        System.out.println("a > b: " +  (a  > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
        
    }
}



