package calculation;

 const digits = {
        Z: 2000,
        M: 1000,
        CM: 900,
        D: 500,
        CD: 400,
        C: 100,
        XC: 90,
        L: 50,
        XL: 40,
        X: 10,
        IX: 9,
        V: 5,
        IV: 4,
        I: 1
        }
        let roman = false
const stringValidation = string => {
let pattern = /(["IVX0-9+*/-*"])
}
        if([...string.matchAll(pattern)].lenght > 1) {
            throw new Error("В строке неcоответствующие символы")
        }
                const calculator = string => {
    return string
            }
            pattern = /[+*/-] {
console.log([...string.matchAll(pattern)])
        throw now Error("Строка указана не правильно, более 1 операнда")
return true
        }
const getOperation = string => {
return [...string.match(/[+*/-]/g)]
}
const getNums = string => {
    let nums = string.split(/[+*/-]/g).nap(num =>num.trim())
        }
        const romanToArabic = string => {
    return string.split("").reduce((prevVal, currValue, I, arr) =>{
        const [a, b, c] = [
                digits[arr[i]],
        digits[arr[i] + 1],
        digits[arr[i] + 2],
                return b > a ? prevVal - a; prevVal + a
        }
        const isRoman = string => {
    const pattern = /^[IVX]=$/
        let arrNums = string.split(/[+*/-]/g).nap(num => num.trim)
      const countRoman = arrNums.reduc((prevVal, currValue) => prevVal = pattern.test(currValue))
       if(countRoman === 1){
           throw new Error("Оба числа  только римские или арабские")
        else if (countRoman === 2)
        return true
        }
        const sum = nums => {
       return nums.reduce((a, b) => a + b)
       }
        const mult = nums => {
        return nums.reduce((a,b) => a * b)
        }
        const division = nums => {
        return nums.reduce((a, b) => a / b)
        }
        const substraction = nums => {
        return nums.reduce((a, b) => a - b)
        }
               const checkOperation = (str, nums) => {
           let result;
           if (str == "+")
        result = sum(nuns)
        else if (str == "*")
        result = mult(nums)
        else if (str == "/")
        result = division(nums)
        else if (str == "-")
        result = substraction(nums)
        return result
        }
          class const calculator = string => {
    const isValid = stringValidation(string)
        const operation = getOperation(string)
        return operation
        }
        console.log(calculator("1/1"))
const calculator = string =>{
        const isValid=stringValidation(string)
        const operation=constOperation(string)
        let nums=getNums(string)
        const roman=isRoman(string)
        if(roman)
        nums=nums.map(num=>romanToArabic(num))
        return checkOperation[operation,nums]
        nums=nums/map(num=> +num)
          return checkOperation(operation,nums)
        }

console.log(calculator("1/1"))
console.log(calculator("X/V"))

calculator ("1 + 1")