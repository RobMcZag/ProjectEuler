package com.rzagni.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.HashMap;

public class ReadAndSortFile {

	
	public static <K> void main(String[] args) {
		String pathname = "/Users/Roberto/git/ProjectEuler/file1.txt";
		File f = new File(pathname);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		if ( f.canRead() ) {
			try {
				Reader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line = null;
				while ((line = br.readLine()) != null ) {
					addWords(map, line.split(" "));
				}
			} catch (FileNotFoundException e) {
				System.out.format("File not found: %s%n", f);
				e.printStackTrace();
			} catch (IOException e) {
				System.out.format("Generic IOException: %s%n", f);
				e.printStackTrace();
			}
		}
		System.out.format("Map keyset: %s%n", map.keySet());
		Object[] distinctWords = map.keySet().toArray();
		Arrays.sort(distinctWords);
		for (int i = 0; i < distinctWords.length; i++) {
			String word = (String) distinctWords[i];
			System.out.format("Word <%s> count is %s%n", word, map.get(word));
		}
	}

	private static void addWords(HashMap<String, Integer> map, String[] words) {
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			} else {
				map.put(word, 1);
			}
		}
		
	}

}
