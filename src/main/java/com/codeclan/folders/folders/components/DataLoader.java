package com.codeclan.folders.folders.components;

import com.codeclan.folders.folders.models.File;
import com.codeclan.folders.folders.models.Folder;
import com.codeclan.folders.folders.models.User;
import com.codeclan.folders.folders.repository.FileRepository;
import com.codeclan.folders.folders.repository.FolderRepository;
import com.codeclan.folders.folders.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args) {

        User user1 = new User("Elisa");
        userRepository.save(user1);

        User user2 = new User("Anna");
        userRepository.save(user2);

        Folder folder1 = new Folder("Stuff", user1);
        folderRepository.save(folder1);

        Folder importantFolder = new Folder("Imortant Folder", user2);
        folderRepository.save(importantFolder);

        File file1 = new File("Something", "txt", 25, folder1);
        fileRepository.save(file1);

        File file2 = new File("Something else", "txt", 25, importantFolder);
        fileRepository.save(file2);

    }

}
