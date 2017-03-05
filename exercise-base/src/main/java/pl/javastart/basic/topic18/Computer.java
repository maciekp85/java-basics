package pl.javastart.basic.topic18;

/**
 * Created by nishi on 2017-03-05.
 */
public class Computer {

  private double cpuTemperature;
  private int ramMemory;

  public double getCpuTemperature() {
    return cpuTemperature;
  }

  public void setCpuTemperature(double cpuTemperature) {
    this.cpuTemperature = cpuTemperature;
  }

  public int getRamMemory() {
    return ramMemory;
  }

  public void setRamMemory(int ramMemory) {
    this.ramMemory = ramMemory;
  }

  public Computer(double cpuTemperature, int ramMemory) {
    setCpuTemperature( cpuTemperature );
    setRamMemory( ramMemory );
  }

  public void coolDown() {
    setCpuTemperature( getCpuTemperature() -1 );
  }
}
