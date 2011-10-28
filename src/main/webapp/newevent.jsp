<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="newevent" data-title="TeamSpace | New Event" >

        <div data-role="header" data-theme="d" data-position="inline" data-theme="none" >
            <a href="events.htm" data-rel="back" data-iconpos="notext" data-icon="delete" data-theme="a">Cancel</a>
            <h1>New Event</h1>
        </div>

        <div data-role="content" data-theme="c">
                    <div data-role="fieldcontain">
                        <label for="title">Title:</label>
                        <input type="text" name="title" id="title" value="" />
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="targetdate">Date:</label>
                        <input name="date" id="targetdate" type="targetdate" data-role="datebox"
                           data-options='{"pickPageButtonTheme": "b", "mode": "calbox", "disableManualInput": true, "useDialogForceFalse": true}'>
                    </div>
                       
                    <div data-role="fieldcontain">
                        <label for="targettime">Time:</label>
                        <input name="time" id="targettime" type="targettime" data-role="datebox"
                           data-options='{"pickPageButtonTheme": "c", "mode": "timebox",  "timeFormat": 12, "disableManualInput": true, "useDialogForceFalse": true}'>
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="description">Notes:</label>
                        <textarea cols="40" rows="8" name="description" id="description"></textarea>
                    </div>
                    
                    <button type="submit" data-icon="check" data-theme="b" name="submit" value="createevent" onclick="getResult()">Create Event</button>
                
                <br />
                <div id="result" style="text-align:center;"></div>
                
        </div>
        
        <script type="text/javascript">
        
           function getResult() {
             jq(function() {
              jq.post("/events/new",
                  { title:        jq("#title").val(),
                    targetdate:   jq("#targetdate").val(),
                    targettime:   jq("#targettime").val(),
                    description:  jq("#description").val()
                  },
                  function(data){
                   jq("#result").html(data);
                 });
             });
            }
        </script>
                
        </div>

    </div>

</body>
</html>
