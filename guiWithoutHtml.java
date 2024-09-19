import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;

public class guiWithoutHtml {
    public static void main(String[] args) {
        // Create a JFrame (window) with a title
        JFrame frame = new JFrame("Hello World HTML GUI");

        // Create a JEditorPane with HTML content
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setEditable(false);
        editorPane.setEditorKit(new HTMLEditorKit());
        editorPane.setText("<html><body><h1>Hello, World!</h1></body></html>");

        // Add the JEditorPane to the content pane of the frame
        frame.getContentPane().add(editorPane);

        // Set the size of the frame
        frame.setSize(300, 100);

        // Make the frame close when the close button is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
