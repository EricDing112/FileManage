package com.zilla.rename.clazz;

import java.io.File;

import com.zilla.rename.impl.DirFilter;

public class InputFolders {
	private String filePath;
	private static InputFolders instance = null;

	private InputFolders(String path) {
		this.filePath = path;
	}

	public static InputFolders getInstance(String filePath) {
		if (instance == null) {
			instance = new InputFolders(filePath);
		}
		return instance;
	}

	public File[] inputFiles(String regex) {

		File path = new File(filePath);
		File[] files;
		if (regex == null || regex.length() == 0) {
			files = path.listFiles();
		} else {
			files = path.listFiles(new DirFilter(filePath));
		}
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
		return files;
	}
}
