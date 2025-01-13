import java.util.Random;
public class TeamHeight {

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return sum / (double) heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // 150 to 250 (inclusive)
        }

        System.out.println("Heights of the players (in cms): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int sum = findSum(heights);
        System.out.println("Sum of heights: " + sum);

        double meanHeight = findMeanHeight(heights);
        System.out.println("Mean height: " + meanHeight);

        int shortestHeight = findShortestHeight(heights);
        System.out.println("Shortest height: " + shortestHeight);

        int tallestHeight = findTallestHeight(heights);
        System.out.println("Tallest height: " + tallestHeight);
    }
}


