$(function(){
	 //预声明表单
	 var options = {
		type : "post",
		dataType : "json",
		success : function(data) {
			if(data.status==200){
				window.location.href=ctxpath+"/user/main";
			}else{
			    myAlert('系统提示','小主，密码错啦~~~'); 
				$("#pass").html("");
			}
			//$("#loginbutton").button("reset");
		}
	};
	$("#loginform").ajaxForm(options);
	//登录事件
	$("#loginbutton").click(function(){
		//$("#loginbutton").button("loading");
		$("#loginform").submit();
	})
})
