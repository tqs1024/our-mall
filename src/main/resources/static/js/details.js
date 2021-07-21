function insert(){

}


function insertOrder(){
    let gid01 = gid.value;
    let count01 = count.value;

    $.ajax ({
        url: "/insertOrder",
        data: {
            gid : gid01,
            count : count01,
        },
        success: function (response) {
            if(response) {
                alert("购买成功,进入订单中心查看！");
            } else {
                alert("购买失败,请重试！");
            }
        }
    });


}