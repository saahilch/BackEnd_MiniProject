package com.MiniProject.Entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String terms;
    private String partyName;
    private String sales;
    private String billNo;
    private String itemNo;
    private BigDecimal grossWt;
    private BigDecimal netWt;
    private BigDecimal diamondWt;
    private BigDecimal beedWt;
    private Integer qty;
    private BigDecimal netValue;
    private Double polishPercentage;
    private BigDecimal polishGm;
    private BigDecimal laborGm;
    private BigDecimal laborAmount;
    private BigDecimal per;
    private BigDecimal extraChg;
    private BigDecimal basic;
    private BigDecimal discountAmount;
    private Double discountPercentage;
    private BigDecimal taxAmt;
    private BigDecimal finalNetValue;
	public Sale(Long id, String date, String terms, String partyName, String sales, String billNo, String itemNo,
			BigDecimal grossWt, BigDecimal netWt, BigDecimal diamondWt, BigDecimal beedWt, Integer qty,
			BigDecimal netValue, Double polishPercentage, BigDecimal polishGm, BigDecimal laborGm,
			BigDecimal laborAmount, BigDecimal per, BigDecimal extraChg, BigDecimal basic, BigDecimal discountAmount,
			Double discountPercentage, BigDecimal taxAmt, BigDecimal finalNetValue) {
		super();
		this.id = id;
		this.date = date;
		this.terms = terms;
		this.partyName = partyName;
		this.sales = sales;
		this.billNo = billNo;
		this.itemNo = itemNo;
		this.grossWt = grossWt;
		this.netWt = netWt;
		this.diamondWt = diamondWt;
		this.beedWt = beedWt;
		this.qty = qty;
		this.netValue = netValue;
		this.polishPercentage = polishPercentage;
		this.polishGm = polishGm;
		this.laborGm = laborGm;
		this.laborAmount = laborAmount;
		this.per = per;
		this.extraChg = extraChg;
		this.basic = basic;
		this.discountAmount = discountAmount;
		this.discountPercentage = discountPercentage;
		this.taxAmt = taxAmt;
		this.finalNetValue = finalNetValue;
	}
	public Sale() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public BigDecimal getGrossWt() {
		return grossWt;
	}
	public void setGrossWt(BigDecimal grossWt) {
		this.grossWt = grossWt;
	}
	public BigDecimal getNetWt() {
		return netWt;
	}
	public void setNetWt(BigDecimal netWt) {
		this.netWt = netWt;
	}
	public BigDecimal getDiamondWt() {
		return diamondWt;
	}
	public void setDiamondWt(BigDecimal diamondWt) {
		this.diamondWt = diamondWt;
	}
	public BigDecimal getBeedWt() {
		return beedWt;
	}
	public void setBeedWt(BigDecimal beedWt) {
		this.beedWt = beedWt;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public BigDecimal getNetValue() {
		return netValue;
	}
	public void setNetValue(BigDecimal netValue) {
		this.netValue = netValue;
	}
	public Double getPolishPercentage() {
		return polishPercentage;
	}
	public void setPolishPercentage(Double polishPercentage) {
		this.polishPercentage = polishPercentage;
	}
	public BigDecimal getPolishGm() {
		return polishGm;
	}
	public void setPolishGm(BigDecimal polishGm) {
		this.polishGm = polishGm;
	}
	public BigDecimal getLaborGm() {
		return laborGm;
	}
	public void setLaborGm(BigDecimal laborGm) {
		this.laborGm = laborGm;
	}
	public BigDecimal getLaborAmount() {
		return laborAmount;
	}
	public void setLaborAmount(BigDecimal laborAmount) {
		this.laborAmount = laborAmount;
	}
	public BigDecimal getPer() {
		return per;
	}
	public void setPer(BigDecimal per) {
		this.per = per;
	}
	public BigDecimal getExtraChg() {
		return extraChg;
	}
	public void setExtraChg(BigDecimal extraChg) {
		this.extraChg = extraChg;
	}
	public BigDecimal getBasic() {
		return basic;
	}
	public void setBasic(BigDecimal basic) {
		this.basic = basic;
	}
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public Double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public BigDecimal getTaxAmt() {
		return taxAmt;
	}
	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}
	public BigDecimal getFinalNetValue() {
		return finalNetValue;
	}
	public void setFinalNetValue(BigDecimal finalNetValue) {
		this.finalNetValue = finalNetValue;
	}

    
}