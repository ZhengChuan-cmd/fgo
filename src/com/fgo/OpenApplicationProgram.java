package com.fgo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.fgo.util.SystemUtil;

public  class OpenApplicationProgram implements SystemUtil{
	
	
	@Override
	public void open(String fileName) {
		try {
			File dir=new File(fileName);
			Desktop.getDesktop().open(dir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
