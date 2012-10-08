
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
	<form:form commandName="auditFpcForm"
		action="${pageContext.request.contextPath}/secure/AudTracking/save"
		method="post">


		<!-- Main outer table -->

		<h3>
			</b> District Information
		</h3>
		<TABLE  width="100%">
			<TR>
				<TD>
					<div id="districtGrid" align="center"
						style="border: 5px groove #ccc;">
						<table id="districtGrid" class="display">
							<thead>
								<tr>
									<th width="4%">District Code</th>

									<th width="20%">District Name</th>

									<th width="10%">District Size</th>

									<th width="6%">County Code</th>

									<th width="16%">County Name</th>

									<th width="6%">Region</th>

									<th width="6%">Frequency of Audits</th>

									<th width="10%">Last Modified</th>

									<th width="18%">Comments</th>

								</tr>
							</thead>

							<tbody>

								<!-- c:forEach var="auditFpcForm"
									items="${auditFpcForm.auditFpcGridList}"
									varStatus="idx" -->
                              
									<tr>
										<td width="4%">1040</td>

										<td width="20%">Academy 20</td>

										<td width="10%">1000 - 20000</td>

										<td width="6%">21</td>

										<td width="16%">El Paso</td>

										<td width="4%">3</td>

										<td width="6%">1 Year</td>

										<td width="10%">11/02/2001</td>

										<td width="18%">District in Good Standing</td>
									</tr>
								    <tr>
										<td width="4%">1141</td>

										<td width="20%">Academy 20</td>

										<td width="10%">1000 - 20000</td>

										<td width="6%">21</td>

										<td width="16%">Colorado Spring</td>

										<td width="4%">3</td>

										<td width="6%">1 Year</td>

										<td width="10%">11/02/2001</td>

										<td width="18%">District in insolvent stage</td>
									</tr>
								    <tr>
										<td width="4%">1040</td>

										<td width="20%">Douglas Academy 20</td>

										<td width="10%">10000 - 20000</td>

										<td width="6%">21</td>

										<td width="16%">Douglas</td>

										<td width="4%">3</td>

										<td width="6%">1 Year</td>

										<td width="10%">11/02/2001</td>

										<td width="18%">District has defaulted</td>
									</tr>
								    <tr>
										<td width="4%">1048</td>

										<td width="20%">Arapahoe Excellence 20</td>

										<td width="10%">10000 - 12000</td>

										<td width="6%">21</td>

										<td width="16%">Arapahoe</td>

										<td width="4%">3</td>

										<td width="6%">1 Year</td>

										<td width="10%">11/02/2001</td>

										<td width="18%">District in Good Standing</td>
									</tr>
								    
								<!-- /c:forEach -->
							</tbody>
						</table>

						<script type="text/javascript">
							$(document).ready(function() {
								$("table#districtGrid").dataTable({
									"bPaginate" : true,
									"bSort" : true,
									"bFilter" : true,
									"bInfo" : false,
									"bLengthChange" : false,
									"bAutoWidth" : false
								});
							});
						</script>
					</div>
				</TD>
			</TR>
		</TABLE>
		<TABLE width="100%">
			<TR>
				<TD width="40%" />
				<TD><input type="button" id="" value="Print" /></TD>
				<TD><input type="button" id="" value="Update" /></TD>
			</TR>
		</TABLE>
	</form:form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/AudTracking.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>