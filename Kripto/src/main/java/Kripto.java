package com.mycompany.kripto;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Kripto {

    public static void main(String[] args) throws IOException {

        Timer timer = new Timer();
        timer.schedule(new KriptoTask(), 0, 20000);
    }

    static class KriptoTask extends TimerTask {

        public void run() {
            try {
                Document doc = Jsoup.connect("https://fcsapi.com/api-v3/forex/converter?symbol=BTC/USD&amount=200&access_key=API_KEY").get();
                String text = doc.text();

                System.out.println(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
