<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="tasks" data-title="TeamSpace | Tasks">
	
        <div data-role="header" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="/" rel="external" id="navhome" data-theme="c" data-icon="custom" data-direction="reverse">Home</a></li>
                    <li><a href="/people" rel="external" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">People</a></li>
                    <li><a href="/events" data-ajax="false" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">Events</a></li>
                    <li><a href="#" class="ui-btn-active" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
        
        <div data-role="header" class="no-text-header" data-theme="none"> 
			<a href="/tasks/new" class="ui-btn-right" data-transition="slideup" data-role="button" data-theme="e" data-icon="plus">Create Task</a>
		</div>

        <div data-role="content">
            
            <ul data-role="listview" data-theme="d" data-dividertheme="b" data-counttheme="e" data-split-icon="check" data-split-theme="c" >
            
                <!-- Database contents (dynamic) -->
                <li data-role="list-divider">All Tasks</li>
            	<c:forEach items="${alltasks}" var="task">
            	
	            	<li><a href="/tasks/${task.id}">
            	        <c:if test="${task.priority=='High'}">
                            <span class="aside-spacing-task ui-li-aside">
                                <img class="priority-image" height="16" width="16" title="High Priority" alt="High Priority" src="/resources/img/exclam.png" />
	                            <p><fmt:formatDate value="${task.targetDate}" pattern="MM/dd/yy"/></p>
	                        </span>
                        </c:if>
                        <c:if test="${task.priority!='High'}">
                            <p class="aside-spacing-task ui-li-aside"><fmt:formatDate value="${task.targetDate}" pattern="MM/dd/yy"/></p>
                        </c:if>
                        
                        <h3>${task.name}</h3>
                        
                        <!-- TODO: AssignedTo conditional -->
                        <p><b>from ${task.creator.name}</b></p>
                        <p>${task.description}</p>
                        
                        <!-- TODO: Implement 'Mark Task Complete' -->
                        
                        </a><a href="#">Mark Task 'Complete'</a>
	                </li>
				</c:forEach>
				
            </ul>
        </div>

        <div data-role="footer" class="footer-docs" data-theme="c" >
            <p>&copy;2011 Anthony Barone</p>
        </div>

    </div>

</body>
</html>
