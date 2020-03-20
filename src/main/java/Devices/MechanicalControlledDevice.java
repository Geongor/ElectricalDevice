package Devices;

import Devices.ControlMethodsOfDevices.ControlMethods;

/**
 *
 * Электроприбор с механических управлением
 *
 */

public class MechanicalControlledDevice extends Device {

    public ControlMethods ControlMethod;

    public MechanicalControlledDevice(String typeOfDevice, int powerOfDevice, boolean turnedOn,
                                      int controlMethod){

        super(typeOfDevice,powerOfDevice,turnedOn);

        this.ControlMethod = ControlMethods.MechanicalControlled.values()[controlMethod];
    }

    @Override
    public void Print(){

        String turnedOn;
        if (isTurnedOn()){

            turnedOn = "ON";
        } else {
            turnedOn = "OFF";
        }
        System.out.println("Тип прибора: " + getTypeOfDevice() + "\nМожность: " + getPowerOfDevice() +
                "\nПитание: " + turnedOn + "\nСпособ управления: " + ControlMethod + "\n" +
                "------------------------");
    }

}
