<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.htm" %>
<body>
    <div data-role="page" id="newevent" data-title="TeamSpace | New Event" >

        <div data-role="header" data-theme="d" data-position="inline" data-theme="none" >
            <a href="events.htm" data-rel="back" data-iconpos="notext" data-icon="delete" data-theme="a">Cancel</a>
            <h1>New Event</h1>
        </div>

        <div data-role="content" data-theme="c">
            <form action="test" method="post">
                <fieldset>
                    <div data-role="fieldcontain">
                        <label for="title">Title:</label>
                        <input type="text" name="title" id="title" value="" />
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="date">Date:</label>
                        <input name="date" id="date" type="date" data-role="datebox"
                           data-options='{"pickPageButtonTheme": "b", "mode": "calbox", "disableManualInput": true, "useDialogForceFalse": true}'>
                    </div>
                       
                    <div data-role="fieldcontain">
                        <label for="time">Time:</label>
                        <input name="time" id="time" type="date" data-role="datebox"
                           data-options='{"pickPageButtonTheme": "c", "mode": "timebox",  "timeFormat": 12, "disableManualInput": true, "useDialogForceFalse": true}'>
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="textarea">Notes:</label>
                        <textarea cols="40" rows="8" name="textarea" id="textarea"></textarea>
                    </div>
                    
                    <button type="submit" data-icon="check" data-theme="b" name="submit" value="submit-value">Create Event</button>
                </fieldset>
            </form> 
        </div>

    </div>

</body>
</html>
