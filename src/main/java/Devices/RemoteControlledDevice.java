package Devices;

import Devices.ControlMethodsOfDevices.ControlMethods;

/**
 *
 * Электроприбор с дистанционным управлением
 *
 */

public class RemoteControlledDevice extends Device {

    public ControlMethods ControlMethod;

    public RemoteControlledDevice(String typeOfDevice, int powerOfDevice, boolean turnedOn,
                                  int controlMethod){

        super(typeOfDevice,powerOfDevice,turnedOn);

        this.ControlMethod = ControlMethods.RemoteControlled.values()[controlMethod];
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
                "\nПитание: " + turnedOn + "\nСпособ управления: " + ControlMethod +  "\n" +
                "------------------------");
    }
}
