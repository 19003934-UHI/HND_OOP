package HeadFirstJava.Inheritance_Polymorphism.Animal;

/*
 *  Author: Peter Pasieka
 *  Date Created: 14/10/2020
 *  Class Purpose: Demonstrate inheritance
 */

public class Animal // superclass start 
{
        private String picture;
        private String food;
        private int hunger;
        private int boundaries;
        private int locationX;
        private int locationY;


        public static void makeNoise()
        {

        }

        public static void eat()
        {

        }

        public static void sleep()
        {

        }

        public static void roam()
        {

        }


} // superclass end

/* Each "animal" exhibits different noises and ways of eating, therefore these two methods are overwritten in their OWN class */

/* Feline sub-class */
class Feline extends Animal 
{
    public static void roam()
    {

    }

    
}

/* Feline children */
class Lion extends Feline 
{
        public static void makeNoise()
        {

        }

        public static void eat()
        {

        }

}

class Tiger extends Feline 
{
    public static void makeNoise()
    {

    }

    public static void eat()
    {

    }

}

class Cat extends Feline implements Pet
{
    public static void makeNoise()
    {

    }

    public static void eat()
    {

    }

    public void beFriendly() 
    {
        
    }

    public void play() 
    {
    
    }
}

/* Canine sub-class */
class Canine extends Animal
{
    public static void roam()
    {

    }

}
/* Canine children */
class Dog extends Canine implements Pet
{
    public static void makeNoise()
    {

    }

    public static void eat()
    {

    }

    public void beFriendly() 
    {
        
    }

    public void play() 
    {
    
    }
}

class Wolf extends Canine
{
    public static void makeNoise()
    {

    }

    public static void eat()
    {

    }
}

/* Animal children */
class Hippo extends Animal
{
    public static void makeNoise()
    {

    }

    public static void eat()
    {

    }

}