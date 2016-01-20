/**
 * Created by Adamus on 2016-01-20.
 */
public abstract class Calculator
{
    protected User user;

    public void setUser(User user)
    {
        this.user = user;
    }

    public abstract BodyParams calculate();
}
