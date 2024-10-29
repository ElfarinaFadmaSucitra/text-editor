import java.util.Scanner;

public class TeksEditor2 {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Simulasi Text Editor");
        System.out.println("Perintah: show, write <teks>, undo, redo, exit");

        while (true) {
            System.out.print("Masukkan perintah: ");
            command = scanner.nextLine();

            if (command.equals("show")) {
                editor.show();
            } else if (command.startsWith("write ")) {
                String textToWrite = command.substring(6);
                editor.write(textToWrite);
            } else if (command.equals("undo")) {
                editor.undo();
            } else if (command.equals("redo")) {
                editor.redo();
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Perintah tidak dikenali. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
