const car = {
    make: "Toyota",
    model: "Corolla",
    year: 2021
}

const json_string = JSON.stringify(car)
const parsed_json_string = JSON.parse(json_string)

console.log(`JSON Stringified: ${json_string}.\nParsed_json_string: ${parsed_json_string}.\n\tMake: ${parsed_json_string.make}.\n\tModel: ${parsed_json_string.model}.\n\tYear: ${parsed_json_string.year}.`)
/*Expected Output:
JSON Stringified: {"make":"Toyota","model":"Corolla","year":2021}.
Parsed_json_string: [object Object].
	Make: Toyota.
	Model: Corolla.
	Year: 2021.
*/