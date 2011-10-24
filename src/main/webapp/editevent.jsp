<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="editevent" data-title="TeamSpace | View Event" >

        <div data-role="header" data-theme="d" data-position="inline">
            <a href="events.htm" data-rel="back" data-iconpos="notext" data-icon="arrow-l" data-theme="a">Back</a>
            <h1>Event Details</h1>
        </div>

        <div data-role="content" data-theme="c">
            <form action="test" method="post">
				<fieldset>
					<div data-role="fieldcontain">
                        <label for="title">Title:</label>
                        <input type="text" name="title" id="title" value="${event.name}" />
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="date">Date:</label>
                        <input name="date" id="date" type="date" data-role="datebox" value="<fmt:formatDate value="${event.targetDate}" pattern="yyyy-MM-dd"/>"
                           data-options='{"pickPageButtonTheme": "b", "mode": "calbox", "disableManualInput": true, "useDialogForceFalse": true}'>
                    </div>
                       
                    <div data-role="fieldcontain">
                        <label for="time">Time:</label>
                        <input name="time" id="time" type="date" data-role="datebox" value="<fmt:formatDate value="${event.targetDate}" pattern="h:m a"/>"
                           data-options='{"pickPageButtonTheme": "c", "mode": "timebox",  "timeFormat": 12, "disableManualInput": true, "useDialogForceFalse": true}'>
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="textarea">Notes:</label>
                        <textarea cols="40" rows="8" name="textarea" id="textarea">${event.description}</textarea>
                    </div>
                    
					<button type="submit" data-icon="check" data-theme="b" name="submit" value="submit-value">Save Changes</button>
                </fieldset>
            </form> 
        </div>

    </div>

</body>
</html>
