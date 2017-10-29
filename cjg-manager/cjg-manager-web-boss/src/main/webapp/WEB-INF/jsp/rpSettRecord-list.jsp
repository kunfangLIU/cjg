<%--
  User: Administrator
  Date: 2017/10/29
  Time: 18:04
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<table id="dg"></table>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fffcf9;">
        <label>用户名称：</label>
        <input class="easyui-textbox" type="text" id="userName">
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>

<table id="dg"></table>

<script>
    function searchForm(){
        $('#dg').datagrid('load',{
            userName:$('#userName').val()
        });
    }
    function  add() {
        console.log('add');
    }
    function  edit() {
        console.log('edit');
    }
    function  down() {
        console.log('down');
    }
    function  up() {
        console.log('up');
    }
    function  remove() {
        //获取选中的行
        var selectRows = $('#dg').datagrid('getSelections');
        //没有选中任何行
        if(selectRows.length == 0){
            $.messager.alert('提示','未选中记录','warning');
            return;
        }
        //选中至少一行记录
        $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
            if (r){
                //点击了消息窗口上的确认按钮
                //将选中记录的编号写进一个数组中
                var ids = [];
                for(var i=0;i<selectRows.length;i++){
                    ids.push(selectRows[i].id);
                }
                //ajax提交数组给后台
                $.post(
                    //url:提交给后台的哪个动作去处理，只有第一个参数是必选的，其余的都是可选项
                    'userName/delete',
                    //data:提交哪些数据给后台进行处理
                    {'ids[]':ids},
                    //function:处理后成功回调的函数
                    function(data){
                        $('#dg').datagrid('reload');
                    },
                    //datatype:返回的数据类型
                    'json'
                );

            }
        });
    }

    /*初始化数据表格*/
    $('#dg').datagrid({
        pageSize:10,
        /*pageList:[20,40,50],*/
        toolbar:'#toolbar',
        fit:true,
        pagination:true,
        url:'settRecords',
        columns:[[
            {field:'ck',checkbox:true},
            {field:'id',title:'序号',width:100},
            {field:'userName',title:'用户名',width:100},
            {field:'settAmount',title:'结算金额',width:100},
            {field:'bankName',title:'银行名称',width:100},
            {field:'bankAccountName',title:'开户名',width:100},
            {field:'bankCode',title:'开户编号',width:100},
            {field:'mobileNo',title:'开户手机号',width:100},
            {field:'settStatus',title:'结算状态',width:100},
            {field:'createTime',title:'创建时间',formatter:function(value,row,index){
                return moment(value).format('   YYYY MM Do, h:mm:ss ');
            }},
            {field:'remark',title:'操作',width:100 ,formatter: function(value,row,index){
                return '<a style="color:blue" href="${pageContext.request.contextPath}/payWays" >查看</a>';
            }}
        ]]
    });
    </script>