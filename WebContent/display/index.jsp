<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Trang chu</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>
    <jsp:include page="session.jsp"></jsp:include>
	<div style="width: 100%; height: 100%">
		<div id="menu">
			<ul>
				<li><a href="">HTML - CSS</a></li>
				<li><a href="">Java Script</a></li>
				<li><a href="">Java Script - Cookie</a></li>
				<li><a href="">JQuery</a></li>
				<li><a href="">Ajax</a></li>
				<li><a href="">JSP</a></li>
				<li><a href="">Servlet</a></li>
				<li><a href="">MVC - JSP Models</a></li>
				<li><a href="">Struts2.0</a></li>
				<li><a href="">Unit Testing</a></li>
			</ul>
		</div>
		<div id="nav">
			<ul>
				<li><a href="">HTML - CSS</a>
					<ul id="submenu">
						<li><a href="">Table</a></li>
						<li><a href="${pageContext.request.contextPath}/display-all">All
								Employees</a></li>
						<li><a
							href="${pageContext.request.contextPath}/display/form.jsp">Form
								Insert</a></li>
					</ul></li>
				<li><a href="">Java Script</a></li>
				<li><a href="">JQuery</a></li>
				<li><a href="">JSP</a></li>
				<li><a href="">Servlet</a></li>
				<li><a href="">Spring</a></li>
				<li><a href="">Hibernate</a></li>
			</ul>
		</div>
		<!-- The div nay dung de chua anh -->
		<div id="content1">
			<img src="${pageContext.request.contextPath}/image/images.jpg"
				alt="Kiem tra lai"> <br>
			<p style="margin-bottom: 15px; text-decoration: none;">CHAMP
				GLOBAL DEVELOP PASSPORT</p>
		</div>
		<!-- The div nay chua noi dung a,b,c -->
		<div id="content2">
			<ul>
				<li>
					<h3>Ta me cua em</h3> <img
					src="${pageContext.request.contextPath}/image/gaixinh1.jpg"
					style="width: 150px; float: left;">
					<p>Năm nay, mẹ em bốn mươi tuổi. Với thân hình mảnh mai, thon
						thả đã tôn thêm vẻ đẹp sang trọng của người mẹ hiền từ. Mái tóc
						đen óng mượt mà dài ngang lưng được mẹ thắt lên gọn gàng . Đôi mắt
						mẹ đen láy luôn nhìn em với ánh mắt trìu mến thương yêu. Khuôn mặt
						mẹ hình trái xoan với làn da trắng. Đôi môi thắm hồng nằm dưới
						chiếc mũi cao thanh tú càng nhìn càng thấy đẹp. Khi cười, nhìn mẹ
						tươi như đóa hoa hồng vừa nở ban mai. Đôi bàn tay mẹ rám nắng các
						ngón tay gầy gầy xương xương vì mẹ phải tảo tần để nuôi nấng, dìu
						dắt em từ thưở em vừa lọt lòng.Mẹ làm nghề nông nhưng mẹ may và
						thêu rất đẹp. Đặc biệt mẹ may bộ đồ trông thật duyên dáng, sang
						trọng.Ở nhà, mẹ là người đảm nhiệm công việc nội trợ.</p>
				</li>
				<li>
					<h3>Ta bo cua em</h3> <img
					src="${pageContext.request.contextPath}/image/gaixinh2.jpg"
					style="width: 150px; float: left; height: 120px;">
					<p>Giọng nói bố tôi trầm ấm, dứt khoát nhưng vẫn tha thiết yêu
						thương. Vàm ngực bố rộng, đủ để che chở và ủ ấm cho ba mẹ con tôi.
						Tôi vẫn thường gọi bố là lực sĩ vì bắp tay bắp chân của bố tôi
						cuồn cuộn. Nhờ sự khỏe mạnh và cướng cỏi của bố tôi mới hiểu vì
						sao bố là trụ cột, là chỗ dựa cho ba mẹ con tôi. Hàng ngày bố tôi
						dậy sớm nhất nhà. Vào những ngày đông giá rét bố vẫn không bỏ thói
						quen tập thể dục mỗi sáng. Bố giúp mự lo bữa sáng cho anh em chúng
						tôi rồi đưa chúng tôi tới trường, sau đó bố mới đến cơ quan làm
						việc.</p>
				</li>
				<li>
					<h3>Ta em gai cua em</h3> <img
					src="${pageContext.request.contextPath}/image/gaixinh3.jpg"
					style="width: 150px; float: left; height: 100px;">
					<p>Bé Ngọc rất dễ thương. Má lúm đồng tiền. Môi hồng, hàm răng
						trắng nõn. Bố và anh trai có nước da đen, còn mẹ và bé Ngọc lại có
						nước da trắng. Cặp mắt bé đen huyền, dịu dàng. Em hát hay, múa đẹp
						và có trí nhớ rất tốt, em thuộc lòng một số bài đồng dao bà nội
						dạy cho. Ngọc rất sạch sẽ. Thân thể, tóc tai, áo quần lúc nào cũng
						thơm tho. Mẹ em nói: “Sang năm, con dạy em học chữ cái và tập đánh
						vần nhé...”. Lần nào cũng vậy, đón anh trai đi học về, em Ngọc đểu
						hỏi: “Anh được mấy điểm mười? ”, rồi em đòi xách cặp cho anh.</p>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>