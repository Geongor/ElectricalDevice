import Devices.Device;
import Devices.MechanicalControlledDevice;
import Devices.ReaderFromTXT.ReadDevicesFromTXT;
import Devices.RemoteControlledDevice;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDevicesFromTXT_Test {

//    @Test
//    public void ShouldReturnListOfDevicesFromTxtFile_whenInvokeReadDevices() throws IOException {
//
//        List<Device> testList = new ArrayList<Device>();
//        testList.add(new RemoteControlledDevice("Lamp", 700, true, 1));
//        testList.add(new RemoteControlledDevice("TV", 2000, false, 0));
//        testList.add(new MechanicalControlledDevice("Computer", 1500, true, 0));
//
//        Assert.assertEquals(testList, ReadDevicesFromTXT.ReadDevices());
//    }
}
