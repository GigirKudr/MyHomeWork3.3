//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCalc service = new CreditCalc();
        //int d = (int) service.calculate(9.99, 3, 1_000_000);

        System.out.println((int) service.calculate(9.99, 1, 1_000_000));
        System.out.println();
        System.out.println((int) service.calculate(9.99, 2, 1_000_000));
        System.out.println();
        System.out.println((int) service.calculate(9.99, 3, 1_000_000));

    }
}