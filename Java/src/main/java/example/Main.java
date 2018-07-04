package example;

import org.podpage.worte.WorteAPI;

import java.io.IOException;

public class Main {

    public static void main(String... args) {

        WorteAPI worteAPI = new WorteAPI("187b38b7-94b0-429a-a4d2-7ab17d3cdba6");

        try {
            System.out.println(worteAPI.getStatus());
            System.out.println(worteAPI.analyze("Die Allnatur aber hat außerhalb ihres eigenen Kreises nichts. Das ist gerade das Bewundernswerte an ihrer Kunstfertigkeit, daß sie in ihrer Selbstbegrenzung alles, was in ihr zu verderben, zu veralten und unbrauchbar zu werden droht, in ihr eigenes Wesen umwandelt und eben daraus wieder andere neue Gegenstände bildet. Sie bedarf zu diesem Zweck ebensowenig eines außer ihr befindlichen Stoffes, als sie eine Stätte nötig hat, um das Morsche dorthin zu werfen. Sie hat vielmehr an ihrem eigenen Raum, ihrem eigenen Stoff und an ihrer eigenen Kunstfertigkeit genug."));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
