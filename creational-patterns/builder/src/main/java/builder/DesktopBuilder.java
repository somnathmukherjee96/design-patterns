package builder;

public interface DesktopBuilder {
    DesktopBuilder buildMonitor();
    DesktopBuilder buildKeyBoard();
    DesktopBuilder buildMouse();
    DesktopBuilder buildSpeaker();
    DesktopBuilder buildProcessor();
    DesktopBuilder buildMotherboard();
    Desktop build();
}
