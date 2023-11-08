package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        if (number >= 100 && number <= 999) {
            int units = number % 10;
            int tens = (number / 10) % 10;
            int hundreds = number / 100;

            int reversed = units + tens * 10 + hundreds * 100;
            System.out.println(reversed);

            }
}
}