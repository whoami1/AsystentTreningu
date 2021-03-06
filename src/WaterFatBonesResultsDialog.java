import javax.swing.*;
import java.awt.event.*;

public class WaterFatBonesResultsDialog extends JDialog
{
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel waterResultLabel;
    private JLabel fat1ResultLabel;
    private JLabel fat2ResultLabel;
    private JLabel bonesWeightLabel;
    private JButton obliczButton;

    private MainWindow mainWindow;

    public WaterFatBonesResultsDialog(MainWindow mainWindow)
    {
        this.mainWindow = mainWindow;

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        Calculator calculator = new BodyParamsCalculator();
        calculator.setUser(mainWindow.user);

        BodyParams bodyParams = calculator.calculate();


        buttonOK.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        obliczButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                waterResultLabel.setText(Double.toString(bodyParams.getWater()));
                fat1ResultLabel.setText(Double.toString(bodyParams.getFat()));
                fat2ResultLabel.setText(Double.toString(bodyParams.getLBM()));
                bonesWeightLabel.setText(Double.toString(bodyParams.getWeightOfBones()));
            }
        });
    }

    private void onOK()
    {
// add your code here
        dispose();
    }

    private void onCancel()
    {
// add your code here if necessary
        dispose();
    }

    public void showDialog()
    {
        //WaterFatBonesResultsDialog dialog = new WaterFatBonesResultsDialog(mainWindow);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
