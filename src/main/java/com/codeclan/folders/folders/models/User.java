package com.codeclan.folders.folders.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private List<Folder> folders;

    public User(String name) {
        this.name = name;
    }

    public User() {

    }



}
