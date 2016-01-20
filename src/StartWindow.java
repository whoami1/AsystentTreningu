import sun.applet.Main;

import javax.swing.*;

/**
 * Created by Micha³ Wrzesieñ on 2016-01-20.
 */
public class StartWindow extends JFrame
{
    private JPanel StartPanel;
    private JButton calcWaterFatBonesButton;
    private JButton calcCaloriesButton;
    private JButton compareButton;

    private MainWindow mainWindow;

    public StartWindow(MainWindow mainWindow)
    {
        this.mainWindow = mainWindow;
    }

    public void showStartWindow()
    {
        setTitle("StartWindow");
        setContentPane(StartPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void closeStartWindow()
    {
        this.setVisible(false);
        this.dispose();
    }


}
