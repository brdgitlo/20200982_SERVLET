<%@ page contentType = "text/html; charset=utf-8"%>
<%! String greeting = "쿠팡.COM에 오신것을 환영합니다.";
    String tagline = "하단 페이지 : 확인";%>
    <div class="jumbotron">
        <div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>	
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline%>
			</h3>
		</div>
		<hr>
</div>
<div class="card bg-dark text-white">
    <img src="image/shoks.png" class="card-img" alt="...">
    <div class="card-img-overlay">
  </div>
  </div>
<div class="list-group">
      <a href="#" class="list-group-item list-group-item-action active" aria-current="true">
        ALPA
      </a>
      <a href="#" class="list-group-item list-group-item-action">BETA</a>
      <a href="#" class="list-group-item list-group-item-action">PRO</a>
      <a href="#" class="list-group-item list-group-item-action">ELITE</a>  
        
    </div>