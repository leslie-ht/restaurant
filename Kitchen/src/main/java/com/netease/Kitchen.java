package com.netease;
/*
 * author: leslie
 * date: 3 May 2016
 */
public class Kitchen{
	public static String makeNoodles(String vegetable){
		if(vegetable == null){
			vegetable = "Tomato";
		}

		StringBuffer s = new StringBuffer();
		s.append("<html><body>\n")
			.append("<h1>Noodles with ")
			.append(vegetable)
			.append("</h1>\n")
			.append("</body></html>");
		return s.toString();
	}
}