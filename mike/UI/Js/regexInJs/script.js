console.log("Hello world");

// Testing the pattern for "hyd"
let exp = /hyd/;
console.log(exp.test("I'm in hyd"));  // true
console.log(exp.test("I'm in Hyderabad"));  // true
console.log(exp.test("I'm in hyderabad"));  // false (case-sensitive by default)


// Testing for string that starts with "hello"
let e2 = /^hello/;
console.log(e2.test("hello world"));  // true
console.log(e2.test("hllo0 world"));  // false
console.log(e2.test("hello0 world")); // true


// Testing for string that ends with "hello"
let e3 = /hello$/;
console.log("e3.test(world hello): " + e3.test("world hello"));  // true
console.log("e3.test(world cello): " + e3.test("world cello"));  // false
console.log("e3.test(orld hello0): " + e3.test("orld hello0"));  // false


console.log();

// Testing for exact match of "hello" (start and end of string)
let e4 = /^hello$/;
console.log("e4.test(hello): " + e4.test("hello"));  // true
console.log("e4.test(world hello): " + e4.test("world hello"));  // false
console.log("e4.test(world cello): " + e4.test("world cello"));  // false
console.log("e4.test(orld hello0): " + e4.test("orld hello0"));  // false


console.log();

// Testing the dot operator with a character in between
let dot = /r.b/;
console.log("dot.test(rcb): " + dot.test("rcb"));  // true
console.log("dot.test(rxb): " + dot.test("rxb"));  // true
console.log("dot.test(ryb): " + dot.test("ryb"));  // true
console.log("dot.test(rzb): " + dot.test("rzb"));  // true


console.log();

// Using the `s` flag to match newlines with dot `.` (dot matches newlines)
let multilineDot = /a.b/s; // Using 's' flag to make dot match newlines
console.log(multilineDot.test("a\nb"));  // true, because '.' matches '\n' now
console.log(multilineDot.test("a\nb\nc"));  // true, because '.' matches '\n'
console.log(multilineDot.test("abc"));  // true, single line match


// Testing `g` flag (Global) for multiple matches
let globalRegex = /ab/g;
let text = "ab ab ab";
let result = text.match(globalRegex);
console.log("Global match (ab in 'ab ab ab'): ", result); // ["ab", "ab", "ab"]

// More complex cases

// 1. **Digit Matching**
let digits = /\d+/;  // One or more digits
console.log(digits.test("1234"));  // true
console.log(digits.test("abc"));   // false
console.log(digits.test("123abc")); // true







// 2. **Extracting Digits with `match()`**
let textWithDigits = "The 0382025 year is 2025.";
let matchedDigits = textWithDigits.match(/\d+/); // Finds digits
// ['0382025', index: 4, input: 'The 0382025 year is 2025.', groups: undefined]
console.log(matchedDigits);  // ["2025"]





// 3. **Word Boundary `\b`**
let wordBoundary = /\bcat\b/;
console.log("/\bcat\b/ : ");

console.log(wordBoundary.test("the cat is here"));  // true
console.log(wordBoundary.test("the heycat is here"));  // false
console.log(wordBoundary.test("the catalogue is here"));  // false, as "cat" is part of "catalogue"


console.log();





// 4. **Matching Spaces**
let spaceRegex = /\s+/;  // Matches one or more spaces
console.log("Space regex");

console.log(spaceRegex.test("hello world")); // true
console.log(spaceRegex.test("helloworld  "));   // true
console.log(spaceRegex.test("helloworld "));   // false



console.log();




// 5. **Negative Lookahead (Matching if not followed by something)**
let negativeLookahead = /foo(?!bar)/;  // Matches "foo" only if it's not followed by "bar"
console.log("question mark regex");
console.log(negativeLookahead.test("foobar"));  // false
console.log(negativeLookahead.test("foo"));     // true
console.log(negativeLookahead.test("barfoo"));     // true



console.log();




// 6. **Positive Lookahead (Matching if followed by something)**
let positiveLookahead = /foo(?=bar)/;  // Matches "foo" only if it's followed by "bar"
console.log(positiveLookahead.test("foobar"));  // true
console.log(positiveLookahead.test("foo"));     // false





console.log();





