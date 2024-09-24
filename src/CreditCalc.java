public class CreditCalc {
    public double calculate(double creditRate, double creditPeriod, double summcredit) {
        double monthCreditRate = creditRate / 1200;
        double k = summcredit * ((monthCreditRate * Math.pow(1 + monthCreditRate, creditPeriod * 12)) / (Math.pow(1 + monthCreditRate, creditPeriod * 12) - 1));
        return k;


    }


}
