public interface SelfDrivingCar
{
    public static int MAX_SPEED = 250;
    /// ALL VARIABLES IN AN INTERFACE ARE PUBLIC AND STATIC
    /// EVEN IF THEY ARENT DECLARED AS PUBLIC STATIC



    public abstract void drive();
    public abstract void stop();
    public abstract void wakeMeUp();

    /// you cannot try to write anything in these abstract methods

    /// all methods inside the interface should be abstract and public
}
