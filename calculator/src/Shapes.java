public class Shapes {
    static int counter;
    int firstVariable;
    int secondVariable;

   public void print(){
      System.out.println("counter value: "+counter); //0 1
        counter++;
        System.out.println("firstVariable: "+firstVariable); //10 15
       System.out.println("secondVariable: "+secondVariable);//25 30
       }
    public static void staticPrint(){
        System.out.println("counter value: "+counter);
        counter++;
    }
    Shapes(){
        System.out.println("Initialisations");
    }

    int findSquareValue(int variableOne){
       return variableOne*variableOne;
    }
}
