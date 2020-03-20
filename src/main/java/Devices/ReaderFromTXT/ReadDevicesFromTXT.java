package Devices.ReaderFromTXT;

import Devices.Device;
import Devices.MechanicalControlledDevice;
import Devices.RemoteControlledDevice;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Считывает из файла список электроприборов
 *
 */

public class ReadDevicesFromTXT {

    private static final String PATH = "ListOfDevices.txt";

    public static List<Device> ReadDevices() throws IOException {

        final Logger log = Logger.getLogger(ReadDevicesFromTXT.class);

        List<Device> listOfDevices = new ArrayList<Device>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH));
            String line;
            String[] parts = new String[5];
            String TypeOfDevice;
            int PowerOfDevice;
            boolean TurnedOn;
            int controlMethod;

            while ((line = reader.readLine()) != null) {

                parts = line.split(" ");

                TypeOfDevice = parts[1];
                PowerOfDevice = Integer.parseInt(parts[2]);
                TurnedOn = parts[3].equals("1");
                controlMethod = Integer.parseInt(parts[4]);

                if (Integer.parseInt(parts[0]) == 0) {

                    listOfDevices.add(new MechanicalControlledDevice(TypeOfDevice, PowerOfDevice,
                            TurnedOn, controlMethod));

                } else {

                    listOfDevices.add(new RemoteControlledDevice(TypeOfDevice, PowerOfDevice,
                            TurnedOn, controlMethod));

                }
            }
        }
        catch (FileNotFoundException e){

            System.out.println("Файл не найден!");
            log.error("Не найден файл со списком электроприборов");
            System.exit(-1);

        }
        catch (NumberFormatException e){

            System.out.println("Неверный формат данных!");
            log.error("Неверный формат данных");
            System.exit(1);
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Неполная описание электроприбора в классе!");
            log.error("Индекс вышел за границу массива");
            System.exit(2);
        }
        return listOfDevices;
    }
}
