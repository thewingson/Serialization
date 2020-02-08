package task2;

import java.io.Serializable;

/**
 * @author Almat on 08.02.2020
 */
public class Engine implements Serializable {

    private Long vin;
    private Short power;

    public Engine(Long vin, Short power) {
        this.vin = vin;
        this.power = power;
    }

    public Long getVin() {
        return vin;
    }

    public void setVin(Long vin) {
        this.vin = vin;
    }

    public Short getPower() {
        return power;
    }

    public void setPower(Short power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "vin=" + vin +
                ", power=" + power +
                '}';
    }
}
