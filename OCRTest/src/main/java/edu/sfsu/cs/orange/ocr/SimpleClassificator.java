package edu.sfsu.cs.orange.ocr;

public  class SimpleClassificator {

    public static int classify(int width, int height, int battery){
        if(width>height && battery>20){
            return 1;
        }
        return 0;
    }


}
