/*
Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

 */
public class Main {
    public static void main(String[] args) {

        int[] iDefaultArr = {1, 2, 3, 4, 5};
        double fSumHarmanicVal = 0.0;

        for (int i : iDefaultArr) {
            fSumHarmanicVal += 1.0 / i;
        }
        System.out.println("Dizi uzunluğu\t" + iDefaultArr.length + "\n" +
                "Harmonik seri\t" + fSumHarmanicVal + "\n" +
                "Sonuç :  " + iDefaultArr.length / fSumHarmanicVal);
    }
}