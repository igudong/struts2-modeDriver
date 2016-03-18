<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>

<body>
	<h1>Struts 2 ModelDriven example</h1>

	<h2>Add Customer</h2>
	<s:form action="customerAction2">
		<s:textfield name="customer.name" label="Name" />
		<s:textfield name="customer.age" label="Age" value="" />
		<s:submit />
	</s:form>

</body>
</html>