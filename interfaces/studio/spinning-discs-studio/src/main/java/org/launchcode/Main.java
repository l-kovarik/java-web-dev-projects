package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD compactDisc = new CD("New CD", "compact disc", 5.5, "mp3", "500MB", 12);
        DVD movie = new DVD ("Video", "bluRay", 5.5, "MP4", "4G");
        // TODO: Call each CD and DVD method to verify that they work as expected.
    compactDisc.spin();
        System.out.println(compactDisc.readyToUse);

       compactDisc.readDisc();

    }
}