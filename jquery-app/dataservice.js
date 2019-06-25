
//var myurl="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";

var fetchFromUrl=()=>{
    return new Promise(function(resolve,reject)
    {
        $.ajax({
            async: true,
            type: "GET",
            url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",
            success: function (response) 
            {  
                resolve(response);
            }
        });
    });
}


var sendToUrl=(studentdata)=>
{
    return new Promise(function(resolve,reject)
    {
        $.ajax({
            async: true,
            type: "POST",
            //contentType:"application/json; charset=utf-8",
            data:studentdata,
            url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",
            success: function (response) { 
                resolve(response,reject);
            },
            error:function()
            {
                alert("error");
            }
        });
    })
}

var deleteFromUrl=(id)=>
{
    return new Promise(function(resolve,reject)
    {
        $.ajax({
            async: true,
            type: "DELETE",
            url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id,
            success: function (response) { 
                //alert(response,reject);
                resolve(response);
            },
            error:function()
            {
                alert("error");
            }
        });
    })
}

var updateData=(hashid,studentdata)=>
{
    return new Promise(function(resolve,reject)
    {
        $.ajax({
            async: true,
            type: "PUT",
            data:studentdata,
            url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+hashid,
            success: function (response) { 
                resolve(response);
            },
            error:function()
            {
                //alert("error");
            }
        });
    })
}