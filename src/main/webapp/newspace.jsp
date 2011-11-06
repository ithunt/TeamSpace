<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<body>
	<div data-role="page" id="newtask" data-title="TeamSpace | New Space">

		<div data-role="header" data-theme="d" data-position="inline"
			data-theme="none">
			<a href="/spaces" data-ajax="false" data-iconpos="notext"
				data-icon="arrow-l" data-theme="a">Back</a>
			<h1>New Space</h1>
		</div>

		<div data-role="content" data-theme="c">
			<div data-role="fieldcontain">
				<label for="title">Title:</label> <input type="text" name="title"
					id="title" />
			</div>

			<div data-role="fieldcontain">
				<label for="description">Description:</label>
				<textarea cols="40" rows="8" name="description" id="description"></textarea>
			</div>

			<button data-icon="check" data-theme="b" name="submit"
				value="createtask" onclick="getResult();">Create Space</button>

			<br />
			<div id="result" style="text-align: center;"></div>

		</div>

		<script type="text/javascript">
			function getResult() {
				jq(function() {
					jq.post("/spaces/new", {
						title : jq("#title").val(),
						description : jq("#description").val()
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

