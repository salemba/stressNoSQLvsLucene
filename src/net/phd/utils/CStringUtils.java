package net.phd.utils;

public class CStringUtils {
	
	public static Boolean isEmpty(String s){
		if(s==null || s.trim().length()==0){
			return true;
		}
		return false;
	}

}
