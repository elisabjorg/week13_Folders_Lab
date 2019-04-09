package com.codeclan.folders.folders.models;

import java.util.ArrayList;

public class File {

    private Long id;
    private String name;
    private String extension;
    private int size;
    private Folder folder;

    public File(String name, String extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = new ArrayList<>();
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String newExtension) {
        this.extension = newExtension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
