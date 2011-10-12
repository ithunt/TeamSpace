<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Anthony C. Barone</title>
    <meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1">
    <meta name="viewport" content="user-scalable=false"/>
    <meta name="format-detection" content="telephone=yes"/>
    <link rel="icon" href="favicon.ico" />
    <link type="text/css" href="http://code.jquery.com/mobile/latest/jquery.mobile.min.css?rc1" rel="stylesheet" />
    <link type="text/css" href="http://dev.jtsage.com/cdn/datebox/latest/jquery.mobile.datebox.min.css?rc1" rel="stylesheet" /> 
    <link rel="stylesheet" href="main.css?rc1" />
    <link rel="stylesheet" media="only screen and (max-device-width: 320px)" href="phone.css">
    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="http://code.jquery.com/mobile/latest/jquery.mobile.min.js"></script>
	<script type="text/javascript" src="http://dev.jtsage.com/jquery.mousewheel.min.js"></script>
	<script type="text/javascript" src="http://dev.jtsage.com/cdn/datebox/latest/jquery.mobile.datebox.min.js"></script>
</head>
<body>
    <div data-role="page" id="home" data-title="TeamSpace | Tasks">
	
        <div data-role="header" data-position="fixed" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="index.htm" id="navhome" data-theme="c" data-icon="custom" data-direction="reverse">Home</a></li>
                    <li><a href="people.htm" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">People</a></li>
                    <li><a href="events.htm" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">Events</a></li>
                    <li><a href="#" class="ui-btn-active" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
        
        <div data-role="header" class="no-text-header" data-theme="none">
			<a href="#" class="ui-btn-right" data-role="button" data-theme="b" data-icon="plus">Create Task</a>
		</div>

        <div data-role="content">
            
            <ul data-role="listview" data-theme="d" data-dividertheme="e" data-counttheme="b" data-split-icon="check" data-split-theme="c" >
                <li data-role="list-divider">Important <span class="ui-li-count">2 New!</span></li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside"><strong>Due Today!</strong></p>
                        <h3>Stephen Weber</h3>
                        <p><strong>You've been invited to a meeting at Filament Group in Boston, MA</strong></p>
                        <p>Hey Stephen, if you're available at 10am tomorrow, we've got a meeting with the jQuery team.</p>
                        
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside"><strong>Due Tomorrow</strong></p>
                    <h3>jQuery Team</h3>
                    <p><strong>Boston Conference Planning</strong></p>
                    <p>In preparation for the upcoming conference in Boston, we need to start gathering a list of sponsors and speakers.</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li data-role="list-divider">Approaching <span class="ui-li-count">1 New!</span></li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/15/11</p>
                    <h3>Avery Walker</h3>
                    <p><strong>Re: Dinner Tonight</strong></p>
                    <p>Sure, let's plan on meeting at Highland Kitchen at 8:00 tonight. Can't wait! </p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li data-role="list-divider">Future Tasks</li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/19/11</p>
                    <h3>Amazon.com</h3>
                    <p><strong>4-for-3 Books for Kids</strong></p>
                    <p>As someone who has purchased children's books from our 4-for-3 Store, you may be interested in these featured books.</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/22/11</p>
                    <h3>Mike Taylor</h3>
                    <p><strong>Re: This weekend in Maine</strong></p>
                    <p>Hey little buddy, sorry but I can't make it up to vacationland this weekend. Maybe next weekend?</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/22/11</p>
                    <h3>Redfin</h3>
                    <p><strong>Redfin listing updates for today</strong></p>
                    <p>There are 3 updates for the home on your watchlist: 1 updated MLS listing and 2 homes under contract.</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
			</ul>
			</div>
			<div data-role="content">
			<ul data-role="listview" data-theme="d" data-dividertheme="a" data-counttheme="b" data-split-icon="check" data-split-theme="a">
                <li data-role="list-divider">Completed</li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/25/11</p>
                    <h3>Angela Smith</h3>
                    <p><strong>Link Request</strong></p>
                    <p>My name is Angela Smith, SEO Consultant. I've greatly enjoyed looking through your site and I was wondering if you'd be interested in providing a link</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/29/11</p>
                    <h3>Mike Taylor</h3>
                    <p><strong>This weekend in Maine</strong></p>
                    <p>Sounds good, let me check into our plans.</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
            </ul>
        </div>

        <div data-role="footer" class="footer-docs" data-theme="c" >
            <p>&copy;2011 Anthony Barone</p>
        </div>

    </div>

</body>
</html>
