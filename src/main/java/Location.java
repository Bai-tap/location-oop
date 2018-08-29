public class Location {
    public static int column;
    public static int row;
    public static int maxValue;

    public Location() {
    }

    public Location(int[][] array) {
    }

    public static Location locateLargest(int array[][]) {
        Location location = new Location(array);
        int maxValue = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column]>maxValue){
                    maxValue = array[row][column];
                    location.row = row;
                    location.column = column;
                    location.maxValue = maxValue;
                }
            }
        }
        return location;
    }
}
