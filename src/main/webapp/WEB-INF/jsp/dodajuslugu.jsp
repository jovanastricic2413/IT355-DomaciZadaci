<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="headerH.jsp" %>
<h1>Add usluga</h1>
<c:url var="addUsluga" value="/addUsluga" ></c:url>
    <div class="container">
        <div class="col-md-6 col-md-offset-3">
        <c:url var="post_url"  value="/dodajuslugu/" />
        <form:form method="POST" action="${post_url}" modelAttribute="usluga">
            <% String success = (String) request.getAttribute("successMsg");%>
            <%= (success != null) ? "<div class=\"alertalert-success\">" + success + "</div>" : ""%>
            <div class="form-group">
                <form:input type="hidden" id="id_usluga" class="form-control"
                            placeholder="id_usluga" path="id_usluga" />
                <form:label path="tip_usluga">Tip usluge</form:label>
                <form:input type="tip_usluga" id="tip_usluga" class="form-control"
                            placeholder="tip_usluga" path="tip_usluga" />
            </div>
            <div class="form-group">
                <form:label path="naziv_usluga">Naziv usluge</form:label>
                <form:input type="naziv_usluga" id="naziv_usluga"
                            class="form-control" placeholder="naziv_usluga" path="naziv_usluga" />
            </div>
            <div class="form-group">
                <form:label path="cena_usluga">Cena usluge</form:label>
                <form:input type="cena_usluga" id="cena_usluga" class="form-control"
                            placeholder="cena_usluga" path="cena_usluga" />
            </div>
            <div class="form-group">
                <form:label for="ordinacija" path="ordinacija">Ordinacija</form:label>
                <form:select id="slcRole" class="form-control" path="ordinacija">
                    <form:option value="">SELECT</form:option>
                    <form:options items="${ordinacije}" itemValue="id_ordinacija"
                                  itemLabel="naziv_ordinacija" />
                </form:select>
            </div>
            <button type="submit" class="btn btn-primary">ADD</button>
        </form:form>
    </div>
</div>
<%@include file="footerH.jsp" %>