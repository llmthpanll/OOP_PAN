import lab01.MyTextEditorModel;
import lab01.MyTextEditorView;

public class BookController {
    private BookView view;
    private BookModel model;

    public BookController() {
        view = new BookView();
        model = new BookModel();
    }

}
