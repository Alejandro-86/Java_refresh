abstract class Animal{
    String type;
    String name;
    public Animal(String type, String name){
        this.type = type;
        this.name = name;
    }
    public void print(){
        System.out.println("Type: " + type + " Name: " + name);
    }
    public void noise(){}
}

final class Dog extends Animal{
    public Dog(String name){
        super("canine", name);
    }
    public void noise(){
        System.out.println("Woof");
    }
}


public class hello {    
    public static void main(String []args) {
       Dog fido = new Dog("Fido");
       fido.print();
 }
}