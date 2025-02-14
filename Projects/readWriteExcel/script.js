const xlsx = require('xlsx');

const workbook = xlsx.readFile("dataFile.xlsx")

let worksheets = {}
for(const sheetName of workbook.SheetNames){
    worksheets[sheetName] = xlsx.utils.sheet_to_json(workbook.Sheets[sheetName]);
}

console.log("Json:\n", JSON.stringify(worksheets.Sheet1), "\n\n")

worksheets.Sheet1.push({
    "First Name":3,
    "Last Name":4,
    "Gender":"Male",
    "Country":"Ind",
    "Age":7,
    "Date":45701,
    "Id":11
})

console.log("Json:\n", JSON.stringify(worksheets.Sheet1), "\n\n")

xlsx.utils.sheet_add_json(workbook.Sheets["Sheet1"], worksheets.Sheet1)
xlsx.writeFile(workbook, "updatedData.xlsx")

const newExcel = xlsx.utils.book_new()
const newSheet = xlsx.utils.json_to_sheet(worksheets.Sheet1)
xlsx.utils.book_append_sheet(newExcel, newSheet, "SheetA")
xlsx.writeFile(newExcel, "createdExcel.xlsx")