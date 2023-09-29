public class CalculableFactory implements CalcFactory {
    public Calculable create(int primaryArg, boolean logFlag) {
        if (logFlag) {
            Calculable calculator =  new Calculator(primaryArg);
            return new LogCalc(calculator);
        }
        return new Calculator(primaryArg);
    }
}
