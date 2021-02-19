/**
 * 
 */
 //if(year % 400 ==0 && (year % 100 !=0) || year % 4 ==0)
function leapYear(year){
	return (year % 400 == 0) ?(year % 100 != 0):(year % 4 == 0)
}
console.log(leapYear(2020));