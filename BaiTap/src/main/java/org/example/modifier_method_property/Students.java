package org.example.modifier_method_property;

public class Students {
    private String name;
    private String classes;
    public Students(){
        name = "john";
        classes = "C02";
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String setClasses(String classes) {
        this.classes = classes;
        return this.classes;
    }
}
