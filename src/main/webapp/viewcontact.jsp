<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.htm" %>
<body>
    <div data-role="page" id="newevent" data-title="TeamSpace | View Contact" >
    
        <div data-role="header" data-theme="d" data-position="inline">
            <a href="people.htm" data-rel="back" data-iconpos="notext" data-icon="arrow-l" data-theme="a">Back</a>
            <h1>Info</h1>
        </div>

        <div data-role="content" data-theme="c">            
            <table id="info-table" cellpadding="7" summary="Contact Information">
                <tbody>
                    <tr class="bottomborder">
                        <td>
                            <img height="32" width="32" src="img/default-user.png" alt="Portrait" /></td>
                        <td><h2>Adam Kinkaid</h2></td>
                    </tr>
                    <tr class="bottomborder">
                        <td>Role:</td>
                        <td><b>Lead Developer</b></td>
                    </tr>
                    <tr class="bottomborder">
                        <td colspan="2">
                            <div data-role="controlgroup" data-type="vertical">
                                <a data-role="button" data-icon="forward" href="mailto:acb1485@rit.edu" id="email" name="email">acb1485@rit.edu</a>
                                <a data-role="button" data-icon="grid" href="tel:412-855-8218" id="email" name="email">412-855-8218</a>
                            </div>
                        </td>
                    </tr>
                    <tr class="bottomborder">
                        <td>Bio:</td>
                        <td><b>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</b></td>
                    </tr>
                </tbody> 
            </table>
        </div>
        
    </div>
</body>
</html>
