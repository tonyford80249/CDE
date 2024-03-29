
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
<%@ page import="com.cdoe.util.UserInfo" %>
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
	<form>
		<!-- Main outer table -->
		<TABLE>
			<TR>
				<TD width="40%" />
				<TD>
					<TABLE>
						<TR>
						 <td width="20%"/>
							<TD align="center"><h2>Transportation Home</h2></TD>
						</TR>
						<TR>
						    <td width="40%"/>
							<TD><a id="" href="Cde40TransReimbForm"><font color="black"><b>1.
										CDE-40 Transportation Reimbursement Form</font></b></a></TD>
						</TR>
            <!--
						<%
							if (userInfo.isTransportationUser() && userInfo.isAdminUser()) { 
						%>
            -->
						<TR>
	                        <td width="40%"/>
							<TD><a id=""
								href="${pageContext.request.contextPath}/secure/DistributionAmounts"><font
									color="black"><b>2. Distribution Amounts</b></a></TD>

						</TR>
						<TR>
                            <td width="40%"/>
							<TD><a id=""
								href="${pageContext.request.contextPath}/secure/DistrictPaymentReport"><font
									color="black"><b>3. District Payment Report</b></font></a></TD>
						</TR>
						<TR>
						    <td width="40%"/>
							<TD><a id=""
								href="${pageContext.request.contextPath}/secure/CoforsUpload"><font
									color="black"><b>4. COFRS Upload</b></font></a></TD>
						</TR>
					
						<TR>
                            <td width="40%"/>
							<TD><a id=""
								href="${pageContext.request.contextPath}/secure/Cde40Summary"><font
									color="black"><b>5. CDE-40 Summary</b></font></a></TD>
						</TR>
						<TR>
                            <td width="40%"/>
							<TD> <a id=""
								href="${pageContext.request.contextPath}/secure/PaymentWorkSheet"><font
									color="black"><b>6. Calculation Worksheet</b></font></a></TD>
						</TR>
            <!--
						<%
						   }
						 %>
             -->
					</TABLE>
				</TD>
			</TR>
		</TABLE>
	</form>
</div>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/scripts/screen/TransMenu.js"></script>
<%-- End of try/catch around complete JSP in order to log and display
     runtime exceptions that occur in the JSP. --%>
<%@include file="/WEB-INF/jsp/JspCatch.inc"%>