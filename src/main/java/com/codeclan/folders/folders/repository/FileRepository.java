package com.codeclan.folders.folders.repository;

import com.codeclan.folders.folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface FileRepository extends JpaRepository<File, Long> {

}
