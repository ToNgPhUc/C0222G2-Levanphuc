package ss7_abstract_class_interface.thuc_hanh1;

public class Text {
    public static void main(String[] args) {

        Animal[]animals= new Animal[2];
        animals[0]=new Tiger();
        animals[1]= new Chicken();
        for (Animal animal:animals
             ) {
            System.out.println(animal.makeSound());
if (animal instanceof Chicken){
    Edible edible=  (Chicken)animal;
    System.out.println(edible.howToEat());
}
        }

        Fruit[]fruits= new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]=new Orange();
        for (Fruit fruit:fruits
             ) {
            System.out.println(fruit.howToEat());
        }
    }
}
