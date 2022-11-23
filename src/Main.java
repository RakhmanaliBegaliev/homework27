import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt().apply(25d));


    }
    public static UnaryOperator<Double> sqrt(){
    UnaryOperator<Double>unaryOperator= x->Math.sqrt(x);
    return unaryOperator;
    }
}