
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        for (int x = 0; x < numberOfStars; x++){
            row.append("*"); 
        }
        return row + "";
    }

    public static String getTriangle(int numberOfRows) {
        StringBuilder tri = new StringBuilder();
        for (int x = 1; x < numberOfRows + 1 ; x++){
            String triangle = getRow(x);
            tri.append(triangle + "\n");
        }
        return tri + "";
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
