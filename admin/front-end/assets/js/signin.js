function signIn(){
	/*получаем значения из html*/
	var login=document.getElementById("login").value;
	var password=document.getElementById("password").value;

	if(login.length==0){
		alert("Введите логин");
		return;
	}
	if(password.length==0){
		alert("Введите пароль");
		return;
	}

	$.ajax({
		/*асинхронный запрос*/
		url:"localhost:8000/signin", 
		type:"POST",
		data:JSON.stringify({
			login:login,
			password:password
		}),
		success:function(data){
			console.log(data);
		},
		error:function(err){
			console.log(err);
		}
	});
}