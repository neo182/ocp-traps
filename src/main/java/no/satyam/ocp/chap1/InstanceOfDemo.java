package no.satyam.ocp.chap1;

/**
 *
 * @author satyam
 */
public class InstanceOfDemo {
    public static void main(String[] args) {
        Animal animal = new Hippo();
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof HeavyAnimal);
        System.out.println(animal instanceof Hippo);
        
        System.out.println(animal instanceof Object); //always true
        System.out.println(null instanceof Object); //always false
        
        
        Hippo hippo = new Hippo();
        Rino rino = new Rino();
        //following lines do not compile as the compiler knows rino and hippo doesn't belong to the single heritance line
        // System.out.println(rino instanceof Hippo);
        // System.out.println(hippo instanceof Rino);
        
    }
}

class Animal {}
class HeavyAnimal extends Animal{}
class Hippo extends HeavyAnimal{}
class Rino extends HeavyAnimal{}