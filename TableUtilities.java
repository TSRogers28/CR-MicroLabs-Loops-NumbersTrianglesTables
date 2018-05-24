
import java.util.*;
public class TableUtilities {
    public static String getSmallMultiplicationTable(){ 
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int x = 1; x <= tableSize ; x++){
            for (int y = 1; y <= tableSize ; y++){
                    table.append(String.format("%3d |", x * y));
               }
           table.append("\n");
        }
        return table + "";
    }
}



