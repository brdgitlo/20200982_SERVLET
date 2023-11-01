<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%> <!-- 패키지 연동 -->
<%@ page import="dao.ProductRepository"%>
<%@ page import="java.util.ArrayList"%>

<%! String greeting = "현재 페이지는 축구양말 상품 목록입니다.";
	String tagline = "하단 페이지 : 확인";%>

    <div class="container">
	<div class="jumbotron">
		<div class="container">
			<h3 class="display-4">
				<%=greeting%>
            </h3>
		</div>
	</div>      
<%
	ProductRepository dao = ProductRepository.getInstance();
	ArrayList<Product> listOfProducts = dao.getAllProducts();
%>
<div class="container">
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
                 <div class="card bg-dark text-white">
                        <img src="../image/product/<%=product.getFilename()%>.png" class="card-img" alt="...">
                        <div class="card-img-overlay">
                        <h5 class="card-title">트루삭스 이미지 샘플</h5>
                        <p class="card-text">출처 : 구글 검색</p>
                        </div>
                        </div>
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>원
                <p><a href="product_detail_ad.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상품 상세 정보 &raquo;</a>
			</div>
			<%
				} //반복문 끝
			%>
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