function confirmRegister() {
    let Account = NewAccount.value;
    //let NewPhone = NewPhone.value;
    let AccountPwd = NewAccountPwd.value;
    let ConfirmPwd = ConfirmNewPwd.value;

    if (Account == "" || AccountPwd == "" || ConfirmPwd == "") {
        alert("输入不能为空！")
    } else if (AccountPwd != ConfirmPwd) {
        alert("两次密码输入不对，请重新输入！")
    } else {
        $.ajax({
            url: "/registerCheck",
            data: {
                NewAccount: Account,
            },
            success: function (response) {
                if (response) {
                    $.ajax({
                        url: "/register",
                        data: {
                            NewAccount: Account,
                            NewAccountPwd: AccountPwd
                        },
                        success: function (response01) {
                            if (response01 != null) {
                                location.href = "/login";
                            } else {
                                alert("注册失败，请重试！");
                            }
                        }
                    });

                } else {
                    alert("账号已存在,请重新输入！");
                }
            }
        });
    }
}

function Delay() {
    $.ajax(
        location.href = "/login"
    );
}