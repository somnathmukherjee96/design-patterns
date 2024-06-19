package builder;

public class HpDesktopBuilder implements DesktopBuilder{
    private final Desktop.Builder builder = new Desktop.Builder();
    @Override
    public void buildMonitor() {
        builder.setMonitor("HP Monitor");
    }

    @Override
    public void buildKeyBoard() {
        builder.setKeyboard("HP KeyBoard");

    }

    @Override
    public void buildMouse() {
        builder.setMouse("HP Mouse");

    }

    @Override
    public void buildSpeaker() {
        builder.setSpeaker("HP Speaker");

    }

    @Override
    public void buildProcessor() {
        builder.setProcessor("HP Processor");

    }

    @Override
    public void buildMotherboard() {
        builder.setMotherboard("HP Motherboard");

    }

    @Override
    public Desktop getBuilder() {
        return builder.build();
    }
}
