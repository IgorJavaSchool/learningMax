package yanevskyy.lesson1.abstractClassAndInterface;

import yanevskyy.lesson1.abstractClassAndInterface.instruments.Hammer;
import yanevskyy.lesson1.abstractClassAndInterface.instruments.Hammerable;
import yanevskyy.lesson1.abstractClassAndInterface.instruments.Magnet;
import yanevskyy.lesson1.abstractClassAndInterface.instruments.Magnetable;
import yanevskyy.lesson1.abstractClassAndInterface.nails.BrassNail;
import yanevskyy.lesson1.abstractClassAndInterface.nails.Nail;
import yanevskyy.lesson1.abstractClassAndInterface.nails.PlasticNail;
import yanevskyy.lesson1.abstractClassAndInterface.nails.StillNail;

/**
 * Created by MM on 19.11.2017.
 */
public class Working {
    public static void main(String[] args) {
        Nail stillNail = new StillNail();
        Nail brassNail = new BrassNail();
        Nail plasticNail = new PlasticNail();
        Nail[] nails = {stillNail, brassNail, plasticNail};
        Hammerable hammer = new Hammer();
        Magnetable magnet = new Magnet();
        for (int i = 0; i < nails.length; i++) {
            hammer.hammerNails(nails[i]);
        }
        magnet.magnetize(nails);

    }
}
