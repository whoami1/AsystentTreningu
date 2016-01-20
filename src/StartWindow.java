import sun.applet.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        calcWaterFatBonesButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mainWindow.openFatAdditionalParametresWindow();
            }
        });
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
