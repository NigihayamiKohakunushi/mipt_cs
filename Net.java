package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class Net {

	public String getListOfSpecies(String sp) throws ClientProtocolException,
			IOException {
		String url = new String(
				"http://www.kazusa.or.jp/codon/cgi-bin/spsearch.cgi?species="
						+ sp + "&c=s");
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		request.addHeader("User-Agent", "Apache-HttpClient/4.3.3 (java 1.5)");
		HttpResponse response;
		response = client.execute(request);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response
				.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		List<String> names = new ArrayList<String>();
		List<String> urls = new ArrayList<String>();
		final String patternRef = "<a href=\"/codon/cgi-bin/showcodon.cgi?species=";
		final String patternRefEnd = "\"";
		final String patternInf = "<i>";
		final String patternInfEnd = "</i>";
		int startIndex = 0;
		String lowerCaseResult = result.toString().toLowerCase();
		while (true) {
			int refIndex = lowerCaseResult.indexOf(patternRef, startIndex);
			if (refIndex == -1)
				break;
			refIndex += patternRef.length();
			int refEnd = lowerCaseResult.indexOf(patternRefEnd, refIndex);
			String index = result.substring(refIndex, refEnd);
			refIndex = lowerCaseResult.indexOf(patternInf, refEnd);
			refIndex += patternInf.length();
			refEnd = lowerCaseResult.indexOf(patternInfEnd, refIndex);
			String description = result.substring(refIndex, refEnd);
			names.add(description);
			urls.add(index);
			startIndex = refEnd;
		}
		String list = new String("");
		for (int i = 0; i < names.size(); i++) {
			list = list + names.get(i) + ", index = " + urls.get(i) + "\n";
		}
		return list;
	}

	public void getTable(String index) throws ClientProtocolException,
			IOException {
		String url = "http://www.kazusa.or.jp/codon/cgi-bin/showcodon.cgi?species="
				+ index;
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		request.addHeader("User-Agent", "Apache-HttpClient/4.3.3 (java 1.5)");
		HttpResponse response = client.execute(request);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response
				.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		final String beg = "<PRE>";
		final String end = "</PRE>";
		String res = result.substring(result.indexOf(beg) + 5,
				result.indexOf(end));
		System.out.println(res);
		String table = new String("");
		// for (int i = 1; i < 5; i = i + 1) {
		// table = table + "\n" + res.substring(i * 70 - 70, i * 70);
		// }
		for (int i = 1; i < 4; i = i + 1) {
			table = table + "\n" + res.substring(i * 18 - 18, i * 18 );
		}
		int i = 4;
		table = table + "\n" + res.substring(i * 18 - 18, i * 18 -2);
		for (i = 5; i < 8; i = i + 1) {
			table = table + "\n" + res.substring(i * 18 - 18 - 2, i * 18-2);
		}
		PrintWriter out = new PrintWriter(new File("file").getAbsoluteFile());
		try {
			out.print(table);
		} finally {
			out.close();
		}
		// return table;

	}
}
