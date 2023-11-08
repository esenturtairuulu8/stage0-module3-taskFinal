package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousand = number / 1000;
        int hundred = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int sum = thousand + hundred + tens + units;
        System.out.println(sum);
    }
}
