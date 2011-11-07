<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<body>
	<div data-role="page" id="newevent" data-title="TeamSpace | New Event">

		<div data-role="header" data-theme="d" data-position="inline"
			data-theme="none">
			<a href="/events" data-ajax="false" data-iconpos="notext"
				data-icon="arrow-l" data-theme="a">Cancel</a>
			<h1>New Event</h1>
		</div>

		<div data-role="content" data-theme="c">
			<div data-role="fieldcontain">
				<label for="title">Title:</label> <input type="text" name="title"
					id="title" value="" />
			</div>

			<div data-role="fieldcontain">
				<label for="targetdate">Date:</label> <input name="targetdate"
					id="targetdate" type="date" data-role="datebox"
					data-options='{"pickPageButtonTheme": "b", "mode": "calbox", "afterToday": true, "disableManualInput": true, "useDialogForceFalse": true}'>
			</div>

			<div data-role="fieldcontain">
				<label for="targettime">Time:</label> <input name="targettime"
					id="targettime" type="date" data-role="datebox"
					data-options='{"pickPageButtonTheme": "c", "mode": "timebox", "disableManualInput": true, "useDialogForceFalse": true}'>
			</div>

			<div data-role="fieldcontain">
				<label for="description">Notes:</label>
				<textarea cols="40" rows="8" name="description" id="description"></textarea>
			</div>
			
			<div data-role="fieldcontain">
				<label for="allcontacts" class="select">Invite People:</label>
				<select data-native-menu="false" multiple="multiple" name="allcontacts" id="allcontacts">
					<c:forEach items="${allcontacts}" var="entry">
						<option>Select...</option>
						<option value="${entry.id}">${entry.name}</option>
					</c:forEach>
				</select>
			</div>

			<button type="submit" data-icon="check" data-theme="b" name="submit"
				value="createevent" onclick="getResult()">Create Event</button>

		</div>

		<script type="text/javascript">
			function getResult() {
				jq(function() {
					jq.post("/events/new", {
						title : jq("#title").val(),
						targetdate : jq("#targetdate").val(),
						targettime : jq("#targettime").val(),
						description : jq("#description").val(),
						allcontacts : String(jq("#allcontacts").val())
					}, function(data) {
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
					});
				});
			}
		</script>

	</div>

</body>
</html>
