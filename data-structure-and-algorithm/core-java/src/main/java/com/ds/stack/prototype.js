function Employee(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

Employee.prototype.fullName = function(){
    return this.firstName+" "+this.lastName;
}

Employee.prototype.company = 'MPS';

var employee1 = new Employee('Chaman', 'Bharti');
var employee2 = new Employee('Saheel', 'Bharti');

console.log(employee1.fullName()+' '+employee1.company);//Chaman Bharti MPS
console.log(employee2.fullName()+' '+employee2.company);//Saheel Bharti MPS