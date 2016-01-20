
public class BodyParamsCalc extends Calculator {
    BodyParams bp = new BodyParams();

    private double fat;
    private double meat;

    private double calcBmi()
    {
        double heightM = (double)user.getHeight()/100;
        return (double)(user.getWeight()/(double)(heightM*heightM));
    }
    private double calcFat()
    {
        double hsel = 0.3937;
        double wsel = 2.2046;
        double wcsel = 0.3937;
        double hcsel = 0.3937;
        double ncsel = 0.3937;
        double res2sel = 2.2046;

        if(user.getGender().contains("woman"))
        {
            fat = 163.205 * Math.log(user.getHipSize() * wcsel + user.getWaistline() * hcsel - user.getNeckSize() * ncsel) / Math.log(10) - 97.684 * Math.log(user.getHeight() * hsel) / Math.log(10) - 78.387;
        }
        else
        {
            fat = 86.01 * Math.log(user.getHipSize() * wcsel - user.getNeckSize() * ncsel) / Math.log(10) - 70.041 * Math.log(user.getHeight() * hsel) / Math.log(10) + 36.76;
        }
        return fat;
    }
    private double calcMeat()
    {
        double hsel = 0.3937;
        double wsel = 2.2046;
        double wcsel = 0.3937;
        double hcsel = 0.3937;
        double ncsel = 0.3937;
        double res2sel = 2.2046;

        if(gender.contains("woman"))
        {
            meat = user.getWeight() * wsel * (100-fat) * 0.01 / res2sel;
        }
        else
        {
            meat = user.getWeight() * wsel * (100-fat) * 0.01 / res2sel;
        }
        return meat;
    }
    private double calcBonesWeight()
    {
        return 0.15*meat;
    }

    private double calcWater()
    {
        double wynik;

        if (user.getGender().contains("woman"))
        {
            wynik = -2.097 + (0.1069*user.getHeight()) + (0.2466*user.getWeight());
        }
        else
        {
            wynik = 2.447 - (0.09156*user.getAge()) + (0.1074*user.getHeight()) + (0.3362*user.getWeight());
        }
        return wynik;
    }

    @java.lang.Override
    public BodyParams calculate() {
        return null;
    }
}