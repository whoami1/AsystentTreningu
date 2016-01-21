/**
 * Kalkulator obliczający zużycie kalorii dla danej aktywności na podstawie czasu jej wykonywania, współczynnika spalania i wagi użytkownika.
 */
public class CaloriesCalculator extends Calculator
{
    /**
     * Zwraca aktualna aktywność przypisaną do tego kalkulatora.
     */
    private Activity currentActivity;

    /**
     * Przechowuje czas wykonywania aktualnie przypisanej aktywności.
     */
    private int activityTime;

    /**
     * Funkcja obliczająca zużycie kaloryczne dla danej aktywności fizycznej.
     * @return spalone kalorie
     */
    public BodyParams calculate()
    {
        BodyParams bodyParams = new BodyParams();

        Double time1 = (double)activityTime/60;
        bodyParams.setCalories((user.getWeight()*currentActivity.getRatio())*time1);

        return bodyParams;
    }

    /**
     * Funkcja ta przypisuje kalkulatorowi aktywność i czas jej wykonywania, na podstawie których obliczy zapotrzebowanie kaloryczne.
     * @param activity aktywność
     * @param time czas wykonywania
     */
    public void setActivity(Activity activity, int time)
    {
        currentActivity = activity;
        activityTime = time;
    }
}
