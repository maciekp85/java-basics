package pl.javastart.basic.topic18;

/**
 * Created by nishi on 2017-03-05.
 */
public class Notebook extends Computer {

  private int batteryCapacity;

  public int getBatteryCapacity() {
    return batteryCapacity;
  }

  public void setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity) {
    super(cpuTemperature, ramMemory);
    setBatteryCapacity( batteryCapacity );
  }

  @Override
  public void coolDown() {
    super.coolDown();
    turboDown();
  }

  private void turboDown() {
    setCpuTemperature( getCpuTemperature() - 2 );
  }
}
