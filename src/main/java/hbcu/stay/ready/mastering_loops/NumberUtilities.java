package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String number = "";
        for(int i = start; i < stop; i++) {
            if(i % 2 == 0) {
                number += i;
            }
        }
        return number;
    }


    public static String getOddNumbers(int start, int stop) {
        String number = "";
        for(int i = start; i < stop; i++) {
            if(i % 2 != 0) {
                number += i;
            }
        }
        return number;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squaredNumber = "";
        for(int i = start; i < stop; i += step) {
             squaredNumber += i * i;
        }
        return squaredNumber;
    }

    public static String getRange(int stop) {
        String number = "";
        for(int i = 0; i < stop; i++) {
            number += i;
        }
        return number;
    }

    public static String getRange(int start, int stop) {
        String number = "";
        for(int i = start; i < stop; i++) {
            number += i;
        }
        return number;
    }


    public static String getRange(int start, int stop, int step) {
        String number = "";
        for(int i = start; i < stop; i += step) {
            number += i;
        }
        return number;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponentiations = "";
        for(int i = start; i < stop; i += step) {
            exponentiations += (int)(Math.pow(i, exponent));
        }
        return exponentiations;
    }
}
