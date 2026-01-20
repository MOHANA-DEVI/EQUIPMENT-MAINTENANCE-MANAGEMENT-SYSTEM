public class model {
    int equipmentId;
    String equipmentname;
    double temperatue;
    double pressure;
    int runningHours;
    boolean maintenancereq;

    model(int equipmentId,String equipmentname,double temperatue,double pressure,int runningHours){
        this.equipmentId=equipmentId;
        this.equipmentname=equipmentname;
        this.temperatue=temperatue;
        this.pressure=pressure;
        this.runningHours=runningHours;
        maintenancereq=false;
    }
}

