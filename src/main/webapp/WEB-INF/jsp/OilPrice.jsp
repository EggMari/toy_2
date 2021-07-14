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
            $('#getChart').on("click", function () {
                let area = $('#oilarea').val();
                let term= $('#term').val();

                $.ajax({
                    url: '/getOilPrices', //request 보낼 서버의 경로
                    type: 'get', // 메소드(get, post, put 등)
                    data : {'area' : area, 'term' : term},
                    dataType: 'json',
                    success: function (jsonData) {
                        drawChart(jsonData);
                        console.log(jsonData);
                    },
                    error: function (err) {
                        alert(err);
                    }
                });
            });



        });
        google.charts.load('current', {'packages':['corechart']});

        google.charts.setOnLoadCallback(getOilPrices);
        function drawChart(oilPrices) {
            var data = new google.visualization.DataTable();
            data.addColumn('string', '날짜');
            data.addColumn('number', oilPrices[0].saleArea + ' 경유 가격');

            if(oilPrices) {
                for (let oilprice in oilPrices) {
                    data.addRow([oilPrices[oilprice].save_date, oilPrices[oilprice].oilPrice]);
                }
            }
            var options = {
                title: '그래프차트',
                curveType: 'function',
                legend: { position: 'bottom' }
            };

            var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
            chart.draw(data, options);
        }

        <%-- 첫 oilprices 세팅--%>
        function  getOilPrices(area, term){
            //최초 onload 될때
            if(area == null || area == undefined){
                area = '서울';
                term = 'week';
            }

            $.ajax({
                url: '/getOilPrices', //request 보낼 서버의 경로
                type: 'get', // 메소드(get, post, put 등)
                data : {'area' : area, 'term' : term},
                dataType: 'json',
                success: function (jsonData) {
                    drawChart(jsonData);
                    console.log(jsonData);
                },
                error: function (err) {
                    alert(err);
                }
            });
        }


    </script>
이곳은 오일가격을 갖고올 프로젝트가 들어올 곳 ++++++++++++++ cron 적용
<div class ="col-md-2">
    <select class="form-control" name="oilarea" id="oilarea">
        <c:forEach items="${area_list}" var="list">
            <option value="${list}"> ${list} </option>
        </c:forEach>
    </select>
</div>
<div class ="col-md-2">
    <select class="form-control" name = "term" id="term">
        <option value="week">1주</option>
        <option value="tweek">2주</option>
        <option value="month">1달</option>
    </select>
</div>
<button class="btn btn-default col-md-2" id="getChart">가져오기</button>
<div id="chart_div"></div>


