console.log("Hello");

const fruits = ["mik",1,2,3];
const veggie = [];

console.log(veggie);
console.log(veggie[0]); //undefined
console.log(typeof [1, 2, 3]);


console.log(fruits.length);
fruits.push("Mango");
fruits.push("Melonn");
console.log(fruits);

fruits.pop();

console.log(fruits);

fruits.unshift("Mikeeeeeeee");
console.log(fruits);


fruits.shift();

const nums = ["Hello",1,2,3,4,5];

console.log(nums);

// nums.splice(2,4); //for deleting

nums.splice(6,2,"hik","nik","hiii"); //for adding
            //-> len is 2 it can take any values
console.log(nums);


console.log(nums.slice(6,8));


const nums2 = ["Hello",1,2,3,4,5,6,7];

console.log(nums2.slice(6,8));

console.log(nums2);

console.log(nums2.slice(6,7));


