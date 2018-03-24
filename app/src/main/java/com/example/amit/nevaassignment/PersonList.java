package com.example.amit.nevaassignment;

/**
 * Created by EKENE on 7/23/2017.
 */

public class PersonList {

    private String name;
    private String image;
    private String skills;

    /*
        public String getLogin() {
            return login;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public String getHtml_url() {
            return html_url;
        }
    */
    public PersonList(String name, String skills, String image) {
        this.name = name;
        this.image = image;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getSkills() {
        return skills;
    }
}
