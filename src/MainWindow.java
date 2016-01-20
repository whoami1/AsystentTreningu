import javax.swing.*;

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

    public MainWindow()
    {

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
}
