
public class NumberUtilities {
    public static String getRange(int stop) {
        String range = "";
        for (int x = 0; x < stop; x++){
            range += x; 
        }
        return range;

    }

    public static String getRange(int start, int stop) {
        String rangeSS = "";
        for (int x = start; x < stop; x++){
            rangeSS += x; 
        }
        return rangeSS;

    }

    public static String getRange(int start, int stop, int step) {
        String rangeSSS = "";
        for (int x = start; x < stop; x+=step){
            rangeSSS += x; 
        }
        return rangeSSS;

    }

    public static String getEvenNumbers(int start, int stop) {
        String rangeE = "";
        for (int x = start; x < stop; x++){
            if(x%2 == 0) 
                rangeE += x; 
        }
        return rangeE;

    }

    public static String getOddNumbers(int start, int stop) {
        String rangeO = "";
        for (int x = start; x < stop; x++){
            if(x%2 == 1) 
                rangeO += x; 
        }
        return rangeO;
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        String rangeEX = "";
        for (int x = start; x <= stop; x++){
            rangeEX += (int)(Math.pow(x, exponent)); 
        }
        return rangeEX;
    }
}
