import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Micha³ Wrzesieñ on 2016-01-20.
 */
public class BMICalc
{
    public Double calc(Integer weight, Integer height)
    {
        Double heightM = (double)height/100;
        return (double)(weight/(double)(heightM*heightM));
    }

    public String bmiClassification(Double result)
    {
        String bmiClass = "";
        if(result<16.0)
        {
            bmiClass = "wyglodzenie";
        }
        else if ((result>16.0) && (result<16.99))
        {
            bmiClass = "wychudzenie";
        }
        else if ((result>17.0) && (result<18.49))
        {
            bmiClass = "niedowaga";
        }
        else if ((result>18.5) && (result<24.99))
        {
            bmiClass = "wartosc prawidlowa";
        }
        else if ((result>25.0) && (result<29.99))
        {
            bmiClass = "nadwaga";
        }
        else if((result>30.0) && (result<34.99))
        {
            bmiClass = "I st otylosci";
        }
        else if((result>35.0) && (result<39.99))
        {
            bmiClass = "II st otylosci (otylosc kliniczna)";
        }
        else
        {
            bmiClass = "otylosc skrajna";
        }
        return bmiClass;
    }

    public void show(String bmiClass, Double result)
    {
        System.out.println("Twoje BMI wynosi: " + result);
        System.out.println("Zostalo sklasyfikowane jako: " + bmiClass);
    }

    public static void main(String[] args)
    {
        BMICalc bmiCalc = new BMICalc();

        Integer weight, height;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj wage (w kg): ");
        weight = in.nextInt();

        System.out.println("Podaj wzrost (w cm): " );
        height = in.nextInt();

        Double result = bmiCalc.calc(weight,height);

        bmiCalc.show(bmiCalc.bmiClassification(result),result);

    }
}
