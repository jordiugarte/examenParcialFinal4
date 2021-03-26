package devices;

public class FactoryDevices {

    public static final String ANDROID = "android";
    public static final String IOS = "ios";
    public static final String WINDOWS = "windows";

    public static IDevices make(String type) {
        IDevices devices;
        switch (type) {
            case ANDROID:
                return new Android();
            case IOS:
                return new IOS();
            case WINDOWS:
                return new WindowsPhone();
            default:
                return null;
        }
    }
}
