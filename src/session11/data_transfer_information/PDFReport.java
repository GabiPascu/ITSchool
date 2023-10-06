package session11.data_transfer_information;

public class PDFReport extends Report implements PDFExportable {

    @Override
    public void displayMetadata() {
        super.displayMetadata();
    }

    //it's not mandatory to override this method
    @Override
    public void showPreview() {


    }

    @Override
    public void exportToPdf() {

    }
}
