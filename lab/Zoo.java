class Animal{
    void makeSound(){
        System.out.println("Some animal sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks!!!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat meow!!!");
    }
}



class Zoo{
    public static void main(String[] args) {
        Animal a;
        a=new Cat();
        a.makeSound();
        
        a=new Dog();
        a.makeSound();
    }
}