package Activity13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity13_2a {

	public static void writeExcel(String filePath) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook excel = new XSSFWorkbook();
		XSSFSheet sheet = excel.createSheet("New Sheet");
		
        List<String[]> data = new ArrayList<String[]>();
        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
	    String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};
        
        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);
		
        int rownum = 0;
    	
        for (String[] rowData : data) {
	
            Row row = sheet.createRow(rownum++);
            int cellnum = 0;
            for (String cellData : rowData) {
                Cell cell = row.createCell(cellnum++);
                cell.setCellValue(cellData);
            }
	
        }
	
        try {
            FileOutputStream out = new FileOutputStream(new File("C:\\Users\\DeepakNallu\\Desktop\\Full Stack\\Activity13_2a.csv"));
            excel.write(out);
            out.close();
            excel.close();	
        }
        catch (Exception e) {
	        e.printStackTrace();
        }
    }
	
    public void readExcel(String filePath) {
    	
        try {
	
            FileInputStream file = new FileInputStream("C:\\Users\\DeepakNallu\\Desktop\\Full Stack\\Activity13_2a.csv");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
	
            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
	
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
	
                    case NUMERIC: 
                        System.out.print(cell.getNumericCellValue() + " \t ");
                        break;
	
                    case STRING: 
                        System.out.print(cell.getStringCellValue() + " \t ");
                        break;
                    default:
	
                        System.out.println("Invalid value");
                        break;
	
                    }
	
                }
	
                System.out.println("");
	
            }
	
            file.close();
            workbook.close();
	
        }
	
        catch (Exception e) {
	
            e.printStackTrace();
	
        }
	
    }

    public static void main(String args[]) throws IOException {
	
        String filePath = "C:\\Users\\DeepakNallu\\Desktop\\Full Stack\\Activity13_2a.csv";
        Activity13_2a objExcelFile = new Activity13_2a();
	
        objExcelFile.writeExcel("C:\\Users\\DeepakNallu\\Desktop\\Full Stack\\Activity13_2a.csv");	
        objExcelFile.readExcel("C:\\Users\\DeepakNallu\\Desktop\\Full Stack\\Activity13_2a.csv");
	
    }
}
