package Main;

public class Main {
    public static void main(String[] args) {
        OSParameters  parameters = OSParameters.getInstance();


        if (parameters.OSType.equalsIgnoreCase("Windows 10")){
           UIFactory factory = new WinFactory();
            Application app = new Application(factory);
            app.createUI();
            app.addText();
        }
        else{
            UIFactory factory = new MacFactory();
            Application app = new Application(factory);
            app.createUI();
            app.addText();
        }

    }
}
