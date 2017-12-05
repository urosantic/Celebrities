package com.example.admin.celebrities;

import java.util.Arrays;

/**
 * Created by Admin on 12/4/2017.
 */

public class Celebrity {
    String name,age,gender;
    int id,favorite;
    byte[] image;

    public Celebrity(String name, String age, String gender, int id, int favorite, byte[] image) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.favorite = favorite;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Celebrity{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", favorite=" + favorite +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
