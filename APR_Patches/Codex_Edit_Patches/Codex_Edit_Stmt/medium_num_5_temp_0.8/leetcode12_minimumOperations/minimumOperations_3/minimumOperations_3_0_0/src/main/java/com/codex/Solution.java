package com.codex;

import java.util.*;

public class Solution {
/**
 * @author ZhangHuihua@msn.com
 * @version 1.0.0
 * */
(function ($) {
    var _op = {};
    $.fn.jTable = function (options) {
        var op = $.extend({}, _op, options);
        return this.each(function () {
            var $table = $(this);
        
        });
    };
})(jQuery);



public static int minimumOperations(int[] nums) {
    
    int len = nums.length;
    int[][] dp = new int[len][2];
    dp[0][0] = 0;
    dp[0][1] = 1;
    dp[1][0] = dp[1][1] = 1;
    for (int i = 2; i < len; i++) {
        dp[i][0] = dp[i-1][1];
        if (nums[i] != nums[i-1]) {
            dp[i][0] += 1;
        }
        dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]);
        if (nums[i] != nums[i-1]) {
            dp[i][1] += 1;
        }
    }
    return Math.min(dp[len-1][0], dp[len-1][1]);
}


$(document).ready(function() {
    var dg = $('#dg').datagrid({
        url: 'datagrid_data.json',
        fitColumns: true,
        singleSelect: true,
        rownumbers: true,
        loadMsg: '正在加载数据...',
        pagination: true,
        pageList: [10, 20, 30, 50],
        pageSize: 10,
        toolbar: [
            {
                text: '新增',
                iconCls: 'icon-add',
                handler: function(){alert('add')}
            },
            '-',
            {
                text: '修改',
                iconCls: 'icon-edit',
                handler: function(){alert('edit')}
            },
            '-',
            {
                text: '删除',
                iconCls: 'icon-remove',
                handler: function(){alert('remove')}
            }
        ]
    });
    var p = $('#dg').datagrid('getPager');
    $(p).pagination({
        onBeforeRefresh:function(){
            alert('before refresh');
        }
    });
});

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>EasyUI CRUD Demo</title>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
</head>
<body>
    <table id="dg" title="My Users" style="width:700px;height:250px"
            toolbar="#toolbar" pagination="true" idField="id"
            rownumbers="true" fitColumns="true" singleSelect="true">
        <thead>
            <tr>
                <th field="firstname" width="50">First Name</th>
                <th field="lastname" width="50">Last Name</th>
                <th field="phone" width="50">Phone</th>
                <th field="email" width="50">Email</th>
            }
        </thead>
    </table>
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
    </div>
    
    <div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
            closed="true" buttons="#dlg-buttons">
        <div class="ftitle">User Information</div>
        <form id="fm" method="post" novalidate>
            <div class="fitem">
                <label>First Name:</label>
                <input name="firstname" class="easyui-validatebox" required="true">
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }

    
}