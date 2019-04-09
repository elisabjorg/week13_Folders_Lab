package com.codeclan.folders.folders.repository;

import com.codeclan.folders.folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository  extends JpaRepository<Folder, Long> {
}
