<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="people" data-title="TeamSpace | People">
    
        <div data-role="header" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="/" rel="external" id="navhome" data-theme="c" data-icon="custom" data-direction="reverse">Home</a></li>
                    <li><a href="#" class="ui-btn-active" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom" >People</a></li>
                    <li><a href="events" rel="external" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom">Events</a></li>
                    <li><a href="tasks" rel="external" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
		
		<div data-role="header" class="no-text-header" data-theme="none">
			<a href="/people/invite" class="ui-btn-right" data-role="button" data-theme="e" data-icon="plus">Invite</a>
		</div>

        <div data-role="content">
            <ul data-role="listview" data-theme="c" data-filter="true" data-filter-placeholder="Search People..." data-filter-theme="none">
            	<c:forEach items="${allcontacts}" var="contact">
					<li><a href="/people/${contact.id}">${contact.name}</a></li>
				</c:forEach>
			</ul>
        </div>

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>
