package LowLevelDesign.vamsiPractise.UNDO_REDO_Command_Design_Pattern;

public class AirConditioner {

    boolean isAcOn;
    int temp;

    public void startCooling(){
        isAcOn = true;
        System.out.println("AC Turned on, room will be cool in a while");
    }

    public void reduceCooling(){
        isAcOn = false;
        System.out.println("AC Turned off, room will be back to outside temperature");
    }

    public void setTemp(int temp){
        this.temp = temp;
        System.out.println("AC Temp has updated to "+temp);
    }
}
