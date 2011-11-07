<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<body>
	<div data-role="page" id="register" data-title="TeamSpace | Register">

		<div data-role="header" data-theme="c">
			<a href="/spaces" data-theme="a" data-rel="back"
				data-icon="arrow-l" data-iconpos="notext">Back</a>
			<h1>New Account</h1>
		</div>

		<div data-role="content">

			<div data-role="fieldcontain">
				<label for="loginname">Username:</label> <input type="text" id="loginname" />
			</div>

			<div data-role="fieldcontain">
				<label for="email">Email:</label> <input type="text" id="email" />
			</div>

			<div data-role="fieldcontain">
				<label for="userpassword">Password:</label> <input type="password"
					id="userpassword" />
			</div>

			<div data-role="fieldcontain">
				<label for="name">Real Name:</label> <input type="text" id="name" />
			</div>

			<div data-role="fieldcontain">
				<label for="phone">Phone:</label> <input type="tel" id="phone" />
			</div>

			<div data-role="fieldcontain">
				<label for="role">Role:</label> <input type="text" id="role" />
			</div>

			<div data-role="fieldcontain">
				<label for="pictureURL">Picture URL:</label> <input type="text"
					id="pictureURL" />
			</div>

			<div data-role="fieldcontain">
				<label for="bio">Bio:</label>
				<textarea cols="40" rows="8" id="bio"></textarea>
			</div>

			<button type="submit" data-icon="check" data-theme="b"
				value="newuser" onclick="getResult()">Get Started</button>

		</div>

		<script type="text/javascript">
			function getResult() {
				jq(function() {
					jq.post("/account/new", {
						loginname : jq("#loginname").val(),
						userpassword : jq("#userpassword").val(),
						name : jq("#name").val(),
						phone : jq("#phone").val(),
						email : jq("#email").val(),
						role : jq("#role").val(),
						bio : jq("#bio").val(),
						pictureURL : jq("#pictureURL").val()
					}, function(data) {
						if (data == 'success') {
							window.location.replace("/spaces");
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

		<%@ include file="footer.htm"%>

	</div>
</body>
</html>
