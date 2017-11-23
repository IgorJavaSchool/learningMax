package lesson1.task1;

/**
 * Created by MM on 19.11.2017.
 */
public class Working {
    public static void main(String[] args) {
        Nail stillNail = new StillNail(10);
        Nail brassNail = new BrassNail(15);
        Nail plasticNail = new PlasticNail(20);
        Nail[] nails = {stillNail, brassNail, plasticNail};
        Hammer hammer = new Hammer(200);
        Magnet magnet = new Magnet(300);
        for (int i = 0; i < nails.length; i++) {
            hammer.hammerNails(nails[i]);
        }
        magnet.magnetize(nails);

    }
}
