<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="com.cdoe.util.*"%>

<%
	String formattedDate = DateUtil.getFormattedDate("EEEE, MMMM dd, yyyy");
    String homeUrl= "";
	//String userName = (String) session.getAttribute("userName");
	UserInfo userInfo = (UserInfo) session.getAttribute("USER_INFO");
	String userName = null;
	if (userInfo != null)
		userName = userInfo.getUserId();
	if (userName == null || "".equals(userName))
		userName = "default Username";
		
			
	String moduleName = request.getParameter("pageName"); 
	boolean homePage = false;
	
	
	if ((moduleName == null) || "".equals(moduleName) ) {
	    moduleName = (String) session.getAttribute("moduleName");
	    if ((moduleName == null) || "".equals(moduleName) )
	       moduleName = "State Equal Systems";
	}  else {
		homePage=true;
		if ("LandingMenu".equals(moduleName))
			 moduleName = "State Equal Systems";
		else	
			moduleName = moduleName.substring(0, moduleName.length() -  4);
	}  
	session.setAttribute("moduleName", moduleName);
	System.out.println("moduleName" +  moduleName);
	
if (!homePage) { 
   if ("Transportation".equals(moduleName)) {  
      homeUrl = "TransportationHomePage";
   } else if ("Auditor".equals(moduleName)) {
     homeUrl = "AuditorHomePage";
   } else {
        homeUrl = "StateEqualHomePage";
        }
} else {
	homeUrl = "LandingMenu";
}   
%>

		<div id="headcdetext">
	       <p style="width:300px;float:left;">The Colorado Department of Education</p>
	       <p style="text-align:right; padding-right:10px;">
	       Date:&nbsp;<%=formattedDate %>&nbsp;&nbsp;&nbsp;User&nbsp;Name:&nbsp; <%=userName %> &nbsp;&nbsp;&nbsp;
		   <a href="${pageContext.request.contextPath}/secure/<%=homeUrl%>" style="color:#ffffff;">Home</a> | 
		   <a href="${pageContext.request.contextPath}/logout" style="color:#ffffff;">Logout</a>
	       </p>
	    </div>
		<div id="header">
		   <div id="headlogo">
		     <a href="#"><img src="http://www.cde.state.co.us/images2/CDELogo2.gif" width="223" height="75" alt="CDE Logo" border="0" class="cdeheadlogo"></a>
		     <div id="bannersection" style='font-size: 2em;'><%=moduleName%></div>
		   </div>
		</div>
