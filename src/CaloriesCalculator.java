/**
 * Created by Adamus on 2016-01-21.
 */
public class CaloriesCalculator extends Calculator
{
    private Activity currentActivity;
    private int activityTime;

    public BodyParams calculate()
    {
        BodyParams bodyParams = new BodyParams();

        Double time1 = (double)activityTime/60;
        bodyParams.setCalories((user.getWeight()*currentActivity.getRatio())*time1);

        return bodyParams;
    }

    public void setActivity(Activity activity, int time)
    {
        currentActivity = activity;
        activityTime = time;
    }
}
