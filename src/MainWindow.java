import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Adamus on 2016-01-20.
 */
public class MainWindow extends JFrame
{
    private JTextField nameField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JPanel StartPanel;
    private JTextField ageField;
    private JTextField weightField;
    private JTextField heightField;
    private JButton nextButton;

    public User user = null;

    public String getNameField()
    {
        return nameField.getText();
    }

    public String getAgeField() {
        return ageField.getText();
    }

    public String getWeightField() {
        return weightField.getText();
    }

    public String getHeightField() {
        return heightField.getText();
    }

    public MainWindow()
    {
        user = new User();

        nextButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                user.setName(getNameField());
                user.setAge(Integer.parseInt(getAgeField()));
                user.setWeight(Double.parseDouble(getWeightField()));
                user.setHeight(Double.parseDouble(getHeightField()));

                if (maleRadioButton.isContentAreaFilled())
                {
                    user.setGender(User.Gender.Male);
                }
                else
                {
                    user.setGender(User.Gender.Female);
                }

                openStartWindow();
                closeMainWindow();
            }
        });
    }

    public static void main(String[] args)
    {
        MainWindow mainWindow = new MainWindow();

        mainWindow.showMainWindow();
    }

    public void showMainWindow()
    {
        setTitle("MainWindow");
        setContentPane(StartPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void closeMainWindow()
    {
        this.setVisible(false);
        this.dispose();
    }

    public void openStartWindow()
    {
        StartWindow startWindow = new StartWindow(this);
        startWindow.showStartWindow();
    }

    public void openFatAdditionalParametresWindow()
    {
        FatAdditionalParametres fatAdditionalParametres = new FatAdditionalParametres(this);
        fatAdditionalParametres.showDialog();
    }

    public void openWaterFatBonesResultDialog()
    {
        WaterFatBonesResultsDialog waterFatBonesResultsDialog = new WaterFatBonesResultsDialog();
        waterFatBonesResultsDialog.showDialog();
    }
}
