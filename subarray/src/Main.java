import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 4, 6, 6};
       int [] subArray= Arrays.copyOfRange(arr,0,arr.length);
       System.out.println(Arrays.toString(subArray));
       System.out.println((subArray));
       for( int a :subArray){
             System.out.println(a);
             //hello siddhumamoi
       }
    }
}
