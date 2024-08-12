
public class Car {
    String brand;
    int year;
    public Car(String brand,int year){
        this.brand = brand;
        this.year = year;
    }
    public void displaycar(){
        System.out.print(this.brand+" "+this.year);
    }
}
