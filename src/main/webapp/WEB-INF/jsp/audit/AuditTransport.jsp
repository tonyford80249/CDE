
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
<%@ page language="java" %>
<%@ page import="com.cdoe.ui.*" %>
<%@ page import="com.cdoe.biz.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<form>

  <!-- Main outer table -->
  <TABLE CLASS="ContentTable">
    <TR>
      <TD>
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.publicSchoolTransportationFundReimbursementClaimStaticText" />
            </TD>
            <TD>
              <span>
              </span>
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="AuditTransport.StaticText.districtNameAndNumberStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="districtNameAndNumberTextbox" id="" />
            </TD>
          </TR>
          <TR>
            <TD COLSPAN="2">
              <fmt:message key="AuditTransport.StaticText.reimbursementInformationStaticText" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.$1aTotalCurrentOperatingExpendituresForPupilTransportationStaticText" />
            </TD>
            <TD>
              <input  path="textbox1828Textbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.bOtherTransportationRevenueStaticText" />
            </TD>
            <TD>
              <input  path="textbox1830Textbox" id="" />
            </TD>
          </TR>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.cNetCurrentOperatingExpendituresLine1aMinusLine1bStaticText" />
            </TD>
            <TD>
              <input  path="textbox1832Textbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.$2MileageTraveledForTransportingMigrantEducationPupilsStaticText" />
            </TD>
            <TD>
              <input  path="textbox1834Textbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="AuditTransport.StaticText.$3MileageScheduledForRegularPupilTransportationOnTheMileageCountDateStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="$3MileageScheduledForRegularPupilTransportationOnTheMileageCountDateTextbox" id="" />
            </TD>
          </TR>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.$4DaysSchoolWasInSessionAndPupilsWereTransportedInTheSchoolTermStaticText" />
            </TD>
            <TD>
              <input  path="textbox1838Textbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="AuditTransport.StaticText.$5NumberOfDaysForWhichRoomAndBoardWasPaidForPupilsInLieuOfTransportationStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="$5NumberOfDaysForWhichRoomAndBoardWasPaidForPupilsInLieuOfTransportationTextbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.additionalInformationStaticText" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <LABEL FOR=""><fmt:message key="AuditTransport.StaticText.$6NumberOfPupilsScheduledToBeTransportedToAndFromPublicSchoolAtPublicStaticText" /></LABEL>
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.expenseOnTheMileageCountDateStaticText" />
            </TD>
            <TD>
              <input  path="$6NumberOfPupilsScheduledToBeTransportedToAndFromPublicSchoolAtPublicTextbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="AuditTransport.StaticText.$7TotalActualMilesTraveledForActivityTripsFieldTripsAthleticTripsEtcDuringEntitlementPeriodStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="$7TotalActualMilesTraveledForActivityTripsFieldTripsAthleticTripsEtcDuringEntitlementPeriodTextbox" id="" />
            </TD>
            <TD>
              <input  path="textbox1847Textbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="AuditTransport.StaticText.$8TotalActualMilesTraveledForAnyPurposeByPupilTransportationVehiclesDuringEntitlementPeriodStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="$8TotalActualMilesTraveledForAnyPurposeByPupilTransportationVehiclesDuringEntitlementPeriodTextbox" id="" />
            </TD>
            <TD>
              <input  path="textbox1850Textbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.$9FeesCollectedFromIndividualsForTransportingStudentsStaticText" />
            </TD>
            <TD>
              <input  path="$8TotalActualMilesTraveledForAnyPurposeByPupilTransportationVehiclesDuringEntitlementPeriodTextbox2" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.reimbursementEntitlementForLyStaticText" />
            </TD>
            <TD>
              <input  path="textbox1854Textbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="AuditTransport.StaticText.advanceReimbursementEntitlementForLyStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="advanceReimbursementEntitlementForLyTextbox" id="" />
            </TD>
          </TR>
          <TR>
            <TD>
              <fmt:message key="AuditTransport.StaticText.capitalOutlayExclusionForIndContStaticText" />
            </TD>
            <TD>
              <input  path="textbox1858Textbox" id="" />
            </TD>
          </TR>
          <TR>
            <TD ALIGN="right">
              <LABEL FOR=""><fmt:message key="AuditTransport.StaticText.additionalReimbursementForDesegregationStaticText" /></LABEL>
            </TD>
            <TD>
              <input  path="additionalReimbursementForDesegregationTextbox" id="" />
            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="button" id="" value="Save Changes"/>
            </TD>
            <TD>
              <input type="button" id="" value="Print this page to Excel"/>
            </TD>
          </TR>
        </TABLE></TD>
    </TR>
  </TABLE>
</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/AuditTransport.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>