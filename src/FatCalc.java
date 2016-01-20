import java.util.Scanner;

/**
 * Created by Micha³ Wrzesieñ on 2016-01-20.
 */
public class FatCalc
{
    public Double hsel = 0.3937;
    public Double wsel = 2.2046;
    public Double wcsel = 0.3937;
    public Double hcsel = 0.3937;
    public Double ncsel = 0.3937;
    public Double res2sel = 2.2046;

    public Double[] calculate(String gender, Integer weight, Integer height, Integer size1, Integer size2, Integer size3)
    {
        Double[] tablicaWynikow = new Double[2];

        if(gender.contains("woman"))
        {
            tablicaWynikow[0] = 163.205 * Math.log(size1 * wcsel + size3 * hcsel - size2 * ncsel) / Math.log(10) - 97.684 * Math.log(height * hsel) / Math.log(10) - 78.387;
            tablicaWynikow[1] = weight * wsel * (100-tablicaWynikow[0]) * 0.01 / res2sel;
        }
        else
        {
            tablicaWynikow[0] = 86.01 * Math.log(size1 * wcsel - size2 * ncsel) / Math.log(10) - 70.041 * Math.log(height * hsel) / Math.log(10) + 36.76;
            tablicaWynikow[1] = weight * wsel * (100-tablicaWynikow[0]) * 0.01 / res2sel;
        }
        return tablicaWynikow;
    }

    public void show(Double[] tablicaWynikow)
    {
        System.out.println("Twoja zawartosc tkanki tluszczowej w % wynosi: " + tablicaWynikow[0]);
        System.out.println("Twoja zawartosc beztluszczowej masy ciala w kg wynosi: " + tablicaWynikow[1]);
    }

    public static void main(String[] args)
    {
        FatCalc fatCalc = new FatCalc();

        Integer weight, height, size1, size2, size3 = 0;
        String gender;

        Scanner in = new Scanner(System.in);

        System.out.println("Wybierz plec");
        gender = in.nextLine();

        System.out.println("Podaj swoja wage (w kg)");
        weight = in.nextInt();

        System.out.println("Podaj swoj wzrost (w cm)");
        height = in.nextInt();

        System.out.println("Podaj swoj obwod w pasie (w cm)");
        size1 = in.nextInt();

        System.out.println("Podaj swoj obwod w szyi (w cm)");
        size2 = in.nextInt();

        if(gender.contains("woman"))
        {
            System.out.println("Podaj swoj obwod w biodrach (w cm)");
            size3 = in.nextInt();
        }

        fatCalc.show(fatCalc.calculate(gender, weight, height, size1, size2, size3));
    }
}
