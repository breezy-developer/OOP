public class OOP 

    

{
    public static void main(String[] args)
    {

        Swimable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();

    }

    public static void test(Swimable animal)
    {
        animal.swim();
    }

    static interface Walkable
    {
        void walk();
    }

    static interface Swimable
    {
        void swim();
    }

    static abstract class OceanAnimal implements Swimable
    {
        public void swim()
        {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming()
        {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal
    {

        
        Swimable getCurrentAnimal()
        {
            return this;
        }
    }

    static class Whale extends OceanAnimal
    {

        
        Swimable getCurrentAnimal()
        {
            return this;
        }
    }

    static class Otter implements Walkable, Swimable
    {


        
        public void walk()
        {

        }

        
        public void swim()
        {

        }
    }
}