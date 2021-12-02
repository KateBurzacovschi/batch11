package class23;

public class FileTester {
    public static void main(String[] args) {
      File[]jv={new JavaFile(),new WordFile(),new PdfFile()}  ;
      for(File files:jv){
          files.Close();
          files.Edit();
          files.Open();
      }
    }
}
