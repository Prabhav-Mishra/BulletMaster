import java.awt.Color;
import java.util.Arrays;
import java.util.Comparator;

public class SortColors {

    public static void main(String[] args) {
        Color[] colors = {
            new Color(255, 0, 0),   // Red
            new Color(0, 255, 0),   // Green
            new Color(0, 0, 255),   // Blue
            new Color(255, 255, 0), // Yellow
            new Color(0, 255, 255), // Cyan
            new Color(255, 0, 255), // Magenta
            new Color(128, 128, 128)// Gray
        };

        System.out.println("Colors before sorting:");
        printColors(colors);

        Arrays.sort(colors, new Comparator<Color>() {
            @Override
            public int compare(Color c1, Color c2) {
                return Integer.compare(c1.getRGB(), c2.getRGB());
            }
        });

        System.out.println("\nColors after sorting:");
        printColors(colors);
    }

    private static void printColors(Color[] colors) {
        for (Color color : colors) {
            System.out.printf("Color: R=%d, G=%d, B=%d, RGB=%d%n", 
                              color.getRed(), color.getGreen(), color.getBlue(), color.getRGB());
        }
    }
}
