(function () {
    task = {
        id: "101",
        taskname: "java",
        priority: "high",
        date: "12/02/2019",
        status: "not-finished",
        deletetask: true
    }
    idstatus =
        {
            id: "",
            status1: "",
            status2: "",
            deleteid: ""
        }

    var idstatusdeleteMapper = [];
    var lowpriorityTask=[];
    var moderatepriorityTask=[];
    var highpriorityTaks=[];
    var tasklist1 = [];
    var current = 0;
    var id;
    var list = localStorage.getItem("mytasklists");
    tasklist1 = JSON.parse(list);

    displayInTable();

    document.querySelector("#addtask").addEventListener("click", addToList);
    document.querySelector("#lowToHigh").addEventListener("click", lowToHighList);
    document.querySelector("#HighToLow").addEventListener("click", HighToLowList);

    var radiotick = document.querySelectorAll(".radiotick");
    for (var ivalue = 0; ivalue < radiotick.length; ivalue++) {
        radiotick[ivalue].addEventListener("click", cutTasks);
    }

    var deletetick = document.querySelectorAll(".delete");
    for (var ivalue = 0; ivalue < deletetick.length; ivalue++) {
        deletetick[ivalue].addEventListener("click", deleteTasks);
    }

    function HighToLowList()
    {
        lowpriorityTask=[];
        highpriorityTaks=[];
        moderatepriorityTask=[];    
        for (var index = 0; index < tasklist1.length; index++) 
        {
            readyPriorityArray(tasklist1[index]);
        }
        tasklist1=[];
        console.log(tasklist1)
        tasklist1=lowpriorityTask.concat(moderatepriorityTask,highpriorityTaks);
        
        displayInTable();
        radiotick = document.querySelectorAll(".radiotick");
        for (var ivalue = 0; ivalue < radiotick.length; ivalue++) {
            radiotick[ivalue].addEventListener("click", cutTasks);
        }
        deletetick = document.querySelectorAll(".delete");
        for (var ivalue = 0; ivalue < deletetick.length; ivalue++) {
            deletetick[ivalue].addEventListener("click", deleteTasks);
        }
    }

    function lowToHighList()
    {
        lowpriorityTask=[];
        highpriorityTaks=[];
        moderatepriorityTask=[];
        for (var index = 0; index < tasklist1.length; index++) 
        {
            readyPriorityArray(tasklist1[index]);
        }
        tasklist1=[];
        console.log(tasklist1)
       
        tasklist1=highpriorityTaks.concat(moderatepriorityTask,lowpriorityTask);
        
        displayInTable();
        radiotick = document.querySelectorAll(".radiotick");
        for (var ivalue = 0; ivalue < radiotick.length; ivalue++) {
            radiotick[ivalue].addEventListener("click", cutTasks);
        }
        deletetick = document.querySelectorAll(".delete");
        for (var ivalue = 0; ivalue < deletetick.length; ivalue++) {
            deletetick[ivalue].addEventListener("click", deleteTasks);
        }

    }

    function deleteTasks() {
        for (var ivalue = 0; ivalue < idstatusdeleteMapper.length; ivalue++) {
            if (idstatusdeleteMapper[ivalue].deleteid == this.id) {
                for (ivalues = 0; ivalues < tasklist1.length; ivalues++) {
                    let deletebutton = "button" + tasklist1[ivalues].id;
                    if (this.id == deletebutton) {
                        tasklist1[ivalues].deletetask = true;

                        localStorage.setItem("mytasklists", JSON.stringify(tasklist1));
                        displayInTable();
                        break;
                    }
                }
            }
        }
    }

    function cutTasks() {
        let statusid = this.name + "-" + this.id;
        var list = localStorage.getItem("mytasklists");
        tasklist1 = JSON.parse(list);
        for (var ivalue = 0; ivalue < idstatusdeleteMapper.length; ivalue++) {
            if (idstatusdeleteMapper[ivalue].status1 == statusid) {
                id = idstatusdeleteMapper[ivalue].id;
                document.getElementById(id).style.textDecoration = "";
                for (ivalue = 0; ivalue < tasklist1.length; ivalue++) {
                    if (id == tasklist1[ivalue].id) {
                        tasklist1[ivalue].status = "not-finished";
                        localStorage.setItem("mytasklists", JSON.stringify(tasklist1));
                        break;
                    }
                }
            }
            else if (idstatusdeleteMapper[ivalue].status2 == statusid) {
                id = idstatusdeleteMapper[ivalue].id;
                document.getElementById(id).style.textDecoration = "line-through";
                for (ivalue = 0; ivalue < tasklist1.length; ivalue++) {
                    if (id == tasklist1[ivalue].id) {
                        tasklist1[ivalue].status = "finished";
                        localStorage.setItem("mytasklists", JSON.stringify(tasklist1));
                        break;
                    }
                }


            }
        }

    }

    function addToList() {
        let taskname = document.getElementById("taskname").value;
        if (taskname == "" || taskname == undefined) {
            alert("add task");
            return;
        }
        let priority = document.getElementById("prioritylist").value;

        var list = localStorage.getItem("mytasklists");
        tasklist1 = JSON.parse(list);

        let listlength = tasklist1.length;

        let task2 = Object.create(task);
        task2.id = Number(tasklist1[listlength - 1].id) + 1;
        task2.taskname = taskname;
        task2.priority = priority;
        task2.date = (Date().split(" GMT")[0]).toString();
        task2.status = "not-finished";
        task2.deletetask = false;
        tasklist1[listlength] = task2;

        localStorage.setItem("mytasklists", JSON.stringify(tasklist1));

        for (var index = 0; index < tasklist1.length; index++) 
        {
            readyPriorityArray(tasklist1[index]);
        }
        displayInTable();
    }


    
    function readyPriorityArray(thistask)
    {
        
        if (thistask.deletetask == false) {
           
            if (thistask.priority == "Low" || thistask.priority == "low") {
                //console.log(lowpriorityTask.length);
                //console.log(lowpriorityTask)
                lowpriorityTask[lowpriorityTask.length]=thistask;
            }
            else if (thistask.priority == "Moderate") {
                moderatepriorityTask[moderatepriorityTask.length]=thistask;
                
            }
            else if (thistask.priority  == "High") {
                highpriorityTaks[highpriorityTaks.length]=thistask;
            }
        }      
    }

    function displayInTable() {
        
        var tablecontent = document.getElementById("displaytable");
        var tableheader = "<tr id='100' ><th>task name</th><th> priority</th>";
        tableheader += "<th>date</th> <th>status</th>  <th>delete</th> </tr>"

        

        var tabledata = "";
        for (var index = tasklist1.length - 1; index >= 0; index--) {
            let idstatus1 = Object.create(idstatus);
            idstatus1.id = "" + tasklist1[index].id;
            idstatus1.status1 = "status" + tasklist1[index].id + "-1";
            idstatus1.status2 = "status" + tasklist1[index].id + "-2";
            idstatus1.deleteid = "button" + tasklist1[index].id;
            idstatusdeleteMapper[index] = idstatus1;
            //console.log(idstatusdeleteMapper);
            if (tasklist1[index].deletetask == false) {
                let id = tasklist1[index].id;
                tabledata += "<tr id=" + tasklist1[index].id + ">";
                tabledata += "<td>" + tasklist1[index].taskname + "</td>";
                tabledata += "<td>" + tasklist1[index].priority + "</td>";

                tabledata += "<td>" + moment(tasklist1[index].date).fromNow() + "</td>";
                tabledata += "<td><input type='radio' id='1' class='radiotick' name='status" + tasklist1[index].id + "' value='not-finished'";
                if (tasklist1[index].status == "not-finished") {
                    tabledata += "checked";
                }
                tabledata += ">not-finished";
                tabledata += " <input type='radio' id='2' class='radiotick' name='status" + tasklist1[index].id + "' value='finished'";
                if (tasklist1[index].status == "finished") {
                    tabledata += "checked";
                    //document.getElementById(id).style.textDecoration="line-through";
                }
                tabledata += ">finished</td>"
                tabledata += "<td><button class='delete' id=button" + tasklist1[index].id + ">delete</button></td>  </tr>"


            }
        }
        tablecontent.innerHTML = tableheader + tabledata;
        radiotick = document.querySelectorAll(".radiotick");
        for (var ivalue = 0; ivalue < radiotick.length; ivalue++) {
            radiotick[ivalue].addEventListener("click", cutTasks);
        }
        deletetick = document.querySelectorAll(".delete");
        for (var ivalue = 0; ivalue < deletetick.length; ivalue++) {
            deletetick[ivalue].addEventListener("click", deleteTasks);
        }
        colorToTable();
    }

    function colorToTable()
    {
        for (var index = 0; index < tasklist1.length; index++) {
            //console.log(tasklist1[index].priority);
            colourToPriority(tasklist1[index]);
        }

    }

    function colourToPriority(thistask)
    {
        if (thistask.deletetask == false) {
            if (thistask.priority == "Low" || thistask.priority == "low") {
                let id = thistask.id;
                document.getElementById(id).style.backgroundColor = "MediumSeaGreen";
            
            }
            else if (thistask.priority == "Moderate") {
                let id = thistask.id;
                document.getElementById(id).style.backgroundColor = "#ffff4d";
           
            }
            else if (thistask.priority  == "High") {
                let id = thistask.id;
                document.getElementById(id).style.backgroundColor = "Tomato";
           
            }
            //console.log(thistask.deletetask); 
        
            //console.log(thistask.status );
            if (thistask.status == "finished") {
                let id = thistask.id;
                document.getElementById(id).style.textDecoration = "line-through";
            }
        }
    }


})();