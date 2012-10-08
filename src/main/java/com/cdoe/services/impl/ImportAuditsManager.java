
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.IImportAuditsManager;
import com.cdoe.biz.IImportAuditsDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.AuditEqualForm;

public class ImportAuditsManager extends BaseManager implements IImportAuditsManager {

	private static final Logger logger = Logger.getLogger(ImportAuditsManager.class);
	
	private IImportAuditsDAO importAuditsDAO;
	
	public void saveOrUpdate(AuditEqualForm form) {
		long id = form.getId();
		AuditEqual obj = findById(AuditEqual.class, id); 
		if (obj == null) {
			obj = new AuditEqual();
		}
		obj.setDistrictNumber(form.getDistrictNumber());
		obj.setDateChanged(form.getDateChanged());
		obj.setChangeType(form.getChangeType());
	/*	obj.setAdjFpc(form.getAdjFpc());
		obj.setPreschool(form.getPreschool());
		obj.setSpecedEnroll(form.getSpecedEnroll());
		obj.setFpc(form.getFpc());
		obj.setAssessedVal(form.getAssessedVal());
		obj.setCatTrans(form.getCatTrans());
		obj.setCatVoced(form.getCatVoced());
		obj.setCatElpa(form.getCatElpa());
		obj.setCatSpedDis(form.getCatSpedDis());
		obj.setCatSpedGt(form.getCatSpedGt());
		obj.setSizeAdjust(form.getSizeAdjust());
		obj.setColAdjust(form.getColAdjust());
		obj.setPersCostFactor(form.getPersCostFactor());
		obj.setTotProg(form.getTotProg());
		obj.setFreeLunch18(form.getFreeLunch18());
		obj.setFreeLunchK12(form.getFreeLunchK12());
		obj.setMember18(form.getMember18());
		obj.setTotProgAtRisk(form.getTotProgAtRisk());
		obj.setGrandTotProg(form.getGrandTotProg());
		obj.setSpecOwnTax(form.getSpecOwnTax());
		obj.setMillLevyCalc(form.getMillLevyCalc());
		obj.setPropertyTax(form.getPropertyTax());
		obj.setStateEqual(form.getStateEqual());
		obj.setMillLevyCert(form.getMillLevyCert());
		obj.setMillLevyAdj(form.getMillLevyAdj());
		obj.setMonthEntitle(form.getMonthEntitle());
		obj.setYtdEntitle(form.getYtdEntitle());
		obj.setMonthPayment(form.getMonthPayment());
		obj.setYtdPayment(form.getYtdPayment());
		obj.setPropTxCfY0(form.getPropTxCfY0());
		obj.setAdjY0Oods(form.getAdjY0Oods());
		obj.setYtdY0Oods(form.getYtdY0Oods());
		obj.setAdjY0Other(form.getAdjY0Other());
		obj.setYtdY0Other(form.getYtdY0Other());
		obj.setAdjY0Swap(form.getAdjY0Swap());
		obj.setYtdY0Swap(form.getYtdY0Swap());
		obj.setAllowSpend(form.getAllowSpend());
		obj.setOverLevyCalc(form.getOverLevyCalc());
		obj.setHhLevyCalc(form.getHhLevyCalc());
		obj.setCatLevyAdj(form.getCatLevyAdj());
		obj.setCatLevyCert(form.getCatLevyCert());
		obj.setCatLevyCalc(form.getCatLevyCalc());
		obj.setPropTaxCfCap(form.getPropTaxCfCap());
		obj.setTotProgTabor(form.getTotProgTabor());
		obj.setTotForm2(form.getTotForm2());
		obj.setTotMax6(form.getTotMax6());
		obj.setTotAddFund(form.getTotAddFund());
		obj.setOctY1Mem(form.getOctY1Mem());
		obj.setTotAtRiskAr6(form.getTotAtRiskAr6());
		obj.setFmPupFundPp7(form.getFmPupFundPp7());
		obj.setFmAtRiskAr20(form.getFmAtRiskAr20());
		obj.setVoteLevyCalc(form.getVoteLevyCalc());
		obj.setOthCdeAdj(form.getOthCdeAdj());
		obj.setVoterOverride(form.getVoterOverride());
		obj.setFundedCntY1(form.getFundedCntY1());
		obj.setFundedCntY2(form.getFundedCntY2());
		obj.setFundedCntY3(form.getFundedCntY3());
		obj.setMinFormulaFund(form.getMinFormulaFund());
		obj.setTotAddFundV63(form.getTotAddFundV63());
		obj.setAdjTotFundGt3(form.getAdjTotFundGt3());
		obj.setAdjStateAssess(form.getAdjStateAssess());
		obj.setFundedCntY0(form.getFundedCntY0());
		obj.setChrtrSchlCnt(form.getChrtrSchlCnt());
		obj.setSmlCntrPymnts(form.getSmlCntrPymnts());
		obj.setMinSizeAdjust(form.getMinSizeAdjust());
		obj.setEslCsap(form.getEslCsap());
		obj.setOnLineCntY0(form.getOnLineCntY0());
		obj.setOnLineCntY1(form.getOnLineCntY1());
		obj.setPreschool5(form.getPreschool5());
		obj.setAdjY0ChrtrDbt(form.getAdjY0ChrtrDbt());
		obj.setYtdY0ChrtrDbt(form.getYtdY0ChrtrDbt());
		obj.setCsiY0Share(form.getCsiY0Share());
		obj.setYtdY0CdeAdj(form.getYtdY0CdeAdj());
		obj.setPropertyTaxY1(form.getPropertyTaxY1());
		obj.setMillLevyY1(form.getMillLevyY1());
		obj.setFundedCntY4(form.getFundedCntY4());
		obj.setSbsf(form.getSbsf());
		obj.setSbsfCatBuyout(form.getSbsfCatBuyout());
		obj.setDistChrtrCntY1(form.getDistChrtrCntY1());
		obj.setDistChrtrCntY2(form.getDistChrtrCntY2());
		obj.setDistChrtrCntY3(form.getDistChrtrCntY3());
		obj.setDistChrtrCntY4(form.getDistChrtrCntY4());
		obj.setAdjY0Audit(form.getAdjY0Audit());
		obj.setYtdY0Audit(form.getYtdY0Audit());
		obj.setFiscalYear(form.getFiscalYear());*/
		saveOrUpdate(obj);
	}
	
