function printCustomer(customer) {
    for (var _i = 0, customer_1 = customer; _i < customer_1.length; _i++) {
        var c = customer_1[_i];
        console.log(c._id);
        console.log(c._firstname);
        console.log(c._lastname);
    }
}
printCustomer([{ _id: "100", _firstname: "abcd", _lastname: "abcdd" }]);
