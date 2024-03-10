package exercisebookmanager;

import jdk.jshell.spi.SPIResolutionException;

import javax.swing.undo.AbstractUndoableEdit;
import java.util.ArrayList;

public class TextBook extends Book{

    private boolean state;

    public TextBook(String bookCode, String type, MyDate importDate, double unitPrice, int numberOfBooks, String publisher, boolean state) {
        super(bookCode,type, importDate, unitPrice, numberOfBooks, publisher);
        this.state = state;
    }


    public boolean isNew() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double totalPrice(){
        if(isNew()){
            return this.getUnitPrice() * this.getNumberOfBooks();
        }
        else{
            return this.getUnitPrice() * this.getNumberOfBooks() * (1 - (double)50/100);
        }
    }
}
