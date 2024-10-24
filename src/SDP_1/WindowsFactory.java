package SDP_1;

public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Window createWindow() {
        return new WindowsWindow();
    }
}

// Concrete Factory for Mac
public class MacFactory implements GUIFactory {

    public Button createButton() {
        return new MacButton();
    }


    public Window createWindow() {
        return new MacWindow();
    }
}
