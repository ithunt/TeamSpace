<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="newtask" data-title="TeamSpace | New Task">

        <div data-role="header" data-theme="d" data-position="inline" data-theme="none" >
            <a href="tasks.htm" data-rel="back" data-iconpos="notext" data-icon="delete" data-theme="a">Cancel</a>
            <h1>New Task</h1>
        </div>

        <div data-role="content" data-theme="c">
                    <div data-role="fieldcontain">
                        <label for="title">Title:</label>
                        <input type="text" name="title" id="title" value="" />
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="targetdate">Due Date:</label>
                        <input name="targetdate" id="targetdate" type="date" data-role="datebox"
                           data-options='{"pickPageButtonTheme": "b", "mode": "calbox", "disableManualInput": true, "useDialogForceFalse": true}'>
                    </div>
                       
                    <div data-role="fieldcontain">
                       <label for="priority" class="select">Priority:</label>
                       <select name="priority" id="priority" data-native-menu="false">
                          <option value="Normal">Normal</option>
                          <option value="High">High</option>
                       </select>
                    </div>
                    
                    <div data-role="fieldcontain">
                        <label for="description">Notes:</label>
                        <textarea cols="40" rows="8" name="description" id="description"></textarea>
                    </div>
                    
                    <button type="submit" data-icon="check" data-theme="b" name="submit" value="createtask" onclick="getResult();">Create Task</button>
                    
                <br />
                <div id="result" style="text-align:center;"></div>
                
        </div>
        
        <script type="text/javascript">
        
           function getResult() {
        	 jq(function() {
        	  jq.post("/tasks/new",
        	      { title:        jq("#title").val(),
        		    targetdate:   jq("#targetdate").val(),
        		    priority:     jq("#priority").val(),
        		    description:  jq("#description").val()
        		  },
        	      function(data){
        	       jq("#result").html(data);
        	     });
        	 });
        	}
        </script>

    </div>

</body>
</html>

