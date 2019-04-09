package com.codeclan.folders.folders.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private List<Folder> folders;

    public User(String name) {
        this.name = name;
        this.folders = new ArrayList<Folder>();
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public List<Folder> getFolder() {
        return this.folders;
    }

    public void setFolders(List<Folder> folders){
        this.folders = folders;
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }




}
