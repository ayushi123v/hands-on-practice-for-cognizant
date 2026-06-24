class AnimalFactory{
    public static Animal getAnimal(String animalType){
        if(animalType.equalsIgnoreCase("dog")){
            return new Dog();
        } else if(animalType.equalsIgnoreCase("cat")){
            return new Cat();
        }
        return null;
    }
}