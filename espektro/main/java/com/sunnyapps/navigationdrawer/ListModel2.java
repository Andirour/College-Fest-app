package com.sunnyapps.navigationdrawer;

/**
 * Created by Sourav on 3/1/2017.
 */

public class ListModel2 {
    private  int img_resource;
    private  String name,detl;

    public int getImg_resource() {
        return img_resource;
    }

    public void setImg_resource(int img_resource) {
        this.img_resource = img_resource;
    }

    public ListModel2(int img_resource, String name,String detl) {
        this.setImg_resource(img_resource);
        this.setName(name);
        this.setDetl(detl);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDetl() {
        return detl;
    }

    public void setDetl(String detl) {
        this.detl = detl;
    }
}
