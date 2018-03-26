package com.example.amit.nevaassignment;

public class PersonList {
    private String name;
    private String image;
    private String skills;

    public PersonList(String name, String skills, String image) {
        this.name = name;
        this.image = image;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

}
