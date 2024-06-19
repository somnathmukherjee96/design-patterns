package builder;

public class DesktopDirector {
    private final DesktopBuilder desktopBuilder;
    public DesktopDirector(DesktopBuilder desktopBuilder){
        this.desktopBuilder = desktopBuilder;
    }
    Desktop buildDesktop(){
        desktopBuilder.buildMonitor();
        desktopBuilder.buildMouse();
        desktopBuilder.buildKeyBoard();
        desktopBuilder.buildMotherboard();
        desktopBuilder.buildProcessor();
        desktopBuilder.buildSpeaker();
        return desktopBuilder.getBuilder();
    }
}
