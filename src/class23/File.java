package class23;

public abstract class File {
    void Edit(){
        System.out.println("editing file");
    }
    void Close(){
        System.out.println("closing a file");
    }
    abstract void Open();
}
class JavaFile extends File{
    @Override
    void Open() {
        System.out.println("To open Java file we need notepad");
    }
}
class WordFile extends File{
    @Override
    void Open() {
        System.out.println("To open doc file we need MW to be installed");
    }
}
class PdfFile extends File{
    @Override
    void Open() {
        System.out.println("To open Pdf file we need Mw");
    }
}