// 7. **Capturing Groups (Extracting parts of a string)**
let groupRegex = /(\d+)\s(\w+)/;  // Capturing digits followed by a word
let groupMatch = "123 abc".match(groupRegex);
let groupMatch2 = "123 asdadas".match(groupRegex);

console.log(groupMatch);  // ["123 abc", "123", "abc"]
console.log(groupMatch2);  // ["123 abc", "123", "abc"]

console.log("Number: " + groupMatch[1] + ", Word: " + groupMatch[2]);





console.log();










// 8. **Non-capturing Groups**
let nonCapturingGroup = /(?:\d+)\s(?:\w+)/;  // Non-capturing group (doesn't save the matches)
let nonCapturedMatch = "123 abc".match(nonCapturingGroup);
console.log(nonCapturedMatch);  // ["123 abc"]

console.log();


let capturingGroup = /(\d+)\s(\w+)/;  // Capturing group (saves the matches)
let capturedMatch = "123 abc".match(capturingGroup);
console.log(capturedMatch);  // ["123 abc", "123", "abc"]




console.log();





// 9. **Matching Optional Characters**
let optionalCharacter = /colou?r/;  // "u" is optional in "color" vs "colour"
console.log(optionalCharacter.test("color"));  // true
console.log(optionalCharacter.test("colour")); // true






console.log();







// 10. **Matching Multiple Occurrences**
let multipleOccurences = /\d{2,4}/;  // Matches between 2 and 4 digits
console.log(multipleOccurences.test("12345")); // true (matches "1234")
console.log(multipleOccurences.test("12"));    // true (matches "12")
console.log(multipleOccurences.test("1"));     // false (does not match)





console.log();






// 11. **Matching Email Addresses (Basic)**
let emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
console.log(emailRegex.test("test@example.com"));  // true
console.log(emailRegex.test("invalid-email"));     // false




console.log();








// 12. **Matching URLs (Basic)**
let urlRegex = /https?:\/\/[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}(\/\S*)?/;
console.log(urlRegex.test("https://www.example.com"));  // true
console.log(urlRegex.test("ftp://example.com"));       // false



console.log();





// 13. **Matching Hexadecimal Colors**
let hexColorRegex = /#[0-9a-fA-F]{6}/;
console.log(hexColorRegex.test("#ff5733"));  // true
console.log(hexColorRegex.test("#f5f"));     // false (must be 6 characters)
console.log(hexColorRegex.test("ff5733"));   // false (missing #)




console.log();








// 14. **Matching Dates in a Specific Format (DD/MM/YYYY)**
let dateRegex = /^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/\d{4}$/;
console.log(dateRegex.test("25/12/2025"));  // true
console.log(dateRegex.test("31/02/2025"));  // false (invalid date)
console.log(dateRegex.test("12/12/202"));   // false (year should have 4 digits)
console.log(dateRegex.test("12/12/25"));    // false (year should have 4 digits)

console.log();

// Breakdown:
// 0[1 - 9]: Matches days from 01 to 09. This means the first digit is 0, and the second digit is any digit between 1 and 9.
// [12][0 - 9]: Matches days from 10 to 29. The first digit is either 1 or 2, followed by any digit from 0 to 9.
// 3[01]: Matches days 30 and 31. The first digit is 3, followed by either 0 or 1.

// Examples of valid days: 01, 15, 31

// \/ (Literal Slash /)
// The \/ matches a literal slash /.In regular expressions, the slash / is a special character, so we need to escape it with a backslash(\) to match the actual / in the date format.
//     Matches: /
//     (0[1 - 9] | 1[0 - 2])(Month)



// This part matches the month of the year, ensuring that it is between 01 and 12.
// Breakdown:
// 0[1 - 9]: Matches months from 01 to 09. The first digit is 0, and the second digit is any digit between 1 and 9.
// 1[0 - 2]: Matches months from 10 to 12. The first digit is 1, followed by a digit from 0 to 2.
// Examples of valid months: 01, 03, 12



// \/ (Literal Slash /)
// Similar to the previous part, this \/ matches a literal slash / between the month and year.
// \d{ 4 } (Year)
// \d: This matches any digit(0 - 9).
// { 4 }: This means exactly 4 digits.So this part ensures that the year is a 4 - digit number.
// Examples of valid years: 2025, 1999, 1800
