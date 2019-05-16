package com.smojum.deploy;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.TaskAction;

import java.io.File;

public class Deploy extends DefaultTask {

	@InputDirectory
	File inputDir;
	@TaskAction
	void sayGreeting() {

		System.out.printf("%s, %s!\n", inputDir.getAbsoluteFile(), System.getProperty("profile"));
	}
}