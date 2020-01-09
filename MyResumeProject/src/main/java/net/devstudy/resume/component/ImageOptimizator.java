package net.devstudy.resume.component;

import java.nio.file.Path;

import javax.annotation.Nonnull;

public interface ImageOptimizator {

	void optimize (@Nonnull Path image);
}
