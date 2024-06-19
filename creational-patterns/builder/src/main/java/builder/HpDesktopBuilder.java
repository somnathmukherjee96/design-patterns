package builder;

public class HpDesktopBuilder implements DesktopBuilder{
    private final Desktop.Builder builder;

    public HpDesktopBuilder() {
        this.builder = new Desktop.Builder();
    }

    @Override
    public DesktopBuilder buildMonitor() {
        builder.setMonitor("HP Monitor");
        return this;
    }

    @Override
    public DesktopBuilder buildKeyBoard() {
        builder.setKeyboard("HP KeyBoard");
        return this;

    }

    @Override
    public DesktopBuilder buildMouse() {
        builder.setMouse("HP Mouse");
        return this;

    }

    @Override
    public DesktopBuilder buildSpeaker() {
        builder.setSpeaker("HP Speaker");
        return this;

    }

    @Override
    public DesktopBuilder buildProcessor() {
        builder.setProcessor("HP Processor");
        return this;

    }

    @Override
    public DesktopBuilder buildMotherboard() {
        builder.setMotherboard("HP Motherboard");
        return this;

    }

    @Override
    public Desktop build() {
        return builder.build();
    }
}
