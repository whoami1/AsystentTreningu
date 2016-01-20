import java.util.Scanner;

/**
 * Created by Micha³ Wrzesieñ on 2016-01-20.
 */
public class WaterCalc
{
    public Double calc(String gender, Integer height, Integer weight, Integer age)
    {
        Double wynik;

        if (gender.contains("woman"))
        {
            wynik = -2.097 + (0.1069*height) + (0.2466*weight);
        }
        else
        {
            wynik = 2.447 - (0.09156*age) + (0.1074*height) + (0.3362*weight);
        }
        return wynik;
    }

    public void show(Double wynik)
    {
        System.out.println("Zawartosc wody w Twoim organizmie to: " + wynik + "litrow");
    }

    public static void main(String[] args)
    {
        WaterCalc waterCalc = new WaterCalc();

        Scanner in = new Scanner(System.in);

        Integer weight, height, age;
        String gender;


        System.out.println("Wybierz plec");
        gender = in.nextLine();

        System.out.println("Podaj swoja wysokosc (w cm)");
        height = in.nextInt();

        System.out.println("Podaj swoja wage (w kg)");
        weight = in.nextInt();

        System.out.println("Podaj swoj wiek");
        age = in.nextInt();

        waterCalc.show(waterCalc.calc(gender,height,weight,age));
    }
}
