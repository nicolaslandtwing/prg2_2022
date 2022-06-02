package ch.teko.prg2.tag05.W0rk.ue.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Linienplanung {
   private ArrayList<Bus> linie1 = new ArrayList<>();
   private ArrayList<Bus> linie2 = new ArrayList<>();

    public void addBus2Linie(Bus b, int i) {
    if (i == 1){
        this.linie1.add(b);
    }
    else-if (i ==2 ){
        this.linie2.add(b);
        }
    }

   public Bus getBusWithIDFromAnyLine(int internalBusID) {
       Iterator <Bus> iteratorlinie1 = linie1.iterator();
       Iterator <Bus> iteratorlinie2 = linie2.iterator();
       Bus b = null;

       while (iteratorlinie1.hasNext()) {
           if (iteratorlinie1.next().getInternalBusID() == internalBusID) {
               b = iteratorlinie1.next();
           }
       }
       while (iteratorlinie2.hasNext()) {
           if (iteratorlinie2.next().getInternalBusID() == internalBusID) {
               b = iteratorlinie2.next();
           }
       }
       return b;
   }


   public void removeBusFromAnyLine(int internalBusID) {
       Iterator <Bus> iteratorlinie1 = linie1.iterator();
       Iterator <Bus> iteratorlinie2 = linie2.iterator();
       Bus b = null;

       while (iteratorlinie1.hasNext()) {
           if (iteratorlinie1.next().getInternalBusID() == internalBusID) {
               iteratorlinie1.remove();
           }
       }
       while (iteratorlinie2.hasNext()) {
           if (iteratorlinie2.next().getInternalBusID() == internalBusID) {
               iteratorlinie2.remove();
           }
       }

   }

    @Override
    public String toString() {
        return "Linienplanung{" +
                "linie1=" + linie1 +
                ", linie2=" + linie2 +
                '}';
    }
}
