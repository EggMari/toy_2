<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0cc41577aebb5445f37e5c60bb2cdb78"></script>
<body>
<h2>흡연구역 지도 ${mac}</h2>

<div id="map" style="width:100%;height:70%;"></div>



<h3>환경 구축 사용 기술</h3>
<ul>
    <li>AWS - EC2</li>
    <li>AWS - MySql</li>
    <li>CI/CD - JENKINS(8080 port), GITHUB</li>
    <li>SPRING BOOT 2.4.9</li>
    <li>JPA, loombok</li>
    <li>JQUERY</li>
    <li>BOOTSTRAPk</li>
</ul>

</hr>
<h2>경유 가격 가져오기 페이지</h2>
사용 API
<ul>
    <li>오피넷 기름 가격 API</li>
    <li>GOOGLE CHART API</li>
    <li>Schaduled 사용하여 일 05:00에 자동으로 경유 가격 가져오도록 자동화(DDOS 이슈로 22~28일 제외)</li>
</ul>


<ul>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
</ul>

</hr>
<div class="row">
    <div class="col-md-8">.col-md-8</div>
    <div class="col-md-4">.col-md-4</div>
</div>
<div class="row">
    <div class="col-md-4">.col-md-4</div>
    <div class="col-md-4">.col-md-4</div>
    <div class="col-md-4">.col-md-4</div>
</div>
<div class="row">
    <div class="col-md-6">.col-md-6</div>
    <div class="col-md-6">.col-md-6</div>
</div>


</body>

<script>
    let latitude = 33.450701;
    let longitude = 126.570667;
    navigator.geolocation.getCurrentPosition(function(pos) {
        latitude = pos.coords.latitude;
        longitude = pos.coords.longitude;
        setmap(latitude, longitude);

    });
    function setmap(latitude, longitude){
        var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
        var options = { //지도를 생성할 때 필요한 기본 옵션
            center: new kakao.maps.LatLng(latitude, longitude), //지도의 중심좌표.
            level: 3 //지도의 레벨(확대, 축소 정도)
        };
        var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴

        // 마커를 표시할 위치와 title 객체 배열입니다
        var positions = [
            {
                title: '카카오',
                latlng: new kakao.maps.LatLng(33.450705, 126.570677)
            },
            {
                title: '생태연못',
                latlng: new kakao.maps.LatLng(33.450936, 126.569477)
            },
            {
                title: '텃밭',
                latlng: new kakao.maps.LatLng(33.450879, 126.569940)
            },
            {
                title: '근린공원',
                latlng: new kakao.maps.LatLng(33.451393, 126.570738)
            }
        ];

// 마커 이미지의 이미지 주소입니다
        var imageSrc = "https://emojiguide.com/wp-content/uploads/platform/twitter/43492.png";

        for (var i = 0; i < positions.length; i ++) {

            // 마커 이미지의 이미지 크기 입니다
            var imageSize = new kakao.maps.Size(24, 35);

            // 마커 이미지를 생성합니다
            var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize);

            // 마커를 생성합니다
            var marker = new kakao.maps.Marker({
                map: map, // 마커를 표시할 지도
                position: positions[i].latlng, // 마커를 표시할 위치
                title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
                image : markerImage // 마커 이미지
            });
        }
    }
</script>
</html>