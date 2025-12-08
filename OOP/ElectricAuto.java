
public class ElectricAuto extends Auto{

    double batteryCapacity;

    public ElectricAuto(String newName, int newYear, double newtotalDistance, double batteryCapacity){
        super(newName, newYear, newtotalDistance);
        this.batteryCapacity =  batteryCapacity;
    }

    public static void main(String[] args){
        ElectricAuto car1 = new ElectricAuto("Tesla20", 2027, 0, 100);
    }

    @override
    public double drive(double distance){
        
        return super.drive(distance);
    }

}