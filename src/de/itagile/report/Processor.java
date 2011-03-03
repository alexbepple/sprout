package de.itagile.report;

import java.util.List;

public class Processor {

	public void process() {
		List<String> results = new Database().retrieveResults();
		for (String result : results) {
			process(result);
		}
	}

	private void process(String result) {
		// imagine this to be a very complex operation with many external dependencies
	}
}
