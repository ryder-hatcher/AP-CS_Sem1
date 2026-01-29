public class StepTracker {
  private int minSteps;
  private int totalDays;
    private int activeDays;
    private int totalSteps;

    public StepTracker(int min) {
        minSteps = min;
        totalDays = 0;
        activeDays = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps) {
        totalDays++;
        totalSteps += steps;

        if (steps >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        return (double) totalSteps / totalDays;
    }
}
