package addtask9;
import static java.lang.Math.*;

/**
 * Created by Master on 06.05.2015.
 */
public class Formula {
   private int x;


    Formula(int number){
        x=number;
    }

    public double function1() {
        return sqrt(sqrt(cos(pow(E, x)) + pow(E, pow(x, 2))) + sqrt(1 / x)) / pow((cos(PI * pow(x, 3)) + log(pow((1 + x), 2))), sin(x));
    }

    public double function2() {
        return sin(pow(pow(x, 5), 2)) / sqrt(1 + pow(x, 3));
    }
}
