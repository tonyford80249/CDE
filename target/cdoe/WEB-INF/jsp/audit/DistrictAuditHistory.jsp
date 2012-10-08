
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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- Wrap the entire JSP in a try/catch block so that runtime exceptions
    in the JSP can be caught and reported. --%>

<style>
.scrollableArea {
	/* width: 1230px;*/
	height: 420px;
	padding: 10px;
	border-style: solid;
	border-width: 1;
	overflow: auto;
}
</style>
<%@include file="/WEB-INF/jsp/JspTry.inc"%>
<form>


  <!-- Main outer table -->
  <h3>District Audit History</h3>
  <TABLE>
    <TR>
      <TD>
       
        <TABLE>
          <TR>
            <TD>
            Search District Number
            </TD>
            <TD>
              <!-- select  id=""
              	list="{}" 
              	path="searchDistrictNumberDropdownList" size="1"/-->
              	<select name="alert">
								<option> -- 1137 --</option>
				</select>

            </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD COLSPAN="4">
								<div id="auditTrackingGrid" align="center"
									style="border: 5px groove #ccc;">
									<table id="auditTrackingGrid" class="display">
										<thead>
											<tr>
												   <th width="6%">District Code</th>

													<th width="16%">District Name</th>

													<th width="4%">Status</th>

													<th width="6%">Status Date</th>

													<th width="16%">Lead Auditor</th>

													<th width="16%">Supp auditor</th>
													
													<th width="16%">Progress</th>

													<th width="6%">Audit Frequency</th>

													<th width="6%">Alert</th>
													<th width="6%">Most Recent FTE Year</th>

													<th width="16%">Liability</th>

											</tr>
										</thead>

										<tbody>

											<!-- c:forEach var="capitalOutlayGrid"
												items="${capitalOutlayForm.capitalOutlayGridList}"
												varStatus="idx"-->

												<tr>
													<td width="6%">1137</td>

													<td width="16%">Academy 20</td>

													<td width="4%">Open</td>

													<td width="6%">09/22/2012</td>

													<td width="16%">Scott Abbey</td>

													<td width="16%">Rebecca McRee</td>
													
													<td width="16%">Draft report Issued </td>

													<td width="6%">2 years</td>

													<td width="6%">Alert #1</td>
													<td width="6%">20112012</td>

													<td width="16%">23,214</td>
										
													
									</tr>
													<td width="6%">1247</td>

													<td width="16%">Academy 20</td>

													<td width="4%">ReOpen</td>

													<td width="6%">09/22/2012</td>

													<td width="16%">Jeff Hansen</td>

													<td width="16%">Rebecca Sony</td>
													
													<td width="16%">Draft report Issued </td>

													<td width="6%">2 years</td>

													<td width="6%">Alert #2</td>
													<td width="6%">20112012</td>

													<td width="16%">26,264</td>
										
													
									</tr>
									

								<!-- /c:forEach-->
							</tbody>
						</table>

              	<script type="text/javascript">
															<!--
																$(document)
																		.ready(
																				function() {
																					$(
																							"table#auditTrackingGrid")
																							.dataTable(
																									{
																										"bPaginate" : true,
																										"bSort" : true,
																										"bFilter" : true,
																										"bInfo" : true,
																										"bLengthChange" : true,
																										"bAutoWidth" : true
																									});
																				});
															//-->
															</script></div>
         
													   </TD>
          </TR>
        </TABLE>
        <TABLE>
          <TR>
            <TD>
              <input type="button" id="" value="Create New Report"/>
            </TD>
            <TD>
              <input type="button" id="" value="Generate report"/>
            </TD>
          </TR>
        </TABLE></TD>
    </TR>
  </TABLE>
</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/scripts/screen/DistrictAuditHistory.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>