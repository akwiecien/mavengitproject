public class AudiCar implements ICar {

    private String name;

    public AudiCar(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String drive() {

        return this.name+" is Driving";
    }
}
