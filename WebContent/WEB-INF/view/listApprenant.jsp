
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp"/>

        <div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->
        <br><br><br>
		<div class="container">
		<h3 class="text-center mt-5" style="font-family:Optima;font-weight:600">vous pouvez valider n'importe quelle réservation que vous souhaitez</h3>
		<br><br>
			<table class="table table-bordered" style="background-color: black;color: white;border-radius: 8% 47% 2% 0%;border: none;">
				<thead>
					<tr>
						                        
                    <th>Le nom</th>
                    <th>Email</th>
                    
					</tr>
				</thead>
				<tbody>
					
                                     
                    <c:forEach var="apprenant" items="${listApprenant}">
						<tr>
	   				      <td>${apprenant.firstName}</td>
                            <td>${apprenant.email}</td>
							<td><a class="btn btn-md btn-warning" style="background-color:green;border-color:green;color:white;float:right" href="valider/${apprenant.id}">valider</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>

<br><br><br><br>
<jsp:include page="footer.jsp" />


