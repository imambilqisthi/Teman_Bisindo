package com.example.temanbisindo.Databases;

public class DataModel {
    String data;
    String id;
    String video;

    public DataModel() {

    }

    public DataModel(String data, String id, String video) {
        this.data = data;
        this.id = id;
        this.video = video;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data= data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}

