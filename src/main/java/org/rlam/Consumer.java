package org.rlam;

public class Consumer {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Consumer() {

    }

    public Consumer(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
