package com.ravi.firebaseone;

public class MyFitnessData
{

    private String exerName;
//    private String exerDuration;
    private Integer exerImage;


    public String getExerName() {
        return exerName;
    }

    public void setExerName(String exerName) {
        this.exerName = exerName;
    }

//    public String getExerDuration() {
//        return exerDuration;
//    }

//    public void setExerDuration(String exerDuration) {
//        this.exerDuration = exerDuration;
//    }

    public Integer getExerImage() {
        return exerImage;
    }

    public void setExerImage(Integer exerImage) {
        this.exerImage = exerImage;
    }

    public MyFitnessData(String exerName, Integer exerImage) {
        this.exerName = exerName;
//        this.exerDuration = exerDuration;
        this.exerImage = exerImage;

    }
}
