import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
       do {
           System.out.println("Choose an option:");
           System.out.println("1.addition");
           System.out.println("2.substraction");
           System.out.println("3.multipliaction");
           System.out.println("4.division");
           System.out.println("5. exit");
           choice = scanner.nextInt();

           System.out.println("enter first number:");
           int x = scanner.nextInt();

           System.out.println("enter the second number:");
           int y = scanner.nextInt();


           switch (choice) {
               case 1:
                   System.out.println("result:"+(x + y));
                   break;
               case 2:
                   System.out.println("result:"+(x - y));
                   break;
               case 3:
                   System.out.println("result:"+(x * y));
                   break;
               case 4:
                   System.out.println("result:"+(x / y));
                   break;
               default:
                   System.out.println("exit");
                   break;
           }



       }while (choice != 5) ;

    }
}

