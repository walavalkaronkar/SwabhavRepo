export class Student
{
    constructor(private rollNo:Number,private firstName:String)
    {

    }

    public get RollNo(){
        return this.rollNo;
    }

    public set RollNo(RollNo)
    {
        this.rollNo=RollNo;
    }

    public get FirstName(){
        return this.firstName;
    }

    public set FirstName(FirstName)
    {
        this.firstName = FirstName;
    }
}

export class Address
{
    constructor(private roomNumber:Number,private city:String)
    {

    }

    public get RoomNumber(){
        return this.roomNumber;
    }

    public set RoomNumber(RoomNumber)
    {
        this.roomNumber=RoomNumber;
    }

    public get City(){
        return this.city;
    }

    public set City(City)
    {
        this.city = City;
    }
}