	public AuditEqualForm setupForm() {
		AuditEqualForm form = new AuditEqualForm();
		return form;
	}
	
	public AuditEqualForm setupForm(long id) {
		AuditEqual obj = findById(AuditEqual.class, id); 
		
		AuditEqualForm form = new AuditEqualForm();
		/* form.setId(obj.getId());
		form.setDistrictNumber(obj.getDistrictNumber());
		form.setDateChanged(obj.getDateChanged());
		form.setChangeType(obj.getChangeType());
		form.setAdjFpc(obj.getAdjFpc());
		form.setPreschool(obj.getPreschool());
		form.setSpecedEnroll(obj.getSpecedEnroll());
		form.setFpc(obj.getFpc());
		form.setAssessedVal(obj.getAssessedVal());
		form.setCatTrans(obj.getCatTrans());
		form.setCatVoced(obj.getCatVoced());
		form.setCatElpa(obj.getCatElpa());
		form.setCatSpedDis(obj.getCatSpedDis());
		form.setCatSpedGt(obj.getCatSpedGt());
		form.setSizeAdjust(obj.getSizeAdjust());
		form.setColAdjust(obj.getColAdjust());
		form.setPersCostFactor(obj.getPersCostFactor());
		form.setTotProg(obj.getTotProg());
		form.setFreeLunch18(obj.getFreeLunch18());
		form.setFreeLunchK12(obj.getFreeLunchK12());
		form.setMember18(obj.getMember18());
		form.setTotProgAtRisk(obj.getTotProgAtRisk());
		form.setGrandTotProg(obj.getGrandTotProg());
		form.setSpecOwnTax(obj.getSpecOwnTax());
		form.setMillLevyCalc(obj.getMillLevyCalc());
		form.setPropertyTax(obj.getPropertyTax());
		form.setStateEqual(obj.getStateEqual());
		form.setMillLevyCert(obj.getMillLevyCert());
		form.setMillLevyAdj(obj.getMillLevyAdj());
		form.setMonthEntitle(obj.getMonthEntitle());
		form.setYtdEntitle(obj.getYtdEntitle());
		form.setMonthPayment(obj.getMonthPayment());
		form.setYtdPayment(obj.getYtdPayment());
		form.setPropTxCfY0(obj.getPropTxCfY0());
		form.setAdjY0Oods(obj.getAdjY0Oods());
		form.setYtdY0Oods(obj.getYtdY0Oods());
		form.setAdjY0Other(obj.getAdjY0Other());
		form.setYtdY0Other(obj.getYtdY0Other());
		form.setAdjY0Swap(obj.getAdjY0Swap());
		form.setYtdY0Swap(obj.getYtdY0Swap());
		form.setAllowSpend(obj.getAllowSpend());
		form.setOverLevyCalc(obj.getOverLevyCalc());
		form.setHhLevyCalc(obj.getHhLevyCalc());
		form.setCatLevyAdj(obj.getCatLevyAdj());
		form.setCatLevyCert(obj.getCatLevyCert());
		form.setCatLevyCalc(obj.getCatLevyCalc());
		form.setPropTaxCfCap(obj.getPropTaxCfCap());
		form.setTotProgTabor(obj.getTotProgTabor());
		form.setTotForm2(obj.getTotForm2());
		form.setTotMax6(obj.getTotMax6());
		form.setTotAddFund(obj.getTotAddFund());
		form.setOctY1Mem(obj.getOctY1Mem());
		form.setTotAtRiskAr6(obj.getTotAtRiskAr6());
		form.setFmPupFundPp7(obj.getFmPupFundPp7());
		form.setFmAtRiskAr20(obj.getFmAtRiskAr20());
		form.setVoteLevyCalc(obj.getVoteLevyCalc());
		form.setOthCdeAdj(obj.getOthCdeAdj());
		form.setVoterOverride(obj.getVoterOverride());
		form.setFundedCntY1(obj.getFundedCntY1());
		form.setFundedCntY2(obj.getFundedCntY2());
		form.setFundedCntY3(obj.getFundedCntY3());
		form.setMinFormulaFund(obj.getMinFormulaFund());
		form.setTotAddFundV63(obj.getTotAddFundV63());
		form.setAdjTotFundGt3(obj.getAdjTotFundGt3());
		form.setAdjStateAssess(obj.getAdjStateAssess());
		form.setFundedCntY0(obj.getFundedCntY0());
		form.setChrtrSchlCnt(obj.getChrtrSchlCnt());
		form.setSmlCntrPymnts(obj.getSmlCntrPymnts());
		form.setMinSizeAdjust(obj.getMinSizeAdjust());
		form.setEslCsap(obj.getEslCsap());
		form.setOnLineCntY0(obj.getOnLineCntY0());
		form.setOnLineCntY1(obj.getOnLineCntY1());
		form.setPreschool5(obj.getPreschool5());
		form.setAdjY0ChrtrDbt(obj.getAdjY0ChrtrDbt());
		form.setYtdY0ChrtrDbt(obj.getYtdY0ChrtrDbt());
		form.setCsiY0Share(obj.getCsiY0Share());
		form.setYtdY0CdeAdj(obj.getYtdY0CdeAdj());
		form.setPropertyTaxY1(obj.getPropertyTaxY1());
		form.setMillLevyY1(obj.getMillLevyY1());
		form.setFundedCntY4(obj.getFundedCntY4());
		form.setSbsf(obj.getSbsf());
		form.setSbsfCatBuyout(obj.getSbsfCatBuyout());
		form.setDistChrtrCntY1(obj.getDistChrtrCntY1());
		form.setDistChrtrCntY2(obj.getDistChrtrCntY2());
		form.setDistChrtrCntY3(obj.getDistChrtrCntY3());
		form.setDistChrtrCntY4(obj.getDistChrtrCntY4());
		form.setAdjY0Audit(obj.getAdjY0Audit());
		form.setYtdY0Audit(obj.getYtdY0Audit());
		form.setFiscalYear(obj.getFiscalYear());*/
		return form;
	}
	
	public void setImportAuditsDAO(IImportAuditsDAO importAuditsDAO) {
		this.importAuditsDAO = importAuditsDAO;
	}
	
}
