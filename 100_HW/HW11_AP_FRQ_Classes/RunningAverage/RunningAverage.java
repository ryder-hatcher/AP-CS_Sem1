import java.util.Scanner;
public class RunningAverage {

    private int count = 0;   
    private double sum = 0.0;   
    private Scanner sc = new Scanner(System.in);
    private void addRating(double val) {
        sum = sum + val;
        count = count + 1;
}
    public int processNewRatings(int num) {
        int invalidCount = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter rating: ");
            int rating = sc.nextInt();

            if (rating >= 0) {
                addRating(rating);
            } else {
                invalidCount = invalidCount + 1;
            }
        }

        return invalidCount;
    }

    public double getAverage() {
        if (count == 0) {
            return 0.0;
        } else {
            return sum / count;
        }
    }

    public static void main(String[] args) {
        RunningAverage ra = new RunningAverage();

        int invalid = ra.processNewRatings(5);

        System.out.println("Invalid ratings: " + invalid);
        System.out.println("Running average: " + ra.getAverage());
    }
}
