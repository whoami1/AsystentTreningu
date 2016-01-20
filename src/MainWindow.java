import sun.applet.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Adamus on 2016-01-20.
 */
public class MainWindow extends JFrame
{
    private JTextField nameField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JPanel StartPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton nextButton;

    public MainWindow()
    {
        nextButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
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
