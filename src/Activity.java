/**
 * Created by Adamus on 2016-01-20.
 */
public class Activity
{
    private String name;
    private double ratio;

    public Activity(double ratio, String name)
    {
        this.name = name;
        this.ratio = ratio;
    }

    public double getRatio()
    {
        return ratio;
    }

    public void setRatio(double ratio)
    {
        this.ratio = ratio;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
