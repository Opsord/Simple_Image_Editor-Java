package org.example;

public class Pixel {

    private int PosX;

    private int PosY;

    private int Depth;

    private String PixelContent;

    public Pixel(int posX, int posY, int depth, String pixelContent) {
        PosX = posX;
        PosY = posY;
        Depth = depth;
        PixelContent = pixelContent;
    }

    public int getPosX() {
        return this.PosX;
    }

    public void setPosX(int posX) {
        this.PosX = posX;
    }

    public int getPosY() {
        return this.PosY;
    }

    public void setPosY(int posY) {
        this.PosY = posY;
    }

    public int getDepth() {
        return this.Depth;
    }

    public void setDepth(int depth) {
        this.Depth = depth;
    }

    public String getPixelContent() {
        return this.PixelContent;
    }

    public void setPixelContent(String pixelContent) {
        this.PixelContent = pixelContent;
    }

    //Verification BIT type
    public boolean isPixBIT(){
        if (getPixelContent() == "1" || getPixelContent() == "0") {
            return true;
        }
        return false;
    }

    //Verification RGB type
    public boolean isPixRGB(){
        //convert PixelContent to list
        String[] rgb = getPixelContent().split(",");
        //check if list is long 3 and each element is between 0 and 255
        if (rgb.length == 3 &&
                Integer.parseInt(rgb[0]) >= 0 &&
                Integer.parseInt(rgb[0]) <= 255 &&
                Integer.parseInt(rgb[1]) >= 0 &&
                Integer.parseInt(rgb[1]) <= 255 &&
                Integer.parseInt(rgb[2]) >= 0 &&
                Integer.parseInt(rgb[2]) <= 255) {
            return true;
        }
        return false;
    }

    //Verification Hexadecimal type
    public boolean isPixHEX() {
        String hex = getPixelContent();
        //check if string is a valid hex color
        if (hex.matches("^#([A-Fa-f0-9]{6})$")) {
            return true;
        }
        return false;
    }

    //Transform pixel to string
    @Override
    public String toString() {
        return "Pixel{" +
                "PosX=" + PosX +
                ", PosY=" + PosY +
                ", Depth=" + Depth +
                ", PixelContent='" + PixelContent + '\'' +
                '}';

    }
}