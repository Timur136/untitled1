package OOP;

abstract class Animal {

}

abstract class WildAnimal extends Animal {

}

abstract class HomeAnimal extends Animal {

}

abstract class WaterAnimal extends WildAnimal {

}

abstract class ForestAnimal extends WildAnimal {

}

abstract class Pets extends HomeAnimal {

}

abstract class Livestock extends HomeAnimal {

}

class Cow extends Livestock {

}

class Wolf extends ForestAnimal {

}

class Monkey extends Animal {
    public void climbTrees() {

    }
}

class Shark extends Animal {
    public void eatTourists() {

    }
}

class Bird extends Animal {
    public void fly() {

    }
}