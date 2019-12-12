public class BridgeDemo { // Test the Remote

    public static void main(String[] args) {
        RemoteButton tvRemote = new TVRemoteMute(new TvDevice(1, 120));
        RemoteButton tvRemote2 = new TVRemotePause(new TvDevice(1, 150));

        System.out.println("Test TV with mute:");
        tvRemote.onBtn5Pressed();
        tvRemote.onBtn6Pressed();
        tvRemote.onBtn9Pressed();

        System.out.println("\nTest TV with pause:");
        tvRemote2.onBtn5Pressed();
        tvRemote2.onBtn6Pressed();
        tvRemote2.onBtn6Pressed();
        tvRemote2.onBtn9Pressed();
        tvRemote2.deviceFeedback();
    }
}
