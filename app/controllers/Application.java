package controllers;

import play.*;
import play.mvc.*;
import java.util.*;
import models.*;

import static play.modules.pdf.PDF.*;

public class Application extends Controller {

    public static void index() {
        Options options = new Options();
        options.filename = "omikuji";

        String result = getResult();

        renderPDF(options, result);
    }

    private static String getResult(){
      String[] kuji = {"Daikichi", "Chukichi", "Kichi", "Shokichi", "Kyo", "Daikyo"};
      Random rnd = new Random();
      int index = rnd.nextInt(kuji.length);
      return kuji[index];
    }
}