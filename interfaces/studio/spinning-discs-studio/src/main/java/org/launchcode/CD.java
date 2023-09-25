package org.launchcode;

public class CD extends InfoDisc implements DiscInterface {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    int numTracks;

    public CD(String title, String discType, double diameter, String format, String storageCapacity, int numTracks) {
        super(title, discType, diameter, format, storageCapacity);
        this.numTracks = numTracks;
        this.readyToUse = false;
    }

    @Override
    public void spin() {
        readyToSpin();
        System.out.println(title + " is spinning between " + rpm + "RPMs.");
    }

    @Override
    public void readyToSpin() {
        System.out.println(readyToUse);
    }

    @Override
    public void readDisc() {
        String newline = System.lineSeparator();
        System.out.println("Disc is readable "+newline+ title);

    }
}