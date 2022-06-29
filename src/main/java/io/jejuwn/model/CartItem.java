package io.jejuwn.model;

import java.math.BigDecimal;

public class CartItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CART_ITEM.ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    private BigDecimal id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CART_ITEM.ITEM
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    private BigDecimal item;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CART_ITEM.CART_ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    private BigDecimal cartId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CART_ITEM.PRODUCT_ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    private BigDecimal productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CART_ITEM.CATEGORY
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    private BigDecimal category;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CART_ITEM.ID
     *
     * @return the value of CART_ITEM.ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CART_ITEM.ID
     *
     * @param id the value for CART_ITEM.ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CART_ITEM.ITEM
     *
     * @return the value of CART_ITEM.ITEM
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public BigDecimal getItem() {
        return item;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CART_ITEM.ITEM
     *
     * @param item the value for CART_ITEM.ITEM
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void setItem(BigDecimal item) {
        this.item = item;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CART_ITEM.CART_ID
     *
     * @return the value of CART_ITEM.CART_ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public BigDecimal getCartId() {
        return cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CART_ITEM.CART_ID
     *
     * @param cartId the value for CART_ITEM.CART_ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void setCartId(BigDecimal cartId) {
        this.cartId = cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CART_ITEM.PRODUCT_ID
     *
     * @return the value of CART_ITEM.PRODUCT_ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public BigDecimal getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CART_ITEM.PRODUCT_ID
     *
     * @param productId the value for CART_ITEM.PRODUCT_ID
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CART_ITEM.CATEGORY
     *
     * @return the value of CART_ITEM.CATEGORY
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public BigDecimal getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CART_ITEM.CATEGORY
     *
     * @param category the value for CART_ITEM.CATEGORY
     *
     * @mbg.generated Wed Jun 29 20:14:37 KST 2022
     */
    public void setCategory(BigDecimal category) {
        this.category = category;
    }
}