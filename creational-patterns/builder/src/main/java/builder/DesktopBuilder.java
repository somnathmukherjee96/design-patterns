package builder;

public interface DesktopBuilder {
    void buildMonitor();
    void buildKeyBoard();
    void buildMouse();
    void buildSpeaker();
    void buildProcessor();
    void buildMotherboard();
    Desktop getBuilder();
}
