
<%--
(ref: jsp/jsp.jsp.et.jsp)
-------------------------------------
$Revision:   $
$Date:  $
$Author:   $
$Modtime: $

Version History:
-------------------------------------
$Log:$
--%>
<%@ page language="java"%>
<%@ page import="com.cdoe.ui.*"%>
<%@ page import="com.cdoe.biz.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<div id="mainContent">
	<h3>
		<fmt:message
			key="AddAdjustment.StaticText.aEnterUpdateAuditRepaymentAdjustmentStaticText" />
	</h3>
	<form>
		<!-- Main outer table -->
		<TABLE>
			<TR>
				<TD>
					<TABLE>
						<TR>
							<TD><fmt:message
									key="AddAdjustment.StaticText.allowsDistrictToPayBackAuditFindingByCdeWithholdingAnAdjustmentAmountFromTheirStateShareStaticText" />
							</TD>
						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.districtCodeNameStaticText" /></LABEL>
							</TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="districtCodeNameDropdownList" size="1" /></TD>
							<TD>District Name:</TD>
							<TD><input id="DistrictName" path="districtName" size="26"
								maxlength="26" />
							</TD>
						</TR>
						<TR>
							<TD><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.beginningFiscalYearStaticText" /></LABEL>
							</TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="beginningFiscalYearDropdownList" size="1" /></TD>
							<TD><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.endingFiscalYearStaticText" /></LABEL>
							</TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="endingFiscalYearDropdownList" size="1" /></TD>
						</TR>
						<TR>
							<TD ><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.beginningFiscalMonthStaticText" /></LABEL>
							</TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="beginningFiscalMonthDropdownList" size="1" /></TD>
							<TD ><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.endingFiscalMonthStaticText" /></LABEL>
							</TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="endingFiscalMonthDropdownList" size="1" /></TD>
						</TR>
						<TR>
							<TD><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.frequencyStaticText" /></LABEL></TD>
							<TD><select class="requiredControl" id=""
								list="{'Monthly', 'Quaterly', 'Yearly'}"
								path="frequencyDropdownList" size="1" /></TD>
						</TR>
						<TR>
							<TD><fmt:message
									key="AddAdjustment.StaticText.typeStaticText" /></TD>
							<TD>Audit</TD>
						</TR>
						<TR>
							<TD><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.amountStaticText" /></LABEL></TD>
							<TD><input cssClass="requiredControl" path="amountTextbox"
								id="" /></TD>
						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD><input type="submit" id=""
								value="<fmt:message key="AddAdjustment.Button.saveAdjustmentButton" />" />
							</TD>
							<TD><input type="submit" id=""
								value="<fmt:message key="AddAdjustment.Button.viewAdjustmentButton_2" />" />
							</TD>
							<TD><input type="reset" id=""
								value="<fmt:message key="AddAdjustment.Button.clearButton_2" />" />
							</TD>
						</TR>
					</TABLE>
				
					<h3><fmt:message
									key="AddAdjustment.StaticText.bEnterUpdateOtherStateShareAdjustmentsNonCdeAuditFindingsStaticText" /></h3>
				
					<TABLE>
						<TR>
							<TD ><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.districtCodeNameStaticText_2" /></LABEL>
							</TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="districtCodeNameDropdownList2" size="1" /></TD>
							<TD>District Name:</TD>
							<TD><input id="DistrictName" path="districtName" size="26"
								maxlength="26" />
							</TD>
						</TR>
						<TR>
							<TD ><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.fiscalYearStaticText" /></LABEL></TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="fiscalYearDropdownList" size="1" /></TD>
							<TD><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.adjustmentNotesIEReasonStaticText" /></LABEL>
							</TD>
						</TR>
						<TR>
							<TD ><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.monthStaticText" /></LABEL></TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="monthDropdownList" size="1" /></TD>
							<TD><textarea id="" path="adjustmentNotesIEReasonTextarea"
									cols="60" rows="6"></textarea></TD>
						</TR>
						<TR>
							<TD ><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.typeStaticText_2" /></LABEL></TD>
							<TD><select class="requiredControl" id="" list="{}"
								path="typeDropdownList" size="1" /></TD>
							<TD></TD>
						</TR>
						<TR>
							<TD ><LABEL FOR=""><fmt:message
										key="AddAdjustment.StaticText.amountStaticText_2" /></LABEL></TD>
							<TD><input cssClass="requiredControl" path="amountTextbox2"
								id="" /></TD>
							<TD></TD>
						</TR>
					</TABLE>
					<TABLE>
						<TR>
							<TD><input type="submit" id=""
								value="<fmt:message key="AddAdjustment.Button.saveAdjustmentButton_2" />" />
							</TD>
							<TD><input type="submit" id=""
								value="<fmt:message key="AddAdjustment.Button.viewAdjustmentButton" />" />
							</TD>
							<TD><input type="reset" id=""
								value="<fmt:message key="AddAdjustment.Button.clearButton" />" />
							</TD>
						</TR>
					</TABLE>
				</TD>
			</TR>
		</TABLE>
	</form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/AddAdjustment.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>