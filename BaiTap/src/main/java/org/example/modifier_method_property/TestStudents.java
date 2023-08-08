package org.example.modifier_method_property;

public class TestStudents {
    public static void main(String[] args) {
        Students std = new Students();
        String name = std.setName("Doan");
        System.out.println(name);
        String classes = std.setClasses("C0623");
        System.out.println(classes);
    }
}
