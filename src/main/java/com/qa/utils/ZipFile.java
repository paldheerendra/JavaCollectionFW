/**
 * 
 */
package com.qa.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class ZipFile {

	public void convertToZip(String fileName) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		ZipOutputStream zipOut = null;

		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream(System.getProperty("user.dir") + "/testing.zip");

			zipOut = new ZipOutputStream(new BufferedOutputStream(fos));

			ZipEntry ze = new ZipEntry(fileName);

			System.out.println("Zipping the file: " + fileName);

			zipOut.putNextEntry(ze);
			byte[] tmp = new byte[4 * 1024];
			int size = 0;
			while ((size = fis.read(tmp)) != -1) {
				zipOut.write(tmp, 0, size);
			}
			zipOut.flush();
			zipOut.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static File createNewFile() {
		File file = new File("tests.docx");

		try {
			if (file.createNewFile()) {
				System.out.println("New file is created........" + file.getName());
			} else
				System.out.println("File is already exist..." + file.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	public static void main(String[] args) {

		ZipFile obj = new ZipFile();

		// obj.convertToZip(System.getProperty("user.dir")+ "/test.txt");

		obj.convertToZip(createNewFile().getName());

	}

}
