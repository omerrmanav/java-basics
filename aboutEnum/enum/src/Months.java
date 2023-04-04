public enum Months {
    Ocak(1),
    Şubat(2),
    Mart(3),
    Nisan(4),
    Mayıs(5),
    Haziran(6),
    Temmuz(7),
    Ağustos(8),
    Eylül(9),
    Ekim(10),
    Kasım(11),
    Aralık(12);

    private int months;

    Months(int months){
        this.months = months;
    }

    public int getMonth(){
        return months;
    }
}
