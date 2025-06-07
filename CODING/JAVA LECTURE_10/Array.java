import java.util.*;
public class array{
    public static void main(String args[]){
        // int [] marks = new int [3];
        // marks[0] = 12;
        // marks[1] = 13;
        // marks[2] = 12;
        // System.out.println(marks[2]);
        // System.out.println(marks[2]);
        // System.out.println(marks[2]);
        
        
        
        
        // int marks[] = {12,23,34};
        
        // for(int i = 0; i<3; i++){
        //     System.out.println(marks[i]);
        // }
        
        
        
        
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        
        // for(int i = 0 ; i<size ; i++){
        //     numbers[i] = sc.nextInt();
        // }
        
        // for(int i = 0 ; i<size ; i++){
        //     System.out.println(numbers[i]);
        // }
        
        
        
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        //input
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        
        //output
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }
}




