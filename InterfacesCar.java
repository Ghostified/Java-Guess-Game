public class InterfacesCar implements InterfacesVehicle{

    public int gear = 0;
    private int speed = 0;
    
    public void changeGear(int gear) {
        this.gear =gear;
    }

    public void speedUp(int change){
        this.speed += change;
    }
    
    public void slowDown(int change) {
        this.speed -= change;
    }

    public void display(){
        System.out.println("I am a car, going at " + this.speed + "km/Hr and I am in gear " + this.gear);
        out();
    }
}
