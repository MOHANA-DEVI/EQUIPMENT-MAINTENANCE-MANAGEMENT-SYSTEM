import java.util.ArrayList;
import java.util.List;

public class service {
    List<model> ls= new ArrayList<>();

    void addequ(model m){
        maintance(m);
        ls.add(m);
        System.out.println("added successfully");
    }
    void maintance(model m){
        if(m.temperatue>90 || m.pressure>60 || m.runningHours>180){
            m.maintenancereq=true;
        }
        else{
            m.maintenancereq=false;
        }
    }
    void update(int id,double temp,double press,int hours){
        model m=getelementbyid(id);
        if(m!=null){
            m.temperatue=temp;
            m.pressure=press;
            m.runningHours=hours;
            maintance(m);
            System.out.println("updated successfully");
        }
        else{
            System.out.println("equipment not found");
        }
    }
    model getelementbyid(int id){
        for(model m:ls){
            if(m.equipmentId==id){
                return m;
            }
        }
        return null;
    }
    void getdetails(){
        if(ls.isEmpty()){
            System.out.println("no machine found");
            return;
        }
        for(model m:ls){
            System.out.println("id:"+m.equipmentId+"name:"+m.equipmentname+"temp:"+m.temperatue+"pressure"+m.pressure+"runninghours:"+m.runningHours+"maintainance"+m.maintenancereq);
        }
    }
}
