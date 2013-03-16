package com.zilla.rename.clazz;

import java.io.File;

public class ChangeFileName {

	public void rename(File file) {
		String[] strArray = file.getName().split("\\+|\\[|\\.rar");
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].contains("NO") || strArray[i].contains("No")
					|| strArray[i].contains("no")) {
				file.renameTo(new File(file.getParent()+"/"+strArray[i]+".rar"));
			}
		}
	}
	
	public void copy(File origin,File target){
		
	}
}
