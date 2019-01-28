package strings;

public class ReplaceAllTest {
    
    public static void main(String[] args) {
        
        String input = "d://cgbl_files/output\\DC_CPS_CRDP25_20190125_143343";
    
        System.out.println(input
            .toUpperCase()
            .replaceAll("\\\\", "%")
            .replaceAll("//", "%")
            .replace('/', '%'));
        
        
        
        
        
        
        
        
    }
    
}
