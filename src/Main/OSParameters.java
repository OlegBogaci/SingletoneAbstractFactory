package Main;
//Singletone + Abstract Factory patterns
public class OSParameters {
    private static OSParameters single_instance;

    public String OSType;

    private OSParameters(){
        OSType = System.getProperty("os.name");
        //System.getProperties().list(System.out);
    }

    public static OSParameters getInstance(){
        if (single_instance == null) {
            synchronized (OSParameters.class){
                if (single_instance==null){
                    single_instance = new OSParameters();
                }
            }
        }
        return single_instance;
    }
}
