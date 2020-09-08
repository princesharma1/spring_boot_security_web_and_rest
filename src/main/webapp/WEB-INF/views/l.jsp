<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${not empty error}">
	<div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
	<div class="msg">${msg}</div>
</c:if>

<%-- <form name="" method="post" action="/projects/login">

	UserName: <input type="text" name="username" id="username" /><br>
	Password: <input type="password" name="password" id="password" /><br>
	<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" /> <input type="submit" value="Login" />
</form> --%>

 <form class="form-signin" method="post" action="/projects/login">
        <h2 class="form-signin-heading">Please sign in</h2>
        <p>
          <label for="username" class="sr-only">Username</label>
          <input type="text" id="username" name="username" class="form-control" placeholder="Username" required autofocus>
        </p>
        <p>
          <label for="password" class="sr-only">Password</label>
          <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
        </p>
<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>



