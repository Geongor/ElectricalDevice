package Devices;

/**
 *
 * Общее описание электроприбора
 *
 */

public abstract class Device implements Comparable<Device> {

    private String TypeOfDevice;
    private int PowerOfDevice;
    private boolean TurnedOn;

    public Device(String typeOfDevice, int powerOfDevice, boolean turnedOn){
        this.TypeOfDevice = typeOfDevice;
        if (powerOfDevice < 0){
            this.PowerOfDevice = 0;
        } else {
            this.PowerOfDevice = powerOfDevice;
            this.TurnedOn = turnedOn;
        }
    }

    public Device(){
        this.TypeOfDevice = "";
        this.PowerOfDevice = 0;
        this.TurnedOn = false;
    }

    /**
     *
     * Выводит на экран информацию
     * о электроприборе
     *
     */

    public void Print(){

        String turnedOn;
        if (TurnedOn){

            turnedOn = "ON";
        } else {
            turnedOn = "OFF";
        }
        System.out.println("Тип прибора: " + TypeOfDevice + "\nМожность: " + PowerOfDevice +
                "\nПитание: " + turnedOn + "\n" +  "------------------------");
    }

    @Override
    public int compareTo(Device o) {

        int value = ((Device) o).getPowerOfDevice();
        return this.getPowerOfDevice() - value;
    }


    public String getTypeOfDevice() {
        return TypeOfDevice;
    }

    public int getPowerOfDevice() {
        return PowerOfDevice;
    }

    public boolean isTurnedOn() {
        return TurnedOn;
    }
}
