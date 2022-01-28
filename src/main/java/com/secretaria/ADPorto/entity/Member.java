package com.secretaria.ADPorto.entity;


public class Member {

    private String Congregation;
    private String name;
    private String fatherName;
    private String motherName;

    public String getCongregation() {
        return Congregation;
    }

    public void setCongregation(String congregation) {
        Congregation = congregation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
}
