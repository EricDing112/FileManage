package com.zilla.rename.main;

import java.io.File;

import com.zilla.rename.clazz.ChangeFileName;
import com.zilla.rename.clazz.InputFolders;

public class RenameTool {
	public static void main(String[] args) {
		String regex = null;
		File[] files;
		if (args.length != 0) {
			regex = args[0];
		}
		String filePath = "D:\\TDDOWNLOAD\\新建文件夹\\";
		InputFolders folders = InputFolders.getInstance(filePath);
		try {
			files = folders.inputFiles(regex);
			ChangeFileName changeFileName = new ChangeFileName();
			for (File file : files) {
				changeFileName.rename(file);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
