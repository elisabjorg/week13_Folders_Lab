package com.codeclan.folders.folders;

import com.codeclan.folders.folders.models.Folder;
import com.codeclan.folders.folders.models.File;
import com.codeclan.folders.folders.models.User;
import com.codeclan.folders.folders.models.User;
import com.codeclan.folders.folders.repository.FileRepository;
import com.codeclan.folders.folders.repository.FolderRepository;
import com.codeclan.folders.folders.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.soap.SOAPBinding;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFolderAndUser() {
		User user = new User("Elisa");
		userRepository.save(user);

		Folder folder = new Folder("Stuff", user);
		folderRepository.save(folder);
	}

	@Test
	public void createFileAndFolder() {
		User user = new User("Elisa");
		userRepository.save(user);

		Folder folder = new Folder("Stuff", user);
		folderRepository.save(folder);

		File file = new File("Something", "txt", 25, folder);
		fileRepository.save(file);
	}

}
