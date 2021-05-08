package handsome.nothax.rickroll;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int i = 2;
        while(i>1) {
            try {
                String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
                java.net.URI uri = java.net.URI.create(url);
                java.awt.Desktop dp = java.awt.Desktop.getDesktop();
                if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                    dp.browse(uri);
                }
            } catch (NullPointerException | IOException e) {
                e.printStackTrace();
            }
            i ++;
            if(i == 69){ //haha 69 funny number uwu
                break;
            }
        }
    }
}
