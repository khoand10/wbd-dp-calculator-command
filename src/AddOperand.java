public class AddOperand implements Ioperand{

    @Override
    public int execute(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }
}
