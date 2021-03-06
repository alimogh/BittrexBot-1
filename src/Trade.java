public class Trade {

    public Trade(String name, String pair1, String pair2, double bid, double ask, double baseVolume, double minTradeSize){
        m_Name = name;
        m_Pair1 = pair1;
        m_Pair2 = pair2;
        m_Bid = bid;
        m_Ask = ask;
        m_BaseVolume = baseVolume;
        m_Rank = ((m_Ask - m_Bid) / m_Bid) * m_BaseVolume;
        m_MinTradeSize = minTradeSize;
    }

    public Trade(String name, double bid, double ask, double baseVolume, double minTradeSize){
        m_Name = name;

        String[] names = name.split("-");
        m_Pair1 = names[0];
        m_Pair2 = names[1];
        m_Bid = bid;
        m_Ask = ask;
        m_BaseVolume = baseVolume;
        m_Rank = ((m_Ask - m_Bid) / m_Bid) * m_BaseVolume;
        m_MinTradeSize = minTradeSize;
    }

    private String m_Name;

    public String getPair1() {
        return m_Pair1;
    }

    public String getPair2() {
        return m_Pair2;
    }

    private String m_Pair1;
    private String m_Pair2;

    public double getBid() {
        return m_Bid;
    }

    private double m_Bid;

    public double getAsk() {
        return m_Ask;
    }

    private double m_Ask;
    private double m_BaseVolume;
    private double m_Rank;
    private double m_MinTradeSize;

    private double m_PricePerUnit;
    private String m_orderType;
    private String m_Closed;

    public void setPricePerUnit(double m_PricePerUnit) {
        this.m_PricePerUnit = m_PricePerUnit;
    }

    public void setorderType(String m_orderType) {
        this.m_orderType = m_orderType;
    }

    public void setClosed(String m_Closed) {
        this.m_Closed = m_Closed;
    }

    public double getPricePerUnit() {
        return m_PricePerUnit;
    }

    public String getorderType() {
        return m_orderType;
    }

    public String getClosed() {
        return m_Closed;
    }



    public String getName() {
        return m_Name;
    }

    public double getRank() {
        return m_Rank;
    }

    public double getMinTradeSize() { return m_MinTradeSize; }
}
