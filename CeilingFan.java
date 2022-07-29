// Developer: Cassidy Barr

public class CeilingFan {

    private String fanSpeed;
    private String fanRotation;
    private int speed;
    private boolean rotation;

    // default settings of the ceiling fan;
    public CeilingFan() {

        this.fanSpeed = "The fan is off.";
        this.fanRotation = "The fan is set to rotate clockwise.";
        this.speed = 0;
        this.rotation = true;

    }

    // retrieves the current speed of the fan and sets it to a string;
    public String getSpeed() {

        switch (this.speed) {
            case 0:
                this.fanSpeed = "The fan is off.";
                break;
            case 1:
                this.fanSpeed = "The fan is on setting 1 (low).";
                break;
            case 2:
                this.fanSpeed = "The fan is on setting 2 (medium).";
                break;
            case 3:
                this.fanSpeed = "The fan is on setting 3 (high).";
            default:
                break;
        }

        return this.fanSpeed;

    }

    // retrieves the current rotation of the fan and sets it to a string;
    public String getRotation() {

        if (this.rotation) {
            this.fanRotation = "The fan is set to rotate clockwise.";
        } else {
            this.fanRotation = "The fan is set to rotate counter-clockwise";
        }

        return this.fanRotation;

    }

    // turns on/increases/turns off the speed of the ceiling fan;
    public int pullSpeedCord() {

        this.speed++;
        if(this.speed == 4){ 
            this.speed = 0;
        }

        return this.speed;

    }

    // changes the direction of the rotation of the ceiling fan;
    public boolean pullRotationCord() {

        this.rotation = !this.rotation;

        return this.rotation;
        
    }

    // retrieves and prints the current rotation of the fan;
    public void getFanState(CeilingFan obj) {

        System.out.println(obj);

    }
    
    @Override
    public String toString() {

        return "Current State of the ceiling fan: \n" +  getSpeed() + "\n" + getRotation() + "\n"; 

    }

    
}