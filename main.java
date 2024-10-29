import java.util.ArrayList;
import java.util.List;

class TextEditor2 {
    private String currentText;
    private List<String> history;
    private int currentIndex;

public TextEditor2(){
    this.currentText = " ";
    this.history = new ArrayList<>();
    this.currentIndex = -1;
}
public void show() {
    System.out.println("Teks saat ini: " + currentText);
}
public void write(String text) {
    if (currentIndex < history.size() -1) {
        history.subList(currentIndex + 1, history.size()).clear();
    }
    history.add(currentText);
    currentIndex++;
    currentText += text;
}
public void undo () {
    if (currentIndex > 0) {
        currentIndex--;
        currentText = history.get(currentIndex);
    } else {
        System.out.println("Tidak ada perubahan untuk di-undo.");
    }
}
public void redo() {
    if (currentIndex < history.size() -1) {
        currentIndex++;
        currentText = history.get(currentIndex);
    } else {
        System.out.println("Tidak ada perubahan untuk di redo");
    }
}
}
