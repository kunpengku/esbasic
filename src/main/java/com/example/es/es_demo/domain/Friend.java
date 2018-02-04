package com.example.es.es_demo.domain;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/2/4.
 *
 * @author fupeng.
 */
public class Friend {
    String name;
    String stage;
    String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Friend{" + "name='" + name + '\'' + ", stage='" + stage + '\'' + ", location='" + location + '\'' + '}';
    }
}
