public class LabInterf {
    public static void main(String[] args) {
        Person pers = new Person("Водительские","Егор",18);
        pers.go(5);
        pers.drive(25);
        pers.move(100);
        pers.getLicence();
        pers.getName();
        pers.getYear();
    }
}
interface allGo{

    void move(int a);
    void go(int a);
    void drive(int a);

}
interface allInfo{
    void getLicence();
    void getName();
    void getYear();
}



class Person implements allGo, allInfo{
    String licence;
    String name;
    int year;
    public Person(String licence, String name, int year){
        this.licence = licence;
        this.name = name;
        this.year = year;
    }
    public void move(int a){
        System.out.println("Скорость перемещения " + a);
    }
    public void go (int a){
        System.out.println("Скорость перемещения " + a);
    }
    public void drive(int a){
        System.out.println("Скорость перемещения " + a);
    }
    public void getLicence(){
        System.out.println("Мои " + licence);
    }
    public void getName(){
        System.out.println("Моё имя " + name);
    }
    public void getYear(){
        System.out.println("Мой возраст " + year);
    }


}
