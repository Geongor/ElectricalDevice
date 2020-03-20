import Devices.Device;
import Devices.ReaderFromTXT.ReadDevicesFromTXT;

import java.io.IOException;
import java.util.*;

/**
 *
 * Менеджер, управляющий основным функционалом
 *
 */

public class Manager {

    private List<Device> listOfDevices;

    public  Manager() throws IOException {

        listOfDevices = ReadDevicesFromTXT.ReadDevices();
    }

    /**
     *
     * Выводит на экран весь текущий список
     * электроприборов
     *
    */

    public void PrintList(){

        for (Device device : listOfDevices){

            device.Print();
        }
    }

    /**
     *
     * Подсчитывает и выводит на экран потребляемую
     * мощность включенными в розетку электроприборами
     *
     */

    public  void TotalPower(){

        int totalPower = 0;
        for (Device device : listOfDevices){

            if (device.isTurnedOn()){

                totalPower += device.getPowerOfDevice();
            }
        }
        System.out.println("Потребляемая можщность: " + totalPower);
    }

    /**
     *
     * Сортирует список электроприборов
     * по возрастанию мощности
     *
     */

    public void SortByPower(){

        Collections.sort(listOfDevices);
    }

    /**
     *
     * Выводит на экран информацию
     * о всех электроприборах
     * соответствующих заданному диапазону
     * значений мощности
     *
     *
     * @param min нижний предел диапазона
     * @param max верхнгий предел диапазона
     *
     */

    public  void RangeOfPower(int min, int max){

        for (Device device : listOfDevices){

            if ((device.getPowerOfDevice() > min) && (device.getPowerOfDevice() < max)){

                device.Print();
            }
        }
    }
}
