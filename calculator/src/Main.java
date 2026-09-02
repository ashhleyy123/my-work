import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int choice;
//
//
//        {
//            System.out.println("Choose an option:");
//            System.out.println("1.addition");
//            System.out.println("2.substraction");
//            System.out.println("3.multipliaction");
//            System.out.println("4.division");
//            System.out.println("5. exit");
//            choice = scanner.nextInt();
//
//            System.out.println("enter first number:");
//            int x = scanner.nextInt();
//
//            System.out.println("enter the second number:");
//            int y = scanner.nextInt();
//        }


//    }
        Shapes a = new Shapes();
        Shapes b= new Shapes();
        a.firstVariable=10;
        b.firstVariable=15;
        a.secondVariable=25;
        b.secondVariable=30;
        a.print();
        b.print();
        a.firstVariable=a.findSquareValue(a.firstVariable);
        a.print();
        Shapes.staticPrint();
        Shapes c= swapVariableValues(a);
        c.print();
        a.print();
        swapVariableValues(a,b);
        swapVariableValues(a.firstVariable,a);
        swapVariableValues(a,b.firstVariable);
    }
    static Shapes swapVariableValues(Shapes s){
        System.out.println("Swap Variables Fucntions");
        int temp = s.firstVariable;
        s.firstVariable=s.secondVariable;
        s.secondVariable=temp;
        return s;
    }
    static void swapVariableValues(Shapes a, Shapes b){
        System.out.println("Doubles shapes Function");
    }

    static void swapVariableValues(int a, Shapes b){
        System.out.println("int and shapes");
    }
    static void swapVariableValues(Shapes a, int b){
        System.out.println("Shapes and int");
    }
}
