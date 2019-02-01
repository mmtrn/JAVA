public class GeometrikSekil {
    private int en;
    private int boy;

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getEn() {
        return en;
    }

    @Override
    public String toString() {
        return "en Bilgisi : "+this.en+"Boy Bilgisi : "+this.boy;
    }
}
