package com.codeclan.folders.folders.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    public Long id;
    private String title;
    private List<File> files;
    private User user;

    public Folder(String title, User user) {
        this.title = title;
        this.files = new ArrayList<File>();
        this.user = user;
    }

    public Folder() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public List<File> getFiles() {
        return this.files;
    }

    public void setFiles(List<File> files){
        this.files = files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }


}
