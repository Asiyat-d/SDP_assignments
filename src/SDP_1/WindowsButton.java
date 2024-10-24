package SDP_1;

interface Button{
    void paint();
interface Window{
    void render();
}
interface GUIFactory {
        Button createButton();
        Window createWindow();
}

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}


    public class WindowsWindow implements Window {
        @Override
        public void render() {
            System.out.println("Rendering a window in Windows style.");
        }
    }

    public class MacButton implements Button {
        @Override
        public void paint() {
            System.out.println("Rendering a button in Mac style.");
        }
    }


    public class MacWindow implements Window {
        @Override
        public void render() {
            System.out.println("Rendering a window in Mac style.");
        }
    }
}


