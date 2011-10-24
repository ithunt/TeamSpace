<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="edittask" data-title="TeamSpace | View Task">

        <div data-role="header" data-theme="d" data-position="inline">
            <a href="tasks.htm" data-rel="back" data-iconpos="notext" data-icon="arrow-l" data-theme="a">Back</a>
            <h1>Task Details</h1>
        </div>

        <div data-role="content" data-theme="c">
            <form action="test" method="post">
				<fieldset>
					<div data-role="fieldcontain">
                        <label for="title">Title:</label>
                        <input type="text" name="title" id="title" value="${task.name}" />
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="date">Due Date:</label>
                        <input name="date" id="date" type="date" data-role="datebox" value="<fmt:formatDate value="${task.targetDate}" pattern="yyyy-MM-dd"/>"
                           data-options='{"pickPageButtonTheme": "b", "mode": "calbox", "disableManualInput": true, "useDialogForceFalse": true}' />
                    </div>
                       
                    <div data-role="fieldcontain">
                       <label for="priority-select" class="select">Priority:</label>
                       <select name="priority-select" id="priority-select" data-native-menu="false">
                          <option value="normal_priority">Normal</option>
                          <option value="high_priority" 
                            <c:if test="${task.priority=='High'}">
	                            selected="selected"
	                        </c:if>
                          >High</option>
                       </select>
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="description">Notes:</label>
                        <textarea cols="40" rows="8" name="description" id="description">${task.description}</textarea>
                    </div>
                    
					<button type="submit" data-icon="check" data-theme="b" name="submit" value="submit-value">Save Changes</button>
                </fieldset>
            </form> 
        </div>

    </div>

</body>
</html>
