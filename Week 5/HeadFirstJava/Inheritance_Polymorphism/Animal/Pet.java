package HeadFirstJava.Inheritance_Polymorphism.Animal;

/*
 * This class is used to seperate methods for specific types of animals
 * Only domesticated dogs and cats are allow to access these methods
 * This prevents other animals within the "Animal" class inheriting these
 * domesticated features.
 */


public interface Pet 
{
    public abstract void beFriendly();
    public abstract void play();
}
