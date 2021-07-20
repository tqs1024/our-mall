function submit() {
    let uname = username.value;
    let pwd = password.value;
    $.ajax({
        url: "/check",
        data: {
            account: uname,
            password: pwd
        },
        success: function (response) {
            if (response !== "") {
                location.href = "/home";
            } else {
                alert("用户名或密码错误，请重新登录！");
                $("#username").val("");
                $("#password").val("");
            }
        }
    });
}

function register() {
    $.ajax(
        location.href = "/registerhtml"
    );
}