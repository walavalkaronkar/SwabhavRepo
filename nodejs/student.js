"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(rollNo, firstName) {
        this.rollNo = rollNo;
        this.firstName = firstName;
    }
    Object.defineProperty(Student.prototype, "RollNo", {
        get: function () {
            return this.rollNo;
        },
        set: function (RollNo) {
            this.rollNo = RollNo;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "FirstName", {
        get: function () {
            return this.firstName;
        },
        set: function (FirstName) {
            this.firstName = FirstName;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
var Address = /** @class */ (function () {
    function Address(roomNumber, city) {
        this.roomNumber = roomNumber;
        this.city = city;
    }
    Object.defineProperty(Address.prototype, "RoomNumber", {
        get: function () {
            return this.roomNumber;
        },
        set: function (RoomNumber) {
            this.roomNumber = RoomNumber;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Address.prototype, "City", {
        get: function () {
            return this.city;
        },
        set: function (City) {
            this.city = City;
        },
        enumerable: true,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;
