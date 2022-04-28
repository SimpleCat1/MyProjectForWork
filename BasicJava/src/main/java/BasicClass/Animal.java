package BasicClass;

public abstract class Animal {
    public int year = 21;

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void animalSay(){
        System.out.println("Мяуууу");
    }
}
