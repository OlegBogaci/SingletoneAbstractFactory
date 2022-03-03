package Main;

public class Application {
    private final UIFactory factory;
    private Window win;
    private Text text;

    Application(UIFactory factory){
        this.factory=factory;
    }
    void createUI(){
        win=factory.createWindow();
        win.showWindow();
    }
    void addText(){
        text=factory.createText();
        win.addText(text.getText());
    }
}
