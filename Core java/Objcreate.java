public class Objcreate {
    public static void main(String args[]){
        Car mycar = new Car("BMW",2020);
        Car mycar1 = new Car("Benz",2024);
        mycar.displaycar();
        System.out.println();
        mycar1.displaycar();
        System.out.println();
        System.out.println(mycar==mycar1);
    }
}
