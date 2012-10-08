package com.cdoe.util;


import com.cdoe.biz.model.PaymentWorkSheet;
import com.cdoe.biz.model.PaymentWorkSheetCalculation;
import java.util.Iterator;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class PaymentWorksheetDatasource implements JRDataSource {
    public static final String DISTRICT_NAME = "districtName";
    public static final String DISTRICT_NUMBER = "districtNumber";
    public static final String DISTRICT_COUNTY = "districtCounty";
    public static final String FISCAL_YEAR = "fiscalYear";
    public static final String TITLE = "title";
    public static final String CALCULATION = "calculation";
    
    private PaymentWorkSheet paymnetWorkSheet;
    private Iterator<PaymentWorkSheetCalculation> iterator = null;
    private PaymentWorkSheetCalculation currentCalculation = null;

    /**
     * 
     * @param paymnetWorkSheet 
     */
    public PaymentWorksheetDatasource(PaymentWorkSheet paymnetWorkSheet) {
        this.paymnetWorkSheet = paymnetWorkSheet;
    }
    
    public boolean next() throws JRException {
        currentCalculation = null;
        
        if (iterator == null) {
          iterator = paymnetWorkSheet.getCalculations().iterator();   
        }
        
        return iterator.hasNext();
    }

    public Object getFieldValue(JRField jrf) throws JRException {
        if (jrf.getName().equals(DISTRICT_NAME)) {
         return paymnetWorkSheet.getDistrictName();  
        }
        else if (jrf.getName().equals(DISTRICT_NUMBER)) {
          return paymnetWorkSheet.getDistrictNumber();  
        }
        else if (jrf.getName().equals(DISTRICT_COUNTY)) {
          return paymnetWorkSheet.getCounty();  
        }
         else if (jrf.getName().equals(FISCAL_YEAR)) {
          return paymnetWorkSheet.getFiscalYear(); 
        }
          else if (jrf.getName().equals(TITLE)) {
           if (currentCalculation == null && iterator.hasNext()) {
            currentCalculation  = iterator.next();  
           }
           
          return currentCalculation != null ? currentCalculation.getTitle() : null;
        }
          else if (jrf.getName().equals(CALCULATION)) {
         if (currentCalculation == null && iterator.hasNext()) {
            currentCalculation  = iterator.next();  
           }
           
          return currentCalculation != null ? currentCalculation.getFormattedValue() : null;
        }
        
        return null;
    }

}
