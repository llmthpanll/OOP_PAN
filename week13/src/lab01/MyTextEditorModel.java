package lab01;

import java.io.*;

public class MyTextEditorModel {
    private String text;

    public MyTextEditorModel() {
        this.text = "";
    }

    public void loadText(File f, MyTextEditorView view) {
        try (FileInputStream fin = new FileInputStream(f)) {
            int ch = fin.read();
            while (ch != -1) {
                view.getTextarea().setText(view.getTextarea().getText() + (char) ch);
                ch = fin.read();
            }
            System.out.println("Open...");
        } catch (Exception e) {
            System.out.println("Failed...");
        }
    }

    public void saveText(File f, MyTextEditorView view) {
        try (FileOutputStream fout = new FileOutputStream(f)) {
            for (int i = 0; i < view.getTextarea().getText().length(); i++) {
                fout.write(view.getTextarea().getText().charAt(i));
            }
            System.out.println("Save...");
        } catch (Exception e) {
            System.out.println("Failed...");
        }
    }
}
