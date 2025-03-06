public class Car {
    private String mark;
    private int yearRelease;
    private double capacityVolume;

    public Car(String mark, int yearRelease, double capacityVolume) {
        this.mark = mark;
        this.yearRelease = yearRelease;
        this.capacityVolume = capacityVolume;
    }

    public String getMark() {
        return mark;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public double getCapacityVolume() {
        return capacityVolume;
    }
}
