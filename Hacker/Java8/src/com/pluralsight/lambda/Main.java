package com.pluralsight.lambda;

import java.io.File;
import java.io.FileFilter;

public class Main {
	
	public static void main(String[] args) {
		JavaFileFilter fileFilter = new JavaFileFilter();
		File file = new File("c:/tmp");
		File[] files = file.listFiles(fileFilter);
	}

}
