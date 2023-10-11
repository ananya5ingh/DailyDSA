/*
11.10.2023
Question:
Animal Shelter
An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type). They cannot select which specific animal they would like. Create the data structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.



Example

AnimalQueue animals = new AnimalQueue();
animals.enqueue(new Cat("Kiki"));
animals.enqueue(new Cat("Kari"));
animals.enqueue(new Dog("Beji"));
animals.enqueue(new Cat("Reki"));
animals.enqueue(new Dog("Dexter"));
 
animals.dequeueAny().name();
animals.dequeueDogs().name();
animals.dequeueCats().name();
 
//Output
Cat: Kiki
Dog: Beji
Cat: Kari
 */

import java.util.LinkedList;

abstract class Animal{ // abstract because we will extend this class for Dog class and Cat class also
    
    private int order;
    protected String name;
    public Animal(String n){
        name = n;
    }

    public abstract String name();

    public void setOrder(int ord){

        order = ord;
    }

    public int getOrder(){

        return order;
    }

    public boolean isOlderThan(Animal a){

        return order < a.getOrder();
    }
}

class Cat extends Animal{

    public Cat(String n){
        super(n);
    }

    public String name(){

        return "Cat: "+name;
    }
}

class Dog extends Animal{

    public Dog(String n){
        super(n);
    }

    public String name(){

        return "Dog: "+name;
    }
}

class AnimalQueue{

    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();

    private int order = 0;

    // enqueue
    public void enqueue(Animal a){
        a.setOrder(order);
        order++;
        if(a instanceof Dog){
            dogs.addLast((Dog) a);
        }
        else if(a instanceof Cat){
            cats.addLast((Cat) a);
        }
    }

    public int size(){
        return dogs.size() + cats.size();
    }

    public Dog dequeueDogs(){
        return dogs.poll();
    }
    /*
    The poll() method of Queue Interface returns and removes the element at the front end of the container. 
    It deletes the element in the container. 
    The method does not throws an exception when the Queue is empty, it returns null instead.
     */

    //peekDogs
    public Dog peekDogs(){

        return dogs.peek();
    }

    public Cat dequeueCats(){
        return cats.poll();
    }
    
    
    public Cat peekCats(){
        
        return cats.peek();
    }

    // dequeueAny
    public Animal dequeueAny(){

        if(dogs.size() == 0){
            return dequeueCats();
        }
        else if(cats.size() == 0){
            return dequeueDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if(dog.isOlderThan(cat)){
            return dogs.poll();
        }
        else{
            return cats.poll();
        }
    }

    public Animal peek(){

        if(dogs.size() == 0){
            return cats.peek();
        }
        else if(cats.size() == 0){
            return dogs.peek();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if(dog.isOlderThan(cat)){
            return dogs.peek();
        }
        else{
            return cats.peek();
        }
    }
}

public class DSA_26_AnimalShelter {
    
    public static void main(String[] args){

        AnimalQueue animals = new AnimalQueue();

        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Benji"));
        animals.enqueue(new Cat("Reki"));
        animals.enqueue(new Dog("Dexter"));

        System.out.println(animals.dequeueAny().name());
        System.out.println(animals.dequeueDogs().name());

    }
}
