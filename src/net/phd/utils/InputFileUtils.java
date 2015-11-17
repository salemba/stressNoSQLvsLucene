package net.phd.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * Utils for reading input files(delimited)
 * @author HF
 *
 */
public class InputFileUtils {
	public static final String inputFileEncoding = "Windows-1256";
	/**
	 * 
	 * @param filePath
	 * @return
	 */
	public static List<String> loadDelimitedFile(String filePath){
		List<String> rawLines= null;
		BufferedReader bfr = null;
		try{
			File f = new File(filePath);
			InputStreamReader opsr = new InputStreamReader(
					new FileInputStream(f), inputFileEncoding);
			bfr = new BufferedReader(opsr);
			String aLine = null;
			rawLines = new ArrayList<String>();
			aLine=bfr.readLine();
			while(aLine!= null){
				if(!CStringUtils.isEmpty(aLine)){
					rawLines.add(aLine);
				}
				aLine =bfr.readLine();
			}
			bfr.close();
			System.out.println("Loaded "+rawLines.size()+" lines from input file.");
		}catch(Exception e){
			try {
				bfr.close();
			} catch (IOException iex) {
				iex.printStackTrace();
			}
			System.out.println("loaded lines : " + rawLines.size());
			e.printStackTrace();
		}
		return rawLines;
	}

}
