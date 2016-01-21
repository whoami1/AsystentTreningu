/**
 * Klasa abstrakcyjna opisująca działanie kalkulatorów.
 */
public abstract class Calculator
{
    /**
     * Zwraca aktualnego użytkownika, dla którego przeprowadzane są obliczenia.
     */
    protected User user;

    /**
     * Ustawia aktualnego użytkownika, dla którego przeprowadzane są obliczenia.
     * @param user aktualny użytkownik
     */
    public void setUser(User user)
    {
        this.user = user;
    }

    /**
     * Funkcja przeprowadzająca obliczenia biometryczne na podstawie danych użytkownika.
     * @return parametry ciała
     */
    public abstract BodyParams calculate();
}
