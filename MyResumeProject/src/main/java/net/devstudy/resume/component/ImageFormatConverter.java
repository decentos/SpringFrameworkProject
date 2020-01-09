package net.devstudy.resume.component;

import java.io.IOException;
import java.nio.file.Path;

import javax.annotation.Nonnull;

public interface ImageFormatConverter {

	void convert(@Nonnull Path sourceImageFile, @Nonnull Path destImageFile) throws IOException;
}
