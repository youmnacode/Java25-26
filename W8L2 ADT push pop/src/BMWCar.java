public class BMWCar implements SelfDrivingCar , LookGood
{

    /// THEY HAVE TO BE IMPLEMENTED IN THE CLASS
    /// WITHOUT WRITING ABSTRACT



    @Override
    public void drive()
    {
        System.out.println("BMW driving");
    }

    @Override
    public void stop()
    {
        System.out.println("BMW stopping");
    }

    @Override
    public void wakeMeUp()
    {
        System.out.println("BMW waking you up");
    }


    /// implement methods of interfaces you implement
    /// unlike classes which cannot extend multiple classes, a class can implement more than one interface
    @Override
    public void doesItLookGood() {

    }
}
