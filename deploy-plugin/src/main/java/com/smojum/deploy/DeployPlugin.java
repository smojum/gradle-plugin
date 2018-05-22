package com.smojum.deploy;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DeployPlugin implements Plugin<Project> {
	@Override
	public void apply(Project project) {
		project.getTasks().create("deploy", Deploy.class, (task) -> {
			task.setMessage("Hello");
			task.setRecipient("Santanu");
		});
	}
}