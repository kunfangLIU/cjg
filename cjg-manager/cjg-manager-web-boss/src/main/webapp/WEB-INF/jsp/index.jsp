<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>首页</title>
	<!-- 导入easyui的样式表 -->
	<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
	<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
	<link rel="stylesheet" href="css/common.css">
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:70px;padding-left:10px;">
	<h2>藏金阁支付后台首页</h2>
</div>

<div data-options="region:'west'" style="width:200px;">
	<div id="menu" class="easyui-accordion">
		<div title="权限管理	" data-options="selected:true,iconCls:'icon-tip'" style="padding:10px 0;">
			<ul class="easyui-tree">
				<li data-options="attributes:{'href':''}">菜单管理</li>
				<li data-options="attributes:{'href':''}">权限管理</li>
				<li data-options="attributes:{'href':''}">角色管理</li>
				<li data-options="attributes:{'href':''}">操作员管理</li>
			</ul>
		</div>
		<div title="支付管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
			<ul class="easyui-tree">
				<li data-options="attributes:{'href':'rpPayProduct-list'}">支付产品信息</li>
				<li data-options="attributes:{'href':'rpPayProduct-config'}">用户支付配置</li>
			</ul>
		</div>
		<div title="交易管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
			<ul class="easyui-tree">
				<li data-options="attributes:{'href':''}">支付订单管理</li>
				<li data-options="attributes:{'href':''}">支付记录管理</li>
			</ul>
		</div>
		<div title="账户管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
			<ul class="easyui-tree">
				<li data-options="attributes:{'href':'rpAccount-list'}">账户信息</li>
				<li data-options="attributes:{'href':'rpAccount-history'}">账户历史信息</li>
			</ul>
		</div>
		<div title="用户管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
			<ul class="easyui-tree">
				<li data-options="attributes:{'href':''}">用户信息</li>
			</ul>
		</div>
		<div title="交易管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
			<ul class="easyui-tree">
				<li data-options="attributes:{'href':'listPaymentOrder'}">支付订单管理</li>
				<li data-options="attributes:{'href':'listPaymentRecord'}">支付记录管理</li>
			</ul>
		</div>
	</div>
</div>
<div data-options="region:'center'" style="background:#eee;">
	<div id="tab" class="easyui-tabs" data-options="fit:true">
		<div title="欢迎页面" style="padding:20px;">藏金阁欢迎你</div>
	</div>
</div>
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<script src="js/moment/moment-with-locales.js"></script>
<script>
    moment.locale('zh-cn')
</script>
<!-- 自定义脚本 -->
<script src="js/common.js"></script>
<!-- 自定义js -->
<script>
    cjg.registerMenuEvent();
</script>



</body>
</html>