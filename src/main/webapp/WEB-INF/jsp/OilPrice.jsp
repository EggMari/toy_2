<%--
  Created by IntelliJ IDEA.
  User: subin
  Date: 2021-07-04
  Time: 오후 5:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

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

            getOilPrices('서울', 'week');
        });

        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);
        function drawChart(oilPrices) {
            var data = google.visualization.arrayToDataTable([
                ['Year', 'Sales', 'Expenses'],
                ['2004',  1000,      400],
                ['2005',  1170,      460],
                ['2006',  660,       1120],
                ['2007',  1030,      540]
            ]);

            var options = {
                title: 'Company Performance',
                curveType: 'function',
                legend: { position: 'bottom' }
            };


            var chart = new google.visualization.LineChart(document.getElementById('chart_div'));

            chart.draw(data, options);
        }


        <%-- 첫 oilprices 세팅--%>
        function  getOilPrices(area, term){
            $.ajax({
                url: '/getOilPrices', //request 보낼 서버의 경로
                type: 'get', // 메소드(get, post, put 등)
                data : {'area' : area, 'term' : term},
                dataType: 'json',
                success: function (data) {
                    console.log(data);
                },
                error: function (err) {
                    alert(err);
                }
            });
        }


    </script>
<button id="getoil">버트은</button>
이곳은 오일가격을 갖고올 프로젝트가 들어올 곳
<div class ="col-md-2">
    <select class="form-control" name="oilarea">
        <c:forEach items="${area_list}" var="list">
            <option value="${list}"> ${list} </option>
        </c:forEach>
    </select>
</div>
<div class ="col-md-2">
    <select class="form-control" name = "term">
        <option value="week">1주</option>
        <option value="tweek">2주</option>
        <option value="month">1달</option>
    </select>
</div>
<button class="btn btn-default col-md-2" id="getChart">가져오기</button>
<div id="chart_div"></div>


