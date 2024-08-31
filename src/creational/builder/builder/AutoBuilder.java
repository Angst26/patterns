package creational.builder.builder;

import creational.builder.Auto;

public abstract class AutoBuilder {
    private Auto auto;

    public AutoBuilder() {
        createAuto();
    }

    public abstract void createMark();

    public abstract void createPower();

    public abstract void createColor();

    public Auto getAuto() {
        return auto;
    }

    public void createAuto(){
        auto = new Auto();
    }

    public Auto build() {
        createMark();
        createPower();
        createColor();

        return this.auto;
    }




}
