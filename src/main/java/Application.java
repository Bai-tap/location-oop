import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();
        System.out.println("Enter column: ");
        int column = sc.nextInt();

        int[][] array = new int[row][column];
        System.out.println("Enter array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        Location location = Location.locateLargest(array);
        System.out.printf("The location of the largest element is %d at (%d, %d) ",location.maxValue, location.row ,location.column);
    }
}
