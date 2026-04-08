import java.util.Scanner;

public class nestedif{
   public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
 






String username = "admin";
String password = "1234";
boolean otpVerified = true;

if (username.equals("admin") && password.equals("1234")) {
    if (otpVerified) {
        System.out.println("Login successful");
    } else {
        System.out.println("OTP verification failed");
    }
} else {
    System.out.println("Invalid username or password");
}
  } 
}