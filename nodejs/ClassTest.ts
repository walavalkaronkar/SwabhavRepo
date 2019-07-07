class customer{
        private _id:number;
        private  _firstname:string;
        private _lastname:string;

        constructor(id:number,firstname:string,lastname:string)
        {
            this._id=id;
            this._firstname=firstname;
            this._lastname=lastname;
        }

        public get FirstName()
        {
            return this._firstname;
        }

        public set FirstName(firstname:string)
        {
            this._firstname=firstname
        }

        public get LastName()
        {
            return this._lastname;
        }

        public set LastName(lastname:string)
        {
            this._lastname=lastname
        }

}

let c1=new customer(101,"onkar","walavalkar");
console.log(c1.FirstName);
console.log(c1.LastName);

c1.FirstName="mahesh";
console.log(c1.FirstName);