package creational.builder.builder;

public class LeightAutoBuilder extends AutoBuilder{

    public LeightAutoBuilder(){
        super();
    }
    @Override
    public void createMark() {
        getAuto().setMark("Mazda");
    }

    @Override
    public void createPower() {
        getAuto().setPower(150);
    }

    @Override
    public void createColor() {
        getAuto().setColor("Green");
    }


}
