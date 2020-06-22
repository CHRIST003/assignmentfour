package ac.za.cput;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    private List<Animal> animalList = new ArrayList<>();

    public boolean addAnimals(Animal animal){
        return animalList.add(animal);
    }

    public List<Animal> readAll(){
        return animalList;
    }


    public Animal getAnimal(String name){
        for(Animal animal: animalList){
            if(animal.getName().equals(name)){
                return animal;
            }
        }return null;
    }

    public boolean readList(List<Animal> animals){
        boolean result = false;
        for(Animal animal: animals){
            if(addAnimals(animal)){

            }else
                return false;
        }return true;
    }

}
