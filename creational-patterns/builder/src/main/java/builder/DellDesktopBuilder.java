package builder;

public class DellDesktopBuilder implements DesktopBuilder{
    private final Desktop.Builder builder = new Desktop.Builder();
    @Override
    public void buildMonitor() {
        builder.setMonitor("Dell Monitor");
    }

    @Override
    public void buildKeyBoard() {
        builder.setKeyboard("Dell KeyBoard");

    }

    @Override
    public void buildMouse() {
        builder.setMouse("Dell Mouse");

    }

    @Override
    public void buildSpeaker() {
        builder.setSpeaker("Dell Speaker");

    }

    @Override
    public void buildProcessor() {
        builder.setProcessor("Dell Processor");

    }

    @Override
    public void buildMotherboard() {
        builder.setMotherboard("Dell Motherboard");

    }

    @Override
    public Desktop getBuilder() {
        return builder.build();
    }
}
