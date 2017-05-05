package com.sunnyapps.navigationdrawer;

/**
 * Created by Sourav on 3/1/2017.
 */

public class ListModel3 {
    private  String name,name1,name2;



    public ListModel3(String name, String name1,String name2) {
        this.setName(name);
        this.setName1(name1);
        this.setName2(name2);


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}