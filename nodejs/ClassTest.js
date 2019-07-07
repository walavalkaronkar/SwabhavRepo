class customer {
    constructor(id, firstname, lastname) {
        this._id = id;
        this._firstname = firstname;
        this._lastname = lastname;
    }
    get FirstName() {
        return this._firstname;
    }
    set FirstName(firstname) {
        this._firstname = firstname;
    }
    get LastName() {
        return this._lastname;
    }
    set LastName(lastname) {
        this._lastname = lastname;
    }
}
let c1 = new customer(101, "onkar", "wala");
console.log(c1.FirstName);
console.log(c1.LastName);
c1.FirstName = "mahesh";
console.log(c1.FirstName);
