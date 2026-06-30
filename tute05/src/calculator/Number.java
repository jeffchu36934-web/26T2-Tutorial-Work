package calculator;

public class Number implements Expression {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public double compute() {
        // TODO Auto-generated method stub
        return num;
    }

     
}
