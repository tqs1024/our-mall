$.ajax({

    url: "/orderAll",
    success: function (response) {
        let html = "";
        for (let i = 0; i < response.length; i++) {
            let o = response[i];

            let btnDisabled = `<button onclick="disableUser(` + o.id + `)" type="button" class="btn btn btn-warning">取消订单</button>`;

            let btnAbled = `<button onclick="ableUser(` + o.id + `)" type="button" class="btn btn-danger">删除订单</button>`;
            html += `<tr>
                        <td>` + o.id + `</td>
                        <td>` + o.name + `</td>
                        <td>` + o.describe + `</td>
                        <td>` + o.price + `</td>
                        <td>` + o.count + `</td>
                        <td>` + (o.price * o.count) + `</td>
                        <td>` + (o.deleted ? "订单取消" : "订单正常") + `</td>
                        <td>` + (o.deleted ? btnAbled : btnDisabled) + `</td>
                    </tr>`;
        }
        tableBody.innerHTML = html;
    }
});

function disableUser(id) {
    $.ajax({
        url: "/disabled",
        data: {
            id: id
        },
        success: function (response) {
            if (response) {
                window.location.reload();
            } else {
                alert("取消失败！");
            }
        }
    });
}