import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

import javax.swing.*;

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

    private Activity activity;

    public BodyParams calculate()
    {
        BodyParams bodyParams = new BodyParams();
        return bodyParams;
    }

    public void setActivity(Activity activity)
    {

    }
}
