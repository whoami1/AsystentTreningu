import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
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
    private Activity currentActivity;
    private int activityTime;

    public CaloriesCalculator()
    {
        try
        {
            Scanner in = new Scanner(new File("activities.txt"));
            while(in.hasNext())
            {
                //double ratio = Double.parseDouble(in.next());
                NumberFormat nf = NumberFormat.getInstance();
                double ratio = nf.parse(in.next()).doubleValue();

                String name = in.nextLine();
                activities.add(new Activity(ratio, name));
            }
        }
        catch (IOException e)
        {
            System.out.println("Nie znaleziono pliku 'activities'.txt");
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        for(Activity a : activities)
            activitiesComboBox.addItem(a.getName());

        obliczButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int time = Integer.parseInt(timeActivityField.getText());
                for(Activity a : activities)
                    if(a.getName().equals(e.getActionCommand()))
                        setActivity(a, time);
            }
        });
    }

    public BodyParams calculate()
    {
        BodyParams bodyParams = new BodyParams();
        return bodyParams;
    }

    private void setActivity(Activity activity, int time)
    {
        currentActivity = activity;
        activityTime = time;
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("CaloriesCalculator");
        frame.setContentPane(new CaloriesCalculator().CaloriesCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
