package org.example;

import java.util.List;

public class Image implements ImageOperations {

    private int Largo;

    private int Alto;

    private List<Pixel> PixelList;

    //constructor
    public Image(int largo, int alto, List<Pixel> pixelList) {
        Largo = largo;
        Alto = alto;
        PixelList = pixelList;
    }

    //getters and setters
    public int getLargo() {
        return this.Largo;
    }

    public void setLargo(int largo) {
        this.Largo = largo;
    }

    public int getAlto() {
        return this.Alto;
    }

    public void setAlto(int alto) {
        this.Alto = alto;
    }

    public List<Pixel> getPixelList() {
        return this.PixelList;
    }

    public void setPixelList(List<Pixel> pixelList) {
        this.PixelList = pixelList;
    }

    //Verification BIT type
    @Override
    public boolean isBitMap (){
        PixelList.forEach(Pixel::isPixBIT);
        return true;
    }

    //Verification RGB type
    @Override
    public boolean isPixMap (){
        PixelList.forEach(Pixel::isPixRGB);
        return true;
    }

    //Verification HEX type
    @Override
    public boolean isHexMap (){
        PixelList.forEach(Pixel::isPixHEX);
        return true;
    }

    @Override
    public String toString() {
        return "Image{" +
                "Largo=" + Largo +
                ", Alto=" + Alto +
                ", PixelList=" + PixelList +
                '}';
    }
}
