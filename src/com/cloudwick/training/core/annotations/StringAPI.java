package com.cloudwick.training.core.annotations;

public class StringAPI {

	public static void main(String[] args) {
		String data="11,CA,fn,ln,91992,CA";
		
		System.out.println(data.toUpperCase());
		
		System.out.println(data.replace("CA", "TX"));
		
		char c [] = data.toCharArray();
		
		for (char chr : c){
			System.out.println(chr);	
		}
		
		byte[] bytes = data.getBytes();{
			System.out.println(bytes);	
		}
		
		System.out.println(data.lastIndexOf("CA"));
		
		String myData[] = data.split(",");
		
		System.out.println(myData[2]+" "+myData[3]);
		
	}

}
