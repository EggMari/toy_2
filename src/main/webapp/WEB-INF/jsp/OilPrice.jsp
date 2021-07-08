<%--
  Created by IntelliJ IDEA.
  User: subin
  Date: 2021-07-04
  Time: 오후 5:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>유가정보 받아오기 </title>
    <script src="https://code.jquery.com/jquery-3.6.0.js"
            integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

    <script>
        $(document).ready(function () {
            $('#getoil').on("click", function () {
                $.ajax({
                    url: '/oilbutton', //request 보낼 서버의 경로
                    type: 'get', // 메소드(get, post, put 등)
                    dataType: 'json',
                    success: function (data) {
                        console.log(data.RESULT.OIL);
                        data.RESULT.OIL.forEach(element =>
                                console.log(element.SIDONM + '시 가격' + element.PRICE + '전날과 차이'+ element.DIFF +'원')
                        );

                    },
                    error: function (err) {
                        alert(err);
                    }
                });
            });
        })


    </script>
</head>
<body>
<button id="getoil">버트은</button>
이곳은 오일가격을 갖고올 프로젝트가 들어올 곳

제이슨

</body>
</html>
