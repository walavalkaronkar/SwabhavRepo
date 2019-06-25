(function () 
{
    var questions =
        [
            {
                id: 1,
                text: "Why so JavaScript and Java have similar name?",
                options: ["JavaScript is a stripped-down version of Java",
                    "JavaScript's syntax is loosely based on Java's",
                    "They both originated on the island of Java",
                    "None of the above"],
                answer: 1
            },
            {
                id: 2,
                text: "______ JavaScript is also called client-side JavaScript?",
                options: ["Microsoft",
                    "Navigator",
                    "LiveWire",
                    "Native"],
                answer: 1
            },
            {
                id: 3,
                text: " __________ JavaScript is also called server-side JavaScript?",
                options: ["Microsoft",
                    "Navigator",
                    "LiveWire",
                    "Native"],
                answer: 2
            },
            {
                id: 4,
                text: "Choose the server-side JavaScript object?",
                options: ["FileUpLoad",
                    "Function",
                    "File",
                    "Date"],
                answer: 2
            },
            {
                id: 5,
                text: "Which of the following is not considered a JavaScript operator?",
                options: ["new",
                    "this",
                    "delete",
                    "typeof"],
                answer: 1
            },
            {
                id: 6,
                text: "JavaScript is interpreted by _________?",
                options: ["Client",
                    "Server",
                    "Object",
                    "None of the above"],
                answer: 0
            },
            {
                id: 7,
                text: " Which tag(s) can handle mouse events in Netscape?",
                options: [" IMG tag",
                    "A tag",
                    " BR tag",
                    "None of the above"],
                answer: 1
            },
            {
                id: 8,
                text: "What is mean by 'this' keyword in javascript?",
                options: ["It refers current object",
                    "It referes previous object",
                    " It is variable which contains value",
                    " None of the above"],
                answer: 0
            },
            {
                id: 9,
                text: "How to create a Date object in JavaScript?",
                options: ["dateObjectName = new Date([parameters])",
                    "dateObjectName.new Date([parameters])",
                    " dateObjectName := new Date([parameters])",
                    " dateObjectName Date([parameters])"],
                answer: 0
            },
            {
                id: 10,
                text: "What does the 'noscript' tag do?",
                options: [" Enclose text to be displayed by non-JavaScript browsers.",
                    "Prevents scripts on the page from executing.",
                    "Describes certain low-budget movies.",
                    " None of the above"],
                answer: 0
            }
        ]

        function game()
        {

        }

        document.querySelector("#start_button").addEventListener("click",startgame);
        document.querySelector("#next").addEventListener("click",nextquestion);
        document.querySelector("#previous").addEventListener("click",previousquestion);
        document.querySelector("#submit").addEventListener("click",displayresult);


        var display=[];
        var current=-1;
        var correctans=[];
        var userans=[5,5,5,5,5];
        var rightans=0;

        function displayresult()
        {
            for(let i=0;i<=4;i++)
            {
                if(userans[i]==correctans[i])
                {
                    rightans=rightans+1;
                }
            }
            console.log("correct ans"+rightans);

            document.getElementById("question").innerHTML="";
            document.getElementById("myChart").style.display="block";
            document.getElementById("submit").style.display="none";
            document.getElementById("previous").style.display="none";
            document.getElementById("start").style.display="none";
            document.getElementById("container").innerHTML="RESULT"
            document.getElementById("display-result").innerHTML="Correct answer "+rightans+"/5";

            let myChart = document.getElementById('myChart').getContext('2d');

            let pieChart = new Chart(myChart,{
                type:'pie',
                data: {
                    labels:['correct','wrong'],
                    datasets:[{
                        //label: 'test',
                        data:[
                            rightans,
                            5-rightans
                        ],
                        backgroundColor:[
                            "green",
                            "red"
                        ]
                    }]
                },
                options: {

                }
            })
        }


        function startgame()
        {
            document.getElementById("middle").style.display="block";
            document.getElementById("start_button").style.display="none";
            document.getElementById("questioncount").style.display="block";
            document.getElementById("previous").style.display="block";
            document.getElementById("next").style.display="block";
            
           
            current=current+1;
            generateArray();
            
        }

        function nextquestion()
        {
            if(current<4)
            {
                current=current+1;
                createQuestion();
            }
        }

        function checkanswer()
        {
            
            userans[current]=this.id;
            console.log("user ans array"+userans);
        }

        function previousquestion()
        {
            console.log(current);
            if(current>0)
            {
                current=current-1;
                createQuestion();
        
            }
        }
        function generateArray()
        {
            var question=[0,1,2,3,4,5,6,7,8,9];
            display=[];
            var questionlength;
            for(var number=0;number<=4;number++)
            {
                questionlength=question.length;
                var x = Math.floor((Math.random() * 10) );
                while(x >= questionlength)
                {
                    x = Math.floor((Math.random() * 10) );
                }
                display[number]=question[x];
                question.splice(x,1);
                console.log("display array is:"+display);
            }
            createQuestion();

        }    
        function createQuestion()
        {
                    
                var num=display[current];
                correctans[current]=questions[num].answer;

                console.log("ans array is:"+correctans)

                document.getElementById("display-question").innerHTML=questions[num].text;
                document.getElementById("questioncount").innerHTML=current+1+"/5";
                var ans=document.getElementById("display-options");
                var tag="<div id='answer'>  <label id='label0' ><input type='radio' value='0' name='answer' id='0'>"+questions[num].options[0]+"</label>"+
                    "<br><label id='label1' ><input type='radio' value='1' name='answer' id='1'>"+questions[num].options[1]+"</label>"+
                    "<br><label id='label2' ><input type='radio' value='2' name='answer' id='2'>"+questions[num].options[2]+"</label>"+
                    "<br><label id='label3' ><input type='radio' value='3' name='answer' id='3'>"+questions[num].options[3]+"</label>"+"</div>"
            
                ans.innerHTML=tag;
                document.getElementById("1").addEventListener("click",checkanswer);
                document.getElementById("2").addEventListener("click",checkanswer);
                document.getElementById("3").addEventListener("click",checkanswer);
                document.getElementById("0").addEventListener("click",checkanswer);

                if(current==4)
                {
                    document.getElementById("next").style.display="none";
                    document.getElementById("submit").style.display="block";
                    return;
                }
                document.getElementById("next").style.display="block";
                document.getElementById("submit").style.display="none";
        }

    
}
)();
