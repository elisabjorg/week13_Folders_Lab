package com.codeclan.folders.folders.projections;

import com.codeclan.folders.folders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedThings", types = Folder.class)
public interface EmbedThings {

    String getTitle();
}
