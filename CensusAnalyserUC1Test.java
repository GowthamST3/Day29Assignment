package com.BridgeLabz_Day29Assignment;

import org.junit.Test;

import junit.framework.Assert;



public class CensusAnalyserUC1Test {
	private static final String INDIA_CENSUS_CSV_FILE_PATH = "";

	@Test
	public void givenIndianCensusCSVFileReturnsCorrectRecords() {
		try {
			CensusAnalyserUC1 censusAnalyser = new CensusAnalyserUC1();
			int numOfRecords = censusAnalyser.loadIndiaCensusData("");
			Assert.assertEquals(29, numOfRecords);
		} catch (CensusAnalyserException e) {}
	}

}
