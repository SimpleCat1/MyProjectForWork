package BasicClass;

public class Person extends Animal{
    protected String text;
    Person(){

    }

    Person(String text){
        this.text=text;
    }
    public void animalSay(){
        System.out.println(this.text);}
}
