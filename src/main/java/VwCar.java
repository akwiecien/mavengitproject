public class VwCar implements ICar {

    private String name ;

    public VwCar(String name){

        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public String drive() {
        return this.name+" is driving";
    }
}
