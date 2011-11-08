<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<body>
	<div data-role="page" id="edittask" data-title="TeamSpace | View Task">

		<div data-role="header" data-theme="d" data-position="inline"
			data-theme="none">
			<a href="/tasks" data-ajax="false" data-iconpos="notext"
				data-icon="arrow-l" data-theme="a">Cancel</a>
			<h1>Task Details</h1>
			<a data-icon="check" data-theme="b" value="edittask"
				onclick="getResult();">Save</a>
		</div>

		<div data-role="content" data-theme="c">
			<div data-role="fieldcontain">
				<label for="title">Title:</label> <input type="text" name="title"
					id="title" value="${task.name}" />
			</div>

			<div data-role="fieldcontain">
				<label for="targetdate">Due Date:</label> <input name="targetdate"
					id="targetdate" type="date" data-role="datebox"
					value="<fmt:formatDate value="${task.targetDate}" pattern="yyyy-MM-dd"/>"
					data-options='{"pickPageButtonTheme": "b", "mode": "calbox", "disableManualInput": true, "useDialogForceFalse": true}'>
			</div>

			<div data-role="fieldcontain">
				<label for="priority" class="select">Priority:</label> <select
					name="priority" id="priority" data-native-menu="false">
					<option value="Normal">Normal</option>
					<option value="High"
						<c:if test="${task.priority=='High'}">
                                selected="selected"
                            </c:if>>High</option>
				</select>
			</div>

			<div data-role="fieldcontain">
				<label for="description">Notes:</label>
				<textarea cols="40" rows="8" name="description" id="description">${task.description}</textarea>
			</div>

            <br />
			<form method="delete">
				<button type="submit" data-icon="delete" data-theme="a"
					value="deletetask">Delete Task</button>
			</form>

		</div>

		<script type="text/javascript">
			function getResult() {
				jq(function() {
					jq.post("/tasks/${task.id}", {
						title : jq("#title").val(),
						targetdate : jq("#targetdate").val(),
						priority : jq("#priority").val(),
						description : jq("#description").val()
					}, function(data) {
						if (data == 'success') {
							window.location.replace("/tasks");
						} else {
							jq(
									"<div class='ui-loader ui-overlay-shadow ui-body-e ui-corner-all'><h1>"
											+ data + "</h1></div>").css({
								"display" : "block",
								"opacity" : 0.96,
								"top" : jq(window).scrollTop() + 100
							}).appendTo(jq.mobile.pageContainer).delay(1700)
									.fadeOut(1000, function() {
										jq(this).remove();
									});
						}
					});
				});
			}
		</script>

	</div>

</body>
</html>
