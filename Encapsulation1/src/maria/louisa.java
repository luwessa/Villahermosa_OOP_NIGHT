package maria;

import java.util.Scanner;
import villahermosa.Villahermosa;

public class louisa {
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.print("Enter test case number: ");
        int testC = info.nextInt();
        
        switch (testC) {
      case 1:
        System.out.println("Test Case 1: Student under 18");
          Villahermosa st1 = new Villahermosa("Jemar Jude", "Maranga", 17, true);
          System.out.println(st1);
        break;
      case 2:
        System.out.println("Test Case 2: Increase age of student1");
        Villahermosa st2 = new Villahermosa("Jemar Jude", "Maranga", 17, false);
        st2.increaseAge();
        System.out.println(st2);
        break;
      case 3:
        System.out.println("Test Case 3: Student over 18");
        Villahermosa st3 = new Villahermosa("Jose", "Cruz", 19, false);
        System.out.println(st3);
        break;
      default:
        System.out.println("Invalid test case number.");
    }
    info.close();
  }
}
