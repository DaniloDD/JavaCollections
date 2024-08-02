package sel.bootcamp.part1_DifficultSection;

public class JavaQ_LambdaExpression {

    public static void main(String[] args) {
        MyInterface reference = () -> 3.14; 
        System.out.println("PI Value: " + reference.getPIValue());
    }
}

interface MyInterface {
    double getPIValue();
}