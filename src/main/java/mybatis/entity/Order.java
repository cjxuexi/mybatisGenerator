package mybatis.entity;

public class Order {
    /**
     * ����ID
     */
    private Integer id;

    /**
     * 
     */
    private Integer orderyear;

    /**
     *  ����
     */
    private Integer orderprice;

    /**
     * 
     */
    private String customer;

    /**
     * ����ID
     * @return id ����ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ����ID
     * @param id ����ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return orderYear 
     */
    public Integer getOrderyear() {
        return orderyear;
    }

    /**
     * 
     * @param orderyear 
     */
    public void setOrderyear(Integer orderyear) {
        this.orderyear = orderyear;
    }

    /**
     * 
     * @return orderPrice 
     */
    public Integer getOrderprice() {
        return orderprice;
    }

    /**
     * 
     * @param orderprice 
     */
    public void setOrderprice(Integer orderprice) {
        this.orderprice = orderprice;
    }

    /**
     * 
     * @return customer 
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * 
     * @param customer 
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }
}