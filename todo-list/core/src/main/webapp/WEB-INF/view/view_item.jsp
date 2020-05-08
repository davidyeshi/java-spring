<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.util.AttributeNames"%>
<html>
    <head>
        <title>View Item</title>
    </head>
    <body>
        <div align="center">
                <table>
                    <tr>
                        <td><label>ID</label></td>
                        <td>
                            <form:input path="id" disabled="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Title</label></td>
                        <td>
                            <form:input path="title" disabled="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Deadline</label></td>
                        <td>
                            <form:input path="deadline" disabled="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Details</label></td>
                        <td>
                            <form:textarea path="details" disabled="true"/>
                        </td>
                    </tr>
                    <c:url var="itemsListUrl" value="${Mappings.ITEMS}"/>

                    <tr>
                        <td><input type="submit" href="${itemsListUrl}" value="Items List"/></td>
                    </tr>
                </table>
        </div>
    </body>
</html>