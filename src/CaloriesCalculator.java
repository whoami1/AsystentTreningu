import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Micha� Wrzesie� on 2016-01-20.
 */
public class CaloriesCalculator extends Calculator
{
    private JTextField timeActivityField;
    private JComboBox activitiesComboBox;
    private JPanel CaloriesCalculator;
    private JButton obliczButton;
    private JLabel resultLabel;

    private List<Activity> activities = new ArrayList<>();

    public CaloriesCalculator()
    {
        try
        {
            Scanner in = new Scanner(new File("activities.txt"));
            while(in.hasNext())
            {
                activities.add(new Activity(in.nextFloat(), in.nextLine()));
            }
        }
        catch (IOException e)
        {
            System.out.println("Nie znaleziono pliku 'activities'.txt");
        }
        activitiesComboBox = new JComboBox(activities.toArray());
    }

    public BodyParams calculate()
    {
        BodyParams bodyParams = new BodyParams();
        return bodyParams;
    }

    public void setActivity(Activity activity)
    {

    }
}
