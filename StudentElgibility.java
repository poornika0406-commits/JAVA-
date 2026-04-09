import java.util.Scanner;

public class StudentElgibility{
    public static void main(String[] args){
        Scanner sc = new(System.in);
        int marks;
        
        System.out.println("Enter the marks: \n");
        int marks = sc.nextInt();
        
        if(marks>=90)
        System.out.println("Eligible for SCIENCE STREAM");
        else if(marks>=80)
        System.out.println("Eligible for COMMERCE STREAM");
        else if(marks>=70)
        Syystem.out.println("Eligible for ARTS STREAM");
        else
        System.out.println("NOT ELIGIBLE")
        
    }
} 