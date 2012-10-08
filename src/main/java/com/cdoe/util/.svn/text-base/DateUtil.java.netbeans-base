package com.cdoe.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	@SuppressWarnings("deprecation")
	public static String getFiscalYear() {
		DateUtil dateUtil = new DateUtil();
		String fiscalYear = "";
		Date currentDate = Calendar.getInstance().getTime();
		int month = currentDate.getMonth();

		int year = 1900;
		synchronized (dateUtil) {
			year += currentDate.getYear();

			if (month >= 6) {
				year += 1;

			}
		}
		int prevYear = year - 1;
		fiscalYear = new Integer(prevYear).toString()
				+ new Integer(year).toString();
		return fiscalYear;
	}
	
	public static String getFiscalYearFormattedShort() {
		String fiscalYear = getFiscalYear();
		return "FY " + fiscalYear.substring(0, 4) + " - " + fiscalYear.substring(4);
		
	}
	
	public static String getPrevFiscalYear(String fiscalYear) {
		if (fiscalYear == null)
			return null;
		int prevYear = Integer.parseInt(fiscalYear.substring(0, 4)) - 1;
		return   new Integer(prevYear).toString() + fiscalYear.substring(0,4) ;
	}	
	
	public static String getPrevFiscalYear() {
		String fiscalYear = getFiscalYear();
		return getPrevFiscalYear(fiscalYear);
		
	}
	
	public static String getFiscalYearFormattedLong() {
		String fiscalYear = getFiscalYear();
		return "July 1, " + fiscalYear.substring(0, 4) + " - June 30, " + fiscalYear.substring(4);
		
	}

	public static String getFormattedDate(String formatString) {
		Date date = new Date();
		DateFormat format2 = new SimpleDateFormat(formatString);
		return format2.format(date);
		
	}

	public static String getFormattedDate() {
		Date date = new Date();
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format1.format(date));
		DateFormat format2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
		return format2.format(date);

	}
	
	public static void main(final String[] args) {
		System.out.println(getPrevFiscalYear());
		String formattedDate = DateUtil.getFormattedDate("EEEE, MMMM dd, yyyy");
		System.out.println(formattedDate);
	}

}
