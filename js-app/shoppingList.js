
        var item=
        [
            {
                id:"101",
                itemname:"IPhone 2",
                price:"30000"
            },
            {
                id:"102",
                itemname:"IPhone 3",
                price:"40000"
            },
            {
                id:"103",
                itemname:"IPhone 4",
                price:"50000"
            },
            {
                id:"104",
                itemname:"IPhone 5",
                price:"60000"
            },
            {
                id:"105",
                itemname:"IPhone 6",
                price:"70000"
            },
            {
                id:"106",
                itemname:"IPhone 7",
                price:"80000"
            }
        ]
        
        var cart=[
            {
                columnid:"1",
                id:"105",
                name:"IPhone 6",
                quantity:"5",
                price:"70000",
                total:"350000"
            },
            {
                columnid:"2",
                id:"106",
                name:"IPhone 7",
                quantity:"5",
                price:"80000",
                total:"400000"
            },
        ];

        var cartStructure={
            columnid:"1",
            id:"105",
            name:"IPhone 6",
            quantity:"5",
            price:"70000",
            total:"350000"
        }
        
        document.getElementById("AddToCart").addEventListener("click",addToCart);
        function displaylist()
        {
            let selectList=document.getElementById("select-list");
            selectList.innerHTML+="<option value=''>Select</option>"
            for(let temp=0;temp<item.length;temp++)
            {
                selectList.innerHTML+="<option id='"+item[temp].id+"' value='"+item[temp].id+"'>"+item[temp].itemname+"-"+item[temp].price+"</option>";
            }

        }
        displaylist();

        function addToCart()
        {
            let itemId=document.getElementById("select-list").value;
            console.log(itemId);
            let quantity=document.getElementById("quantity").value;
            console.log(quantity);
            for(temp=0;temp<cart.length;temp++)
            {
                if(cart[temp].id==itemId)
                {
                    cart[temp].quantity=parseInt(cart[temp].quantity)+parseInt(quantity);
                    cart[temp].total=parseInt( cart[temp].quantity) * parseInt(cart[temp].price);
                    displayCart();
                    return;
                }
            }
            let length=cart.length;
            cartStructure.columnid=length;
            cartStructure.quantity=quantity;
            for(let temp=0;temp<item.length;temp++)
            {
                if(item[temp].id==itemId)
                {
                    cartStructure.id=item[temp].id;
                    cartStructure.price=item[temp].price;
                    cartStructure.name=item[temp].itemname,
                    cartStructure.total=parseInt( cartStructure.quantity)*parseInt(cartStructure.price);
                }
            }
            cart[length]=cartStructure;
            displayCart();


        }

        function displayCart()
        {
            var totalsum=0;
            var displayInTable=document.getElementById("show-cart");

            let displayTable="<tr><td>Number</td><td>Item</td><td>quantity</td><td>Unitprice</td><td>Total Price</td><td>Delete</td>";
            for(temp=0;temp<cart.length;temp++)
            {
                displayTable+="<tr id='"+cart[temp].id+"'>";
                displayTable+="<td>"+cart[temp].columnid+"</td>";
                displayTable+="<td>"+cart[temp].name+"</td>";
                displayTable+="<td>"+cart[temp].quantity+"</td>";
                displayTable+="<td>"+cart[temp].price+"</td>";
                displayTable+="<td>"+cart[temp].total+"</td>";
                displayTable+="<td><button id='"+cart[temp].columnid+"' class='delete' value='"+cart[temp].id+"'>Delete</button></td>";
                displayTable+="</tr>";
                totalsum=parseInt(totalsum)+parseInt(cart[temp].total);
            }
            displayTable+="<tr><td  colspan='4'>Total Amount</td><td colspan='2'>"+totalsum+"</td></tr>";
            displayInTable.innerHTML=""+displayTable;
            buttons=document.querySelectorAll(".delete");

            for(val=0;val<buttons.length;val++)
            {
                buttons[val].addEventListener("click",deleteItems);
            }
        }
        displayCart();

       
        var buttons=document.querySelectorAll(".delete");

        for(val=0;val<buttons.length;val++)
        {
            buttons[val].addEventListener("click",deleteItems);
        }

        function deleteItems()
        {
            console.log(document.getElementById(this.id).value);
            var productid=document.getElementById(this.id).value;
            let index;
            for(temp=0;temp<cart.length;temp++)
            {
                if(cart[temp].id==productid)
                {
                    index=temp;
                    
                }
            }
            cart.splice(index,1);
            console.log(cart);
            displayCart();

        }

