public class Caculator {
    private Ioperand ioperand;

    public Caculator(Ioperand ioperand) {
        this.ioperand = ioperand;
    }
    public int execute(int firstOperand, int secondOperand){
        return ioperand.execute(firstOperand, secondOperand);
    }
}
