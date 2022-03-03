package Main;

public class WinFactory implements UIFactory{
    @Override
    public Window createWindow() {
        return new WinWindow();
    }

    @Override
    public Text createText() {
        return new WinText();
    }
}
