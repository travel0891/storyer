package com.travel.storyer.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class httpHelper {

	public static String doGet(String validateUrl1, String validateUrl2, String url, String param) {
		String result = "";
		if (validateUrl1 == validateUrl2) {
			BufferedReader in = null;
			try {
				String urlNameString = url + "?" + param;
				URL realUrl = new URL(urlNameString);
				URLConnection connection = realUrl.openConnection();
				connection.setRequestProperty("accept", "*/*");
				connection.setRequestProperty("connection", "Keep-Alive");
				connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
				connection.connect();
				in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String line;
				while ((line = in.readLine()) != null) {
					result += line;
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				try {
					if (in != null) {
						in.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		return result;
	}
}
