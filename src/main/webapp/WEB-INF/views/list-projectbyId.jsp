<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" />
<style>
td{line-height: 30px}
</style>
<table class="table table-bordered table-responsive">
	<tr>
		<td>Project Id</td>
		<td>${p.id }</td>
	</tr>
	<tr>
		<td>Project Name</td>
		<td>${p.name }</td>
	</tr>
	<tr>
		<td>Local Env</td>
		<td>${p.localEnv }</td>
	</tr>
	<tr>
		<td>UAT Env</td>
		<td>${p.uatEnv }</td>
	</tr>
	<tr>
		<td>Live Env</td>
		<td>${p.liveEnv }</td>
	</tr>
</table>
