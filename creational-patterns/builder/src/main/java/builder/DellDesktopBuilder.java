package builder;

public class DellDesktopBuilder implements DesktopBuilder{
    private final Desktop.Builder builder;

    public DellDesktopBuilder() {
        this.builder = new Desktop.Builder();
    }

    @Override
    public DesktopBuilder buildMonitor() {
        builder.setMonitor("Dell Monitor");
        return this;
    }

    @Override
    public DesktopBuilder buildKeyBoard() {
        builder.setKeyboard("Dell KeyBoard");
        return this;

    }

    @Override
    public DesktopBuilder buildMouse() {
        builder.setMouse("Dell Mouse");
        return this;

    }

    @Override
    public DesktopBuilder buildSpeaker() {
        builder.setSpeaker("Dell Speaker");
        return this;

    }

    @Override
    public DesktopBuilder buildProcessor() {
        builder.setProcessor("Dell Processor");
        return this;

    }

    @Override
    public DesktopBuilder buildMotherboard() {
        builder.setMotherboard("Dell Motherboard");
        return this;

    }

    @Override
    public Desktop build() {
        return builder.build();
    }
}
