
public class BodyParamsCalc extends Calculator {

    private double calcBmi()
    {
        double heightM = (double)user.getHeight()/100;
        return (double)(user.getWeight()/(double)(heightM*heightM));
    }
    private Double[] calcFat()
    {
        double hsel = 0.3937;
        double wsel = 2.2046;
        double wcsel = 0.3937;
        double hcsel = 0.3937;
        double ncsel = 0.3937;
        double res2sel = 2.2046;

        Double[] tablicaWynikow = new Double[2];

        if(gender.contains("woman"))
        {
            tablicaWynikow[0] = 163.205 * Math.log(user.getHipSize() * wcsel + user.getWaistline() * hcsel - user.getNeckSize() * ncsel) / Math.log(10) - 97.684 * Math.log(user.getHeight() * hsel) / Math.log(10) - 78.387;
            tablicaWynikow[1] = user.getWeight() * wsel * (100-tablicaWynikow[0]) * 0.01 / res2sel;
        }
        else
        {
            tablicaWynikow[0] = 86.01 * Math.log(user.getHipSize() * wcsel - user.getNeckSize() * ncsel) / Math.log(10) - 70.041 * Math.log(user.getHeight() * hsel) / Math.log(10) + 36.76;
            tablicaWynikow[1] = user.getWeight() * wsel * (100-tablicaWynikow[0]) * 0.01 / res2sel;
        }
        return tablicaWynikow;
    }

    private double calcBonesWeight()
    {

    }

    @java.lang.Override
    public BodyParams calculate() {
        return null;
    }
}
