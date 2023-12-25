public class Main {


    private static int subtractionResult;

    public static void main(String[] args) {

        for (int i = 3; i <= 9; i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k <= j; k++) {
                    int initialQuantity = i * 100 + j * 10 + k;
                    int reverseQuantity = k * 100 + j * 10 + i;
                   // System.out.println(initialQuantity + " - " + reverseQuantity);

                    final int ourInvariableResult = getOurInvariableResult(initialQuantity, reverseQuantity);

                    System.out.println(initialQuantity + " - " + reverseQuantity +  " + " + reversed + " = " + ourInvariableResult);
                }

            }
        }

    }

    private static int getOurInvariableResult(int initialQuantity, int reverseQuantity) {
        int subtractionResult = initialQuantity - reverseQuantity;
        int savedSubtractionResult = subtractionResult;
        int reversed = 0;
        while (subtractionResult != 0) {
            reversed = reversed * 10 + subtractionResult % 10;

            subtractionResult = subtractionResult / 10;
            if (reversed == 99) {
                reversed = reversed * 10;
            }
        }
        int ourInvariableResult = savedSubtractionResult + reversed;
        return ourInvariableResult;

    }

    public static void setSubtractionResult(int subtractionResult) {
        Main.subtractionResult = subtractionResult;
    }
}