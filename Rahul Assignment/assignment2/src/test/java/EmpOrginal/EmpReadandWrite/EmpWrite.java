
	package EmpOrginal.EmpReadandWrite;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.LinkedHashMap;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class EmpWrite {
		public static void main(String[] args) throws IOException {
			// Read employee details from input Excel sheet
			FileInputStream file = new FileInputStream(new File(".\\src\\test\\Read.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheetAt(0);
			Map<String, String> employeeDetails = new LinkedHashMap<String, String>();
			for (Row row : sheet) 
			{
				Cell NameCell = row.getCell(0);
				Cell DepCell = row.getCell(1);
				if (NameCell != null && DepCell != null) {
					String Name = NameCell.getStringCellValue();
					String Dep = DepCell.getStringCellValue();
					employeeDetails.put(Name, Dep);
				}
			}
			file.close();	// till here it read the values from read xlsx.

			int id = 0;
						workbook = new XSSFWorkbook();
			sheet = workbook.createSheet("Employee Details");
			Row headerRow = sheet.createRow(0);
			headerRow.createCell(0).setCellValue("Employee ID");
			headerRow.createCell(1).setCellValue("Name");
			headerRow.createCell(2).setCellValue("Department");
			for (String Name : employeeDetails.keySet()) {
				if( Name.equalsIgnoreCase("Name")) {
					continue;
				}
				String Dep = employeeDetails.get(Name);
				
				id = id + 1;
		Row row = sheet.createRow(id);
				row.createCell(0).setCellValue(id);
				row.createCell(1).setCellValue(Name);
				row.createCell(2).setCellValue(Dep);
			}
			FileOutputStream outFile = new FileOutputStream(new File(".\\src\\output.xlsx"));
			System.out.println("Successfully");
			workbook.write(outFile);
			outFile.close();
		}
		
	}


