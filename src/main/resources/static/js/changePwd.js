function confirmChange(userId) {
    // let Caccount = account.value;
    //let ColdPwd = oldPwd.value;
    let CCNewAccountPwd = CNewAccountPwd.value;
    let CConfirmCNewPwd = ConfirmCNewPwd.value;

    if (CCNewAccountPwd == "" || CConfirmCNewPwd == "") {
        alert("输入不能为空！")
    } else if (CCNewAccountPwd != CConfirmCNewPwd) {
        alert("两次新密码输入不正确，请重新输入！")
    } else {
        $.ajax({
            url: "/changepassbyid",
            type: 'GET',
            data: {
                id: userId,
                password: CCNewAccountPwd
            },
            success: function (response01) {
                if (response01 != null) {
                    window.location.href = "http://localhost:8081/login";
                } else {
                    alert("修改失败，请重试！");
                }
            }
        })
    }
}

function DelayC() {
    $.ajax(
        location.href = "/user/login"
    );
}