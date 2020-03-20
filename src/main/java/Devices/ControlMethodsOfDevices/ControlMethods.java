package Devices.ControlMethodsOfDevices;

/**
 *
 * Содержит возможные способы управления
 * электроприборами
 *
 */

public interface ControlMethods {

    enum MechanicalControlled implements ControlMethods {BUTTONS, AUTOMATIC};
    enum RemoteControlled implements  ControlMethods {WIFI, CONTROLLER};
}
