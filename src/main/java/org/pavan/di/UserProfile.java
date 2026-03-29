package org.pavan.di;

public class UserProfile {

    private int id;
    private String name;
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserProfile() {
        System.out.println("UserProfile{" + "id=" + id + ", name=" + name + ", email=" + email + '}');
    }
}
