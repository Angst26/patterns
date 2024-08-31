package creational.builder.builder;

public class HeavyAutoBuilder extends AutoBuilder{
    public HeavyAutoBuilder() {
        super();
    }

    @Override
    public void createMark() {
        getAuto().setMark("Камаз");
    }

    @Override
    public void createPower() {
        getAuto().setPower(500);
    }

    @Override
    public void createColor() {
        getAuto().setColor("Оранжевый");
    }
}
