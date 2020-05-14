import java.io.FileNotFoundException;

public class EmployeeExplorer {
    public static void main(String[] args) {
        final String fileName = "EmployeersCompany.csv";
        try{
            Employee[] employees = EmployeeDataReader.readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku o nazwie " + fileName);
        }
    }
}
