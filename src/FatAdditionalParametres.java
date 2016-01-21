import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FatAdditionalParametres extends JDialog
{
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField waistLineField;
    private JTextField neckSizeField;
    private JTextField hipSizeField;
    private JLabel hipLabel;

    public String getWaistLineField()
    {
        return waistLineField.getText();
    }

    public String getNeckSizeField()
    {
        return neckSizeField.getText();
    }

    public String getHipSizeField()
    {
        return hipSizeField.getText();
    }

    private MainWindow mainWindow;

    public FatAdditionalParametres(MainWindow mainWindow)
    {
        this.mainWindow = mainWindow;

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

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

        setLocationRelativeTo(mainWindow);

        if(mainWindow.user.getGender() == User.Gender.Male)
        {
            hipSizeField.setEnabled(false);
            hipLabel.setForeground(Color.GRAY);
        }
        else
        {
            hipSizeField.setEnabled(true);
            hipLabel.setForeground(Color.BLACK);
        }

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK()
    {
        mainWindow.user.setWaistline(Double.parseDouble(getWaistLineField()));
        mainWindow.user.setNeckSize(Double.parseDouble(getNeckSizeField()));

        if (mainWindow.user.getGender()==(User.Gender.Female))
        {
            mainWindow.user.setHipSize(Double.parseDouble(getHipSizeField()));
        }

        mainWindow.openWaterFatBonesResultDialog();
        dispose();
    }

    private void onCancel()
    {
        this.dispose();
    }

    public void showDialog()
    {
        FatAdditionalParametres dialog = new FatAdditionalParametres(mainWindow);
        dialog.pack();
        setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
