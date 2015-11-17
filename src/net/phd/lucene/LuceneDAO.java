package net.phd.lucene;

import java.io.BufferedReader;
import java.util.List;

import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;

import net.phd.utils.InputFileUtils;

/**
 * Benchmark for Lucene repository
 * @author Guest
 *
 */
public class LuceneDAO {
	/**
	 * Minimum number of fields in a line
	 */
	private final Integer  MIN_FIELDS_COUNT = 3;
	/**
	 * The fields separator in the input file "|"
	 */
	private final String FLD_SEPARATOR = "\\|";
	/**
	 * absolute path to index repository
	 */
	private final String INDEX_DIRECTORY= "D:\\fadoua\\idx\\";
	
	public void indexInputFileAsObjects(String inputFile){
		//start reading the input file. This step has been done separately to
		List<String> inputLines = InputFileUtils.loadDelimitedFile(inputFile);
		try {
			IndexWriter iw = new IndexWriter(new IndexWriterConfig)
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
