package com.cdoe.util;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateUtil {
	
	public static SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	
	/**
	 * Returns a list of month names for the entire year in either
	 * short or long format
	 * 
	 * @param shortMonths
	 * @return
	 */
	public static List<String> getFullMonthList(boolean shortMonths) {
		DateFormatSymbols dfs = DateFormatSymbols.getInstance();
		List<String> months = new ArrayList<String>();
		if (shortMonths)
			months.addAll(Arrays.asList(dfs.getShortMonths()));
		else
			months.addAll(Arrays.asList(dfs.getMonths()));
		// For some reason the methods put an empty string in the
		// list - strip it out here
		if (months.contains("")) {
			int index = months.indexOf("");
			months.remove(index);
		}
		return months;
	}
	
	/**
	 * Returns a list of years formatted "short" - like 2012 - ranging
	 * from the startYear for the number of years, including the startYear.
	 * Example - getShortYears(new Date(), 5); Would return 5 years
	 * starting from the current year - if the year is 2012, it would return
	 * 2012, 2013, 2014, 2015, 2016.
	 * 
	 * @param startYear
	 * @param numYears
	 * @return
	 */
	public static List<String> getShortYears(Date startYear, int numYears) {
		List<String> years = new ArrayList<String>();
		Calendar cal = GregorianCalendar.getInstance();
		cal.setTime(startYear);
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		for (int i=1; i<=numYears; i++) {
			String year = format.format(cal.getTime());
			years.add(year);
			cal.roll(Calendar.YEAR, true);
		}
		return years;
	}
	
	/**
	 * Convenience method wrapper around getShortFiscalYears to take the start year
	 * in as a string - it returns null if the year isn't in the format
	 * of YYYY (4 digit year).
	 * 
	 * @param startYear
	 * @param numYears
	 * @return
	 */
	public static List<String> getShortYears(String startYear, int numYears) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		Date initYear;
		try {
			initYear = format.parse(startYear);
		} catch (ParseException e) {
			// Just return null
			return null;
		}
		return getShortYears(initYear, numYears);
	}
	
	/**
	 * Returns the current fiscal year as a 4 digit year
	 * @return
	 */
	public static String getCurrentFiscalYearShort() {
		String schoolYear = getCurrentFiscalYear();
		return schoolYear.substring(4);
	}
	
	/**
	 * Returns the current fiscal year based on the current date
	 * @return
	 */
	public static String getCurrentFiscalYear() {
		String schoolYear = null;
		// What is today?
		Date today = new Date();
		// Fiscal year end is 6/30
		Calendar fiscalYearEnd = GregorianCalendar.getInstance();
		fiscalYearEnd.set(Calendar.MONTH, Calendar.JUNE);
		fiscalYearEnd.set(Calendar.DAY_OF_MONTH, 30);
		String thisYear = yearFormat.format(today);
		if (today.before(fiscalYearEnd.getTime())) {
			// School year is year before this and this year
			fiscalYearEnd.roll(Calendar.YEAR, false);
			String prevYear = yearFormat.format(fiscalYearEnd.getTime());
			schoolYear = prevYear + thisYear;
		} else {
			// School year is year after this and this year
			fiscalYearEnd.roll(Calendar.YEAR, true);
			String nextYear = yearFormat.format(fiscalYearEnd.getTime());
			schoolYear = thisYear + nextYear;
		}
		return schoolYear;
	}
	
	/**
	 * Returns a list of strings in the format "20112012" starting
	 * from the starting fiscal year which should be in the same format, and
	 * for the number of years specified.
	 * 
	 * @param startYear
	 * @param numYears
	 * @return
	 */
	public static List<String> getLongFiscalYears(String startYear, int numYears) {
		List<String> years = new ArrayList<String>();
		years.add(startYear);
		String nextFiscalYear = startYear;
		for (int i=1; i< numYears; i++) {
			nextFiscalYear = getNextFiscalYear(nextFiscalYear);
			years.add(nextFiscalYear);
		}
		return years;
	}
	
	/**
	 * Returns a list of strings in the format "20112012" starting
	 * from the current fiscal year, for the number of years specified.
	 * 
	 * @param numYears
	 * @return
	 */
	public static List<String> getLongFiscalYears(int numYears) {
		return getLongFiscalYears(getCurrentFiscalYear(), numYears);
	}
	
	/**
	 * Returns the current fiscal year in long format '20112012'
	 * @return
	 */
	public static String getFiscalYear() {
		return getCurrentFiscalYear();
	}
	
	public static String getFiscalYearFormattedShort() {
		String fiscalYear = getFiscalYear();
		return "FY " + fiscalYear.substring(0, 4) + " - " + fiscalYear.substring(4);
		
	}
	
	/**
	 * Returns the previous school year in 20112012 format based on a
	 * string of the same format that is passed in
	 * @param fiscalYear
	 * @return
	 */
	public static String getPrevFiscalYear(String fiscalYear) {
		return rollFiscalYear(fiscalYear, false);
	}	
	
	/**
	 * Gets the previous fiscal year in 20112012 format based on
	 * the current fiscal year
	 * @return
	 */
	public static String getPrevFiscalYear() {
		String fiscalYear = getFiscalYear();
		return getPrevFiscalYear(fiscalYear);
		
	}
	
	/**
	 * Returns the next fiscal year in the format '20122013' based
	 * on the current fiscal year
	 * 
	 * @return
	 */
	public static String getNextFiscalYear() {
		return rollFiscalYear(getCurrentFiscalYear(), true);
	}
	
	/**
	 * Returns the next fiscal year in the format '20122013' based
	 * on the fiscal year that is passed in using that format
	 * 
	 * @param fiscalYear
	 * @return
	 */
	public static String getNextFiscalYear(String fiscalYear) {
		return rollFiscalYear(fiscalYear, true);
	}
	
	/**
	 * Rolls the fiscal year either up or down
	 * @param fiscalYear
	 * @param up
	 * @return
	 */
	private static String rollFiscalYear(String fiscalYear, boolean up) {
		if (fiscalYear == null)
			return null;
		Date firstYear = null;
		try {
			if (up)
				firstYear = yearFormat.parse(fiscalYear.substring(4));
			else
				firstYear = yearFormat.parse(fiscalYear.substring(0, 4));
		} catch (ParseException e) {
			// Just return null
			return null;
		}
		Calendar cal = GregorianCalendar.getInstance();
		cal.setTime(firstYear);
		cal.roll(Calendar.YEAR, up);
		if (up)
			return fiscalYear.substring(4) + yearFormat.format(cal.getTime());
		else
			return yearFormat.format(cal.getTime()) + fiscalYear.substring(0,4);
	}
	
	public static String getFiscalYearFormattedLong() {
		String fiscalYear = getFiscalYear();
		return "July 1, " + fiscalYear.substring(0, 4) + " - June 30, " + fiscalYear.substring(4);
		
	}

	public static String getFiscalYearFormattedLong(String fiscalYear) {
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
	
//	public static void main(final String[] args) {
//		System.out.println(getPrevFiscalYear());
//		String formattedDate = DateUtil.getFormattedDate("EEEE, MMMM dd, yyyy");
//		System.out.println(formattedDate);
//	}

}
