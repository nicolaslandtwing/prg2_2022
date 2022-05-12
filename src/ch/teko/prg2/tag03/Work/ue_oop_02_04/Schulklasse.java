package ch.teko.prg2.tag03.Work.ue_oop_02_04;

public class Schulklasse implements IStatistik {
    private double[] noten;

    public Schulklasse(double[] noten) {
        this.noten = noten;
    }

    @Override
    public double median() {
        double median = 0;
        double sum = 0;
        for (int i = 0; i < this.noten.length; i++) {
            sum+=this.noten[i];
        }
        median = sum/this.noten.length;

        return median;
    }

    @Override
    public double mittelwert() {
        double mittelwert = 0;
        if (this.noten.length % 2 == 0) {
            mittelwert = (this.noten[this.noten.length/2 -1] + this.noten [this.noten.length/2])/2;
        }
        else {
            mittelwert = this.noten[((this.noten.length+1)/2)-1];
        }
        return mittelwert;
    }
}
