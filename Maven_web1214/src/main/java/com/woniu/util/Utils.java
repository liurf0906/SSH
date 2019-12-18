package com.woniu.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class Utils {
	public static String upload(File photo,String photoFileName){
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		File dir = new File(path);
		if(!dir.exists()){
			dir.mkdirs();
		}
		String suffix = photoFileName.substring(photoFileName.lastIndexOf("."));
		String fileName = UUID.randomUUID()+suffix;
		try {
			FileUtils.copyFile(photo, new File(dir,fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileName;
	}
}
