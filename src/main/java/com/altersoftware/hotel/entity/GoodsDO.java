package com.altersoftware.hotel.entity;

import java.util.Date;

/**
 * @author czy@win10
 * @date 2020/1/20 15:58
 */
public class GoodsDO {

    /** 物品编号 */
    private long   id;
    /** 房间编号 */
    private String roomNumberListToString;
    /** 物品名称 */
    private String name;
    /** 物品采购时间 */
    private String buyTime;
    /** 物品采购价格 */
    private Double price;
    /** 物品损坏赔偿价格 */
    private Double compensationMoeny;
    /** 物品状态 */
    private String state;
    /** 创建时间 */
    private Date   createTime;
    /** 修改时间 */
    private Date   modifyTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getroomNumberList() {
        return roomNumberListToString;
    }

    public void setroomNumberList(String roomNumberList) {
        this.roomNumberListToString = roomNumberList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbuyTime() {
        return buyTime;
    }

    public void setbuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCompensationMoeny() {
        return compensationMoeny;
    }

    public void setCompensationMoeny(Double compensationMoeny) {
        this.compensationMoeny = compensationMoeny;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "GoodsDO{" +
            "id=" + id +
            ", roomNumberListToString=" + roomNumberListToString +
            ", name='" + name + '\'' +
            ", buyTime=" + buyTime +
            ", price=" + price +
            ", compensationMoeny=" + compensationMoeny +
            ", state=" + state +
            ", createTime=" + createTime +
            ", modifyTime=" + modifyTime +
            '}';
    }
}
