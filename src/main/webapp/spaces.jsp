<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="spaces" data-title="TeamSpace | Spaces">
    
        <div data-role="header" data-theme="c">
            <h1>My Spaces</h1>
        </div>

        <div data-role="header" class="no-text-header" data-theme="e" >
            <a href="/spaces/new" data-theme="b" data-icon="plus" data-iconpos="notext">New</a>
            <a href="<c:url value='j_spring_security_logout' />" data-icon="delete" data-theme="c" class="ui-btn-right" >Logout</a> <!-- custom-but-spacing -->
        </div>

        <div data-role="content">
            <ul data-role="listview" data-theme="c" data-filter="true" data-filter-placeholder="Search Spaces..." data-filter-theme="none">
					
				<c:forEach items="${spaces}" var="space">
                    <li><a href="/spaces/${space.id}">${space.name}</a></li>
                </c:forEach>
			</ul>
        </div>

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>

