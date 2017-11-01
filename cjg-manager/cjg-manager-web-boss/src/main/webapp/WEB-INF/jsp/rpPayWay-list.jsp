<%--
  User: Administrator
  Date: 2017/10/28
  Time: 18:21
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<table id="tg"></table>
<div id="toolbar">
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>

<table id="tg"></table>

<script>

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
        var selectRows = $('#tg').datagrid('getSelections');
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
                    'rpPayProducts/delete',
                    //data:提交哪些数据给后台进行处理
                    {'ids[]':ids},
                    //function:处理后成功回调的函数
                    function(data){
                        $('#tg').datagrid('reload');
                    },
                    //datatype:返回的数据类型
                    'json'
                );

            }
        });
    }

    /*初始化数据表格*/
    $('#tg').datagrid({
        pageSize:10,
        /*pageList:[20,40,50],*/
        toolbar:'#toolbar',
        fit:true,
        pagination:true,
        url:'rpPayWays',
        columns:[[
            {field:'ck',checkbox:true},
            {field:'id',title:'序号',width:100},
            {field:'payWayCode',title:'支付方式编号',width:100},
            {field:'payWayName',title:'支付方式名称',width:100},
            {field:'payTypeCode',title:'支付类型编号',width:100},
            {field:'payTypeName',title:'支付类型名称',width:100},
            {field:'payRate',title:'费率',width:100},
            {field:'createTime',title:'创建时间',formatter:function(value,row,index){
                return moment(value).format('   YYYY MM Do, h:mm:ss ');
            }},

            {field:'auditStatus',title:'操作',width:100 ,}

        ]]
    });

</script>
