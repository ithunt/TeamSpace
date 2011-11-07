<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="events" data-title="TeamSpace | Events">
	
        <div data-role="header" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="/" rel="external" id="navhome" data-theme="c" data-icon="custom" data-direction="reverse">Home</a></li>
                    <li><a href="/people" rel="external" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">People</a></li>
                    <li><a href="#" class="ui-btn-active" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom" >Events</a></li>
                    <li><a href="/tasks" data-ajax="false" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
        
        <div data-role="header" class="no-text-header" data-theme="none">
			<a href="/events/new" class="ui-btn-right" data-transition="slideup" data-role="button" data-theme="e" data-icon="plus">Create Event</a>
		</div>

        <div data-role="content">
            <ul data-role="listview" data-theme="d" data-dividertheme="b" data-counttheme="e">
                
                <!-- Database contents (dynamic) -->
                <li data-role="list-divider">All Events</li>
                
                <!-- TODO: Data-theme:e for new/unseen -->
                
            	<c:forEach items="${allevents}" var="event">
					<li><a href="/events/${event.id}">
					<p class="aside-spacing ui-li-aside">
					   <b><fmt:formatDate value="${event.targetDate}" pattern="MM/dd/yy"/></b>
                    </p>
                    <h3>${event.name}</h3>
                    
                    <!-- TODO: Creator name -->
                    
                    <p><b>from ${event.creator.name}</b></p>
                    <p>${event.description}</p>
               		</a></li>
				</c:forEach>
				                
            </ul>
        </div>

        <div data-role="footer" class="footer-docs" data-theme="c" >
            <p>&copy;2011 Anthony Barone</p>
        </div>

    </div>
</body>
</html>
