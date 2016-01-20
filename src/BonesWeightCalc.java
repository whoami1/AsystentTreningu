import java.util.Scanner;

/**
 * Created by Micha³ Wrzesieñ on 2016-01-20.
 */
public class BonesWeightCalc
{
    public Double calc(Integer weight)
    {
        return 0.15*weight;
    }

    public void show (Double result)
    {
        System.out.println("Waga Twoich kosci wynosi: " + result + " kg");;
    }

    public static void main(String[] args)
    {
        BonesWeightCalc bonesWeightCalc = new BonesWeightCalc();

        Scanner in = new Scanner(System.in);

        Integer weight;

        System.out.println("Podaj swoja wage (w kg): ");
        weight = in.nextInt();

        bonesWeightCalc.show(bonesWeightCalc.calc(weight));
    }
}
