interface Icustomer {
    _id: string;
    _firstname: string;
    _lastname: string;

}
function printCustomer(customer: Icustomer[]) {
    for (let c of customer) {
        console.log(c._id);
        console.log(c._firstname);
        console.log(c._lastname);
    }
}

printCustomer([{_id:"100",_firstname:"abcd",_lastname:"abcdd"}]);