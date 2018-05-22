public class SubOperand implements Ioperand {
    @Override
    public int execute(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }
}
