package ru.kvaga.jmeter.utils.text;
import org.apache.commons.lang3.StringEscapeUtils;

public class UnicodeEscape {
	        
	        public String unescapeJSON(String escapedJSON) {
			                return StringEscapeUtils.unescapeJson(escapedJSON);
					        }
		        
		        public static void main(String[] args) {
				                String str = "\\u0412\\u0440\\u0430\\u0447-\\u043e\\u0444\\u0442\\u0430\\u043b\\u044c\\u043c\\u043e\\u043b\\u043e\\u0433\", \"doctorFio\": \"\\u0427\\u0435\\u0440\\u0435\\u0434\\u043d\\u0438\\u0447\\u0435\\u043d\\u043a\\u043e \\u041e\\u043b\\u044c\\u0433\\u0430 \\u0413\\u0435\\u043d\\u043d\\u0430\\u0434\\u0438\\u0435\\u0432\\u043d\\u0430";
						                UnicodeEscape ue = new UnicodeEscape();
								                System.out.println(ue.unescapeJSON(str));
										                
										        }

}

