package com.sunnyapps.navigationdrawer;

public class ListModel {

    private  int img_resource;
    private  String name;

    public int getImg_resource() {
        return img_resource;
    }

    public void setImg_resource(int img_resource) {
        this.img_resource = img_resource;
    }

    public ListModel(int img_resource, String name) {
        this.setImg_resource(img_resource);
        this.setName(name);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}