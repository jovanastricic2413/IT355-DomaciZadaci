<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp" %>
<html>
    <head>
        <title>Unos usluge</title>
    </head>
    <body>
        <h2>Unesite informacije o usluzi</h2>
        <form:form method="POST" action="/JovanaStricic/addUsluga">
            <table>
                <tr>
                    <td><form:label path="tip_usluga"><spring:message code="tip_usluga"/></form:label></td>
                    <td><form:input path="tip_usluga" /></td>
                </tr>
                <tr>
                    <td><form:label path="naziv_usluga"><spring:message code="naziv_usluga"/></form:label></td>
                    <td><form:input path="naziv_usluga" /></td>
                </tr>
                <tr>
                    <td><form:label path="cena_usluga"><spring:message code="cena_usluga"/></form:label></td>
                    <td><form:input path="cena_usluga" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Dodaj"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
<%@ include file="footer.jsp" %>