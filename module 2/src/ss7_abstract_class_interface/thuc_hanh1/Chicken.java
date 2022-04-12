package ss7_abstract_class_interface.thuc_hanh1;

import ss7_abstract_class_interface.thuc_hanh1.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken: chip chip";
    }

    @Override
    public String howToEat() {
        return "chien xu";
    }
}
