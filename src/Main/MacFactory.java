package Main;

public class MacFactory implements UIFactory {
    @Override
    public Window createWindow() {
        return new MacWindow();
    }

    @Override
    public Text createText() {
        return new MacText();
    }
}
