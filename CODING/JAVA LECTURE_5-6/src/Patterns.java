// import java.util.*;
// public class Patterns{
//     public static void main (String args[]){
//                                     /*********************** INPUT ***********************/

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter n : ");
//         int n = scanner.nextInt();

//         System.out.println("Enter m : ");
//         int m = scanner.nextInt();


//                                     /*********************** RECTANGLE ***********************/
//         // for(int i = 1 ; i<=n ; i++){
//         //     for(int j = 1 ; j<=n ; j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println(" ");
//         // }


//                                     /*************************** HOLLOW RECTANGLE *************************/
       
//         // for(int i = 1 ; i<=n ; i++){
            
//         //         for(int j = 1 ; j<=m ; j++){

//         //             if(i == 1 || j == 1 || i == n || j == n ){

//         //                 System.out.print("*");
//         //         } else {
//         //             System.out.print(" ");
//         //         }
//         //     }
//         //     System.out.println();
//         // }


//                                     /*********************** Half Pyramid ***********************/
//         // for(int i = n ; i>=1 ; i--){

//         //     for(int j = 1 ; j<=i ; j++){

//         //         System.out.print("*");
//         //     }

//         //             System.out.println("");
//         // }
       



//                                     /*********************** INVERT Pyramid ***********************/
//         // for(int i = 1 ; i<=n ; i++){
            
//         //     for(int j = 1 ; j<=n-i; j++){

//         //         System.out.print(" ");

//         //     }       for(int j = 1 ; j<=i ; j++){

//         //                 System.out.print("*");
//         //     }
//         //                     System.out.println();

//         // }


//                                     /*********************** Inverted & Rotated Half Pyramid ***********************/
//         // for(int i = 1 ; i<=n ; i++){
//         //     for(int j = 1 ; j<=i ; j++){
//         //         System.out.print(j+" "+j);
//         //     }
//         //             System.out.println();
//         // }



//                                     /*********************** Number Pyramid ***********************/
//         //    for(int i = 1 ; i<=n ; i++){
//         //     for(int j = 1 ; j<=n-i+1 ; j++){
//         //         System.out.print(j);
//         //     }
//         //             System.out.println();
// //           }
                


//                                      /*********************** Floyds Pyramid ***********************/
//         // int  num = 1;
//         // for(int i = 1 ; i<=n ; i++){
//         //     for(int j = 1 ; j<=i ; j++);
//         //     System.out.print(num);
//         //     num++;
//         // }
//         //         System.out.println();
        

//                                     /*********************** 0 1 Pyramid ***********************/
//         // for (int i = 1; i<=n ; i++){
//         //     for(int j = 1; j<=i ; j++){
//         //         int sum = i + j;
//         //             if(sum % 2 == 0){
//         //                 System.out.print("1 ");
//         //             }       else{
//         //                         System.out.print("0 ");
//         //             }
//         //                             System.out.println();
//         //     }
//         // }

//                                     //*************************BUTTERFLY************************ */
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//                     int spaces = 2 * (n-i);
//                         for(int j = 1; j<=spaces; j++){
//                                 System.out.print(" ");
//                         }
//                                     for(int j = 1; j<=i; j++){
//                                             System.out.print("*");
//                                     }
//                                                 System.out.println();
//                                                     //lower half
//                                                     for(int k = n-1; k>=1; k--){
//                                                         for(int j = 1; j<=i; j++){
//                                                             System.out.print("*");
//                                                         }
//                                                                 int lowerSpaces = 2 * (n-k);
//                                                                     for(int j = 1; j<=lowerSpaces; j++){
//                                                                             System.out.print(" ");
//                                                                     }
//                                                                                 for(int j = 1; j<=i; j++){
//                                                                                         System.out.print("*");
//                                                                                 }
//                                                                                             System.out.println();
//         }

//     }
// }






















































// import java.util.*;
// public class Patterns{


//     // public static void printMyName(String name) {
//     //     System.out.println(name);
//     //     return;
//     // }

//     // public static int calculateSum(int a, int b){
//     //     int sum = a+b;
//     //     return sum;
//     // }

//     // public static int calculateProduct(int a,int b){
//     //     return a*b;
//     // }

//         public static void printFactorial(int n){
//             int factorial = 1; 
//             if(n < 0){
//                 System.out.println("Invalid Number");
//             }
//             for(int i = n ; i>=n ; i--){
//                 factorial = factorial*i;
//             }
//             System.out.println(factorial);
//             return;
//         }

//     public static void main(String args []){
//         Scanner sc =  new Scanner(System.in);
//         int n = sc.nextInt();
//         // int b = sc.nextInt();
       
//         // String name = sc.next();
//         // printMyName(name);//call kiya function ko

//         // int sum = calculateSum(a,b);
//         // System.out.println("Sum : "+ sum);

//         // System.out.println("Product : " + calculateProduct(a, b));

//         printFactorial(n);


//     }
// }
































import java.util.*;
public class Patterns{
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}















































