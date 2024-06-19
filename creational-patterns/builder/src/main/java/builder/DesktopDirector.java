package builder;

public class DesktopDirector {
    private final DesktopBuilder desktopBuilder;
    public DesktopDirector(DesktopBuilder desktopBuilder){
        this.desktopBuilder = desktopBuilder;
    }
    Desktop buildDesktop(){
        return desktopBuilder
                .buildMonitor()
                .buildMouse()
                .buildKeyBoard()
                .buildMotherboard()
                .buildProcessor()
                .buildSpeaker()
                .build();
    }
}
