class cat 
{
    String name;
    int age;
    static String species = "Carnivore";
    void intro()
    {
        System.out.printf("Name of cat is %s %nage is %d %nIt is a %s %n",name,age,species);
    }
    static void makeSound()
    {
        System.out.println("Sounds as Meow!");
    }
}
class instance
{
    public static void main(String[] args) 
    {
        cat c = new cat();
        c.name = "Bob";
        c.age = 100;
        c.intro();
        cat.makeSound();
    }
}