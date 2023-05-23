<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value='/resources/css/sidebar/sidebar-template.css'></c:url>" rel="stylesheet" />

<style>
	
.list-side .item-side .link-side {
  background-color: #150050; 
}
.list-side .item-side .link-side.btn-light{
  background-color: antiquewhite;
}
.sublist-side .subitem-side .sublink-side.btn-outline-danger {
  background-color: antiquewhite;
}

</style>
	<c:if test="${lg_num != null}">
<sidebar>
		<ul class="list-side">
			<li class="item-side leagueSideMenu">
				<a href="#demo1" class="link-side btn btn-light col-md" data-toggle="collapse">리그소개</a>
				<div id="demo1" class="collapse">
					<ul class="sublist-side">
						<li class="subitem-side">
							<a class="sublink-side btn btn-outline-danger col-sm-8" href="#">
								<span class="menu-title">리그소개</span>
							</a>
						</li>
						<li class="subitem-side">
							<a class="sublink-side btn btn-outline-danger col-sm-8" href="#">
								<span class="menu-title">리그규정</span>
							</a>
						</li>
					</ul>
				</div>
			</li>
			<li class="item-side">
				<a href="#demo2" class="link-side btn btn-light col-md" data-toggle="collapse">리그일정</a>
				<div id="demo2" class="collapse">
					<ul class="sublist-side">
						<li class="subitem-side">
							<a class="sublink-side btn btn-outline-danger col-sm-8" href="<c:url value='/league/schedule/${lg_num }'></c:url>">
								<span class="menu-title">리그일정/결과</span>
							</a>
						</li>
						<li class="subitem-side">
							<a class="sublink-side btn btn-outline-danger col-sm-8" href="<c:url value='/league/enroll/${lg_num }'></c:url>">
								<span class="menu-title">리그경기신청</span>
							</a>
						</li>
						<li class="subitem-side">
							<a class="sublink-side btn btn-outline-danger col-sm-8" href="<c:url value='/league/partimanagerment/list/${lg_num}'></c:url>">
								<span class="menu-title">리그관리</span>
							</a>
						</li>
					</ul>
				</div>
			</li>
			<li class="item-side">
				<a href="#demo3" class="link-side btn btn-light col-md" data-toggle="collapse">기록실</a>
				<div id="demo3" class="collapse">
					<ul class="sublist-side">
						<li class="subitem-side">
							<a class="sublink-side btn btn-outline-danger col-sm-8" href="<c:url value='/league/recordHit/${lg_num }'></c:url>">
								<span class="menu-title">선수기록</span>
							</a>
						</li>
						<li class="subitem-side">
							<a class="sublink-side btn btn-outline-danger col-sm-8" href="<c:url value='/league/recordTeam'></c:url>">
								<span class="menu-title">팀순위</span>
							</a>
						</li>
					</ul>
				</div>
			</li>
		</ul>
	</sidebar>
	</c:if>


