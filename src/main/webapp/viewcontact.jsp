<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="viewcontact" data-title="TeamSpace | View Contact" >
    
        <div data-role="header" data-theme="d" data-position="inline">
            <a href="people" data-rel="back" data-iconpos="notext" data-icon="arrow-l" data-theme="a">Back</a>
            <h1>Info</h1>
        </div>

        <div data-role="content" data-theme="c">            
            <table id="info-table" summary="Contact Information">
                <tbody>
                    <tr class="bottomborder">
                        <td class="firstcol">
	                        <c:if test="${empty contact.pictureURL}">
							    <img height="32" width="32" src="/resources/img/default-user.png" alt="Portrait" /></td>
							</c:if>
							<c:if test="${not empty contact.pictureURL}">
							    <img height="32" width="32" src="${contact.pictureURL}" alt="Portrait" /></td>
							</c:if>
                            
                        <td><h2>${contact.firstName} ${contact.lastName}</h2></td>
                    </tr>
                    <tr class="bottomborder">
                        <td class="firstcol">Role:</td>
                        <td><b>${contact.role}</b></td>
                    </tr>
                    <tr class="bottomborder">
                        <td colspan="2">
                            <div data-role="controlgroup" data-type="vertical">
                                <a data-role="button" data-icon="forward" href="mailto:${contact.email}" id="email" name="email">${contact.email}</a>
                                <a data-role="button" data-icon="grid" href="tel:${contact.phone}" id="email" name="email">${contact.phone}</a>
                            </div>
                        </td>
                    </tr>
                    <tr class="bottomborder">
                        <td class="firstcol">Bio:</td>
                        <td><b>${contact.bio}</b></td>
                    </tr>
                </tbody> 
            </table>
        </div>
        
    </div>
</body>
</html>
