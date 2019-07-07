console.log("hello");
//console.log(window);
console.log(typeof(this));
var myVariable="Onkar";
f1();
function f1()
{
    console.log("Inside f1");
}

var f2=function()
{
    console.log("Inside f2");
}
f2();

console.log(this);