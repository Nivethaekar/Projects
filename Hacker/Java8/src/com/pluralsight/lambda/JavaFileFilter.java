package com.pluralsight.lambda;

import java.io.File;
import java.io.FileFilter;

public class JavaFileFilter implements FileFilter{

	@Override
	public boolean accept(File file) {
		return false;
	}

}
