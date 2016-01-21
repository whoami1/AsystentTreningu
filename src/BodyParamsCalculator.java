/**
 * Klasa służąca do obliczeń parametrów ciała
 */
public class BodyParamsCalculator extends Calculator
{
    BodyParams bp = new BodyParams();

    /**
     * Zmienna opisująca zawartość tkanki tłuszczowej w organizmie.
     */
    private double fat;

    /**
     * Zmienna opisująca wagę tkanki mięśniowej.
     */
    private double meat;

    /**
     * Funkcja licząca BMI
     * @return wartość BMI
     */
    private double calcBmi()
    {
        double heightM = (double)user.getHeight()/100;
        return (double)(user.getWeight()/(double)(heightM*heightM));
    }

    /**
     * Funkcja licząca zawartość tkanki tłuszczowej w organizmie.
     */
    private void calcFat()
    {
        /**
         * Stałe używane w obliczeniach tkanki tłuszczowej w organizmie.
         */
        double hsel = 0.3937;
        double wsel = 2.2046;
        double wcsel = 0.3937;
        double hcsel = 0.3937;
        double ncsel = 0.3937;
        double res2sel = 2.2046;

        if(user.getGender()== User.Gender.Female)
        {
            fat = 163.205 * Math.log(user.getWaistline() * wcsel + user.getHipSize() * hcsel - user.getNeckSize() * ncsel) / Math.log(10) - 97.684 * Math.log(user.getHeight() * hsel) / Math.log(10) - 78.387;
        }
        else
        {
            fat = 86.01 * Math.log(user.getWaistline() * wcsel - user.getNeckSize() * ncsel) / Math.log(10) - 70.041 * Math.log(user.getHeight() * hsel) / Math.log(10) + 36.76;
        }
    }

    /**
     * Funkcja licząca wagę tkanki mięśniowej.
     */
    private void calcMeat()
    {
        double hsel = 0.3937;
        double wsel = 2.2046;
        double wcsel = 0.3937;
        double hcsel = 0.3937;
        double ncsel = 0.3937;
        double res2sel = 2.2046;

        if(user.getGender()==User.Gender.Female)
        {
            meat = user.getWeight() * wsel * (100-fat) * 0.01 / res2sel;
        }
        else
        {
            meat = user.getWeight() * wsel * (100-fat) * 0.01 / res2sel;
        }
    }

    /**
     * Funkcja licząca wagę kości na podstawie wagi tkanki mięśniowej.
     * @return waga kości
     */
    private double calcBonesWeight()
    {
        return 0.15*meat;
    }

    /**
     * Funkcja licząca zawartość wody w organizmie.
     * @return zawartość wody w organizmie
     */
    private double calcWater()
    {
        double wynik;

        if (user.getGender()==User.Gender.Female)
        {
            wynik = -2.097 + (0.1069*user.getHeight()) + (0.2466*user.getWeight());
        }
        else
        {
            wynik = 2.447 - (0.09156*user.getAge()) + (0.1074*user.getHeight()) + (0.3362*user.getWeight());
        }
        return wynik;
    }

    /**
     * Funkcja przekazująca wyniki do klasy BodyParams
     * @return wyniki
     */
    @java.lang.Override
    public BodyParams calculate()
    {
        calcFat();
        calcMeat();
        bp.setBMI(calcBmi());
        bp.setFat(fat);
        bp.setLBM(meat);
        bp.setWeightOfBones(calcBonesWeight());
        bp.setWater(calcWater());
        return bp;
    }
}