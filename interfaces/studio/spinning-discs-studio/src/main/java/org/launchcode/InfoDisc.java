package org.launchcode;

public class InfoDisc {

    double diameter;
    String discType;
    String format;
    String storageCapacity;
    String title;
    String rpm;
    boolean readyToUse = false;


    public InfoDisc(String title, String discType, double diameter, String format, String storageCapacity) {
        this.title = title;
        this.discType = discType;
        this.diameter = diameter;
        this.format = format;
        this.storageCapacity = storageCapacity;


    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public String getRpm() {
        return rpm;
    }

    void reformat(String newFormat) {
        setFormat(newFormat);
        System.out.println("Your disc has been reformatted to "+newFormat+".");
    }

//    void readData(data) {
//        System.out.println();
//    }
//    void exceedStorage();

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString()+"Disc with title of: " + title + newline +
                "is spinning within a rate of: " + rpm;
    }

}
