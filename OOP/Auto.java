

public class Auto{

   private String name;
   private int year;
   private double totalDistance;


    public Auto( String marka, int gads, double attalums){
             this.name = marka;
             this.year = gads;
             this.totalDistance = attalums;
    }

    // public static void main(String[] args){

    //     Auto firstAuto = new Auto("BMW", 2010, 0);
    //     Auto secondAuto = new Auto("Tesla" , 2022, 10000);

    //     System.out.println(firstAuto.name);

    //     firstAuto.drive(200);
    //     firstAuto.showTotalDistance();
    //     secondAuto.showTotalDistance();
    //     secondAuto.printInfo();

    // }

    //getter
    public String getAutoName() {
    return name;
    }

    // Setter
    public void setAuto(String newName, int newYear, double newtotalDistance) {
        this.name = newName;
        this.year = newYear;
        this.totalDistance = newtotalDistance;
    }

    public void printInfo(){
        System.out.println("Auto mark: " + this.name + ", year: " + year + ", total distance: " + totalDistance );
    }

    public void showTotalDistance(){
        System.out.println(this.totalDistance);
    }

    public double drive(double distance){
       return this.totalDistance += distance;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.year + ") " + this.totalDistance;
    }

}




