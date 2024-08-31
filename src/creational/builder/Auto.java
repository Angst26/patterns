package creational.builder;

public class Auto {
    private String mark;
    private float power;
    private String color;


    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mark='" + mark + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}
