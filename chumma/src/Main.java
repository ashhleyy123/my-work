import java.util.ArrayList;
import java.util.List;


public class Factors {
    //[1]
    private List<Integer> factors = new ArrayList<>();
    private int NumberOfFactors;

    public int findNumberOfFactors(int number) {
        int i=2;
        factors.add(1);
        for(;i<=number/2;i++) {
            if(number % i == 0)
                factors.add(i);
        }
        if(number>i)
            factors.add(number);

    }

    private int getNumberOfFactors() {
        return factors.size();
    }
}