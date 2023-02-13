public class Main {
    public static void main(String[] args){
        Animal duck = new Animal("Duck", "Koko", 3, 5.8, true, true, true);
        System.out.println("Name - " + duck.getName());
        System.out.println("Type - " + duck.getType());
        System.out.println("Age - " + duck.getAge());
        System.out.println("Weight - " + duck.getWeight());
        System.out.println("Can swim - " + duck.isSwim());
        System.out.println("Can walk - " + duck.isWalk());
        System.out.println("Can fly - " + duck.isFly());
        duck.holiday(5);
        duck.rename("Kokolia");

        System.out.println("---------------------------");

        Dog dog = new Dog("Dog","Rex",5,10,false,true,true,"black");
        System.out.println("Name - " + dog.getName());
        System.out.println("Type - " + dog.getType());
        System.out.println("Age - " + dog.getAge());
        System.out.println("Color - " + dog.getColor());
        System.out.println("Weight - " + dog.getWeight());
        System.out.println("Can swim - " + dog.isSwim());
        System.out.println("Can walk - " + dog.isWalk());
        System.out.println("Can fly - " + dog.isFly());
        dog.holiday(5);
        dog.rename("New_name");
        dog.speak();
    }
}







