/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeinversiones;

/**
 *
 * @author jrozou
 */
public class Stock extends ShareAsset{
    protected int totalShare;

    public Stock(int totalShare, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShare = totalShare;
    }

    public int getTotalShare() {
        return totalShare;
    }

    public void setTotalShare(int totalShare) {
        this.totalShare = totalShare;
    }
    
    @Override
    public double getMarketValue(){
        return this.totalShare*this.currentPrice;
    }
    public double getProfit(){
        return (this.totalShare*this.currentPrice)-this.totalCost;
    }
}
