package act2;
import java.util.Scanner;
public class Act2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String input = scanner.nextLine();
        System.out.println(MisplacedCapital(input)? "JEJE!" : "uWu");
    }
    public static boolean MisplacedCapital(String input){
        boolean prevWasLower = false;
        for(char ch: input.toCharArray()){
            if (Character.isLetter(ch)){
                if(Character.isUpperCase(ch)&& prevWasLower)return true;
                prevWasLower = Character.isLowerCase(ch);
            } else {
                prevWasLower = false;
            }
        }
            return false;
    }
    
    
}
