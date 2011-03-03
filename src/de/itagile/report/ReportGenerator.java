package de.itagile.report;

import java.util.List;

public class ReportGenerator {

	public String generate() {
		Database database = new Database();
		List<String> results = database.retrieveResults(); 
		StringBuilder page = new StringBuilder();
		page.append("<html><head><title>Report</title></head><body><table>");
		
		for (String result : results) {
			// imagine some very complex processing here
			String calculated_value = result + "foo";
			page.append(String.format("<tr><td>%s</td><td>%s</td></tr>", calculated_value, result));
		}
		
		page.append("</table></body></html>");
		return page.toString();
	}
}